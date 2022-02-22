package ro.kofe.swapi.presenter.ipv.planet

import ro.kofe.swapi.model.Planet
import ro.kofe.swapi.presenter.ipv.IView

interface IPlanetView: IView {
    fun display(planets:List<Planet>)
}