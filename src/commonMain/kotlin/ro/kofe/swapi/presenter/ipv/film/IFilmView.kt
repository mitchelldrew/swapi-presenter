package ro.kofe.swapi.presenter.ipv.film

import ro.kofe.swapi.model.Film
import ro.kofe.swapi.presenter.ipv.IView

interface IFilmView: IView {
    fun display(people:List<Film>)
}