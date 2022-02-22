package ro.kofe.swapi.presenter.ipv.film

import ro.kofe.swapi.presenter.ipv.IPresenter

interface IFilmPresenter: IPresenter<IFilmView> {
    fun showFilm()
}