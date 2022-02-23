package ro.kofe.swapi.presenter.ipv.film

import ro.kofe.swapi.model.LogTag.FILM_INTERACTOR
import ro.kofe.swapi.model.LogTag.PEOPLE_INTERACTOR
import ro.kofe.swapi.presenter.ipv.Interactor
import ro.kofe.swapi.presenter.provider.ILoggingProvider

class FilmInteractor(
    presenter: IFilmPresenter,
    loggingProvider: ILoggingProvider
) : IFilmInteractor,
    Interactor<IFilmView, IFilmPresenter>
        (
        presenter,
        loggingProvider,
        FILM_INTERACTOR
    ) {
    override fun filmButtonPressed() {
        presenter?.showFilm()
    }
}