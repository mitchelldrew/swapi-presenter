package ro.kofe.swapi.presenter.ipv.film

import ro.kofe.swapi.model.Film
import ro.kofe.swapi.model.LogTag.FILM_PRESENTER
import ro.kofe.swapi.model.People
import ro.kofe.swapi.presenter.IFreezer
import ro.kofe.swapi.presenter.ipv.Presenter
import ro.kofe.swapi.presenter.provider.ILoggingProvider
import ro.kofe.swapi.presenter.provider.IProvider
import ro.kofe.swapi.presenter.provider.IProviderListener


class FilmPresenter(
    private val freezer: IFreezer,
    private var filmProvider: IProvider<Film>?,
    loggingProvider: ILoggingProvider
) : IFilmPresenter, Presenter<IFilmView>(
    null,
    loggingProvider,
    FILM_PRESENTER
) {
    private var filmListener: IProviderListener<Film>? = null


    private fun attachListeners() {
        filmListener = getFilmListener()
        freezer.freeze(filmListener!!)
        filmProvider?.addListener(filmListener!!)
    }

    private fun getFilmListener(): IProviderListener<Film> {
        return object : IProviderListener<Film> {
            override fun onReceive(elements: List<Film>) {
                view?.display(elements)
            }

            override fun onError(error: Exception) {
                view?.error(error)
            }
        }
    }

    override fun showFilm() {
        filmProvider?.get()
    }

    override fun setView(view: IFilmView) {
        this.view = view
        attachListeners()
    }

    override fun shutdown() {
        filmListener?.let { filmProvider?.removeListener(it) }
        view = null
    }
}