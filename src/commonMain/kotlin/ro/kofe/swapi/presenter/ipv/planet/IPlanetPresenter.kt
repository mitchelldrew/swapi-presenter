package ro.kofe.swapi.presenter.ipv.planet

import ro.kofe.swapi.presenter.ipv.IPresenter

interface IPlanetPresenter: IPresenter<IPlanetView> {
    fun showPlanet()
}