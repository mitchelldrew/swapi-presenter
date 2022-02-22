package ro.kofe.swapi.presenter.ipv.people

import ro.kofe.swapi.model.LogTag.PEOPLE_INTERACTOR
import ro.kofe.swapi.presenter.ipv.Interactor
import ro.kofe.swapi.presenter.provider.ILoggingProvider

class PeopleInteractor(
    presenter: IPeoplePresenter,
    loggingProvider: ILoggingProvider
) : IPeopleInteractor,
    Interactor<IPeopleView, IPeoplePresenter>
        (
        presenter,
        loggingProvider,
        PEOPLE_INTERACTOR
    ) {

    override fun peopleButtonPressed() {
        presenter?.showPeople()
    }
}