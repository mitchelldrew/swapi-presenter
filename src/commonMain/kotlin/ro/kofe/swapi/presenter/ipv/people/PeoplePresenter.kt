package ro.kofe.swapi.presenter.ipv.people

import ro.kofe.swapi.model.LogTag.PEOPLE_PRESENTER
import ro.kofe.swapi.model.People
import ro.kofe.swapi.presenter.IFreezer
import ro.kofe.swapi.presenter.ipv.Presenter
import ro.kofe.swapi.presenter.provider.ILoggingProvider
import ro.kofe.swapi.presenter.provider.IProvider
import ro.kofe.swapi.presenter.provider.IProviderListener


class PeoplePresenter(
    private val freezer: IFreezer,
    private var peopleProvider: IProvider<People>?,
    loggingProvider: ILoggingProvider
) : IPeoplePresenter, Presenter<IPeopleView>(
    null,
    loggingProvider,
    PEOPLE_PRESENTER
) {
    private var peopleListener: IProviderListener<People>? = null


    private fun attachListeners() {
        peopleListener = getPeopleListener()
        freezer.freeze(peopleListener!!)
        peopleProvider?.addListener(peopleListener!!)
    }

    private fun getPeopleListener(): IProviderListener<People> {
        return object : IProviderListener<People> {
            override fun onReceive(elements: List<People>) {
                view?.display(elements)
            }

            override fun onError(error: Exception) {
                view?.error(error)
            }
        }
    }

    override fun showPeople() {
        peopleProvider?.get()
    }

    override fun setView(view: IPeopleView) {
        this.view = view
        attachListeners()
    }

    override fun shutdown() {
        peopleListener?.let { peopleProvider?.removeListener(it) }
        view = null
    }
}