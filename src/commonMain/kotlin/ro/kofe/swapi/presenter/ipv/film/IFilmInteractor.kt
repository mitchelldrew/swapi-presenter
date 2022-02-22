package ro.kofe.swapi.presenter.ipv.film

import ro.kofe.swapi.presenter.ipv.IInteractor

interface IFilmInteractor: IInteractor<IFilmView> {
    fun filmButtonPressed()
}