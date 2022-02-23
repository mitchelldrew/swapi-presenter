package ro.kofe.swapi.presenter.ipv.planet

import ro.kofe.swapi.model.LogTag.PEOPLE_INTERACTOR
import ro.kofe.swapi.model.LogTag.PLANET_INTERACTOR
import ro.kofe.swapi.presenter.ipv.Interactor
import ro.kofe.swapi.presenter.provider.ILoggingProvider

class PlanetInteractor(
    presenter: IPlanetPresenter,
    loggingProvider: ILoggingProvider
) : IPlanetInteractor,
    Interactor<IPlanetView, IPlanetPresenter>
        (
        presenter,
        loggingProvider,
        PLANET_INTERACTOR
    ) {
    override fun planetButtonPressed() {
        presenter?.showPlanet()
    }
}