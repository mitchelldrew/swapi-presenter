package ro.kofe.swapi.presenter.ipv.planet

import ro.kofe.swapi.presenter.ipv.IInteractor

interface IPlanetInteractor: IInteractor<IPlanetView> {
    fun planetButtonPressed()
}