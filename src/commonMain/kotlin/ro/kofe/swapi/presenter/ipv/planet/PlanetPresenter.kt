package ro.kofe.swapi.presenter.ipv.planet

import ro.kofe.swapi.model.People
import ro.kofe.swapi.model.Planet
import ro.kofe.swapi.presenter.IFreezer
import ro.kofe.swapi.presenter.provider.IProvider
import ro.kofe.swapi.presenter.provider.IProviderListener


class PlanetPresenter(
    private val freezer: IFreezer,
    private var planetProvider: IProvider<Planet>?
) : IPlanetPresenter {
    private var view: IPlanetView? = null
    private var planetListener: IProviderListener<Planet>? = null


    private fun attachListeners() {
        planetListener = getPlanetListener()
        freezer.freeze(planetListener!!)
        planetProvider?.addListener(planetListener!!)
    }

    private fun getPlanetListener(): IProviderListener<Planet> {
        return object : IProviderListener<Planet> {
            override fun onReceive(elements: List<Planet>) {
                view?.display(elements)
            }

            override fun onError(error: Exception) {
                view?.error(error)
            }
        }
    }

    override fun showPlanet() {
        planetProvider?.get()
    }

    override fun setView(view: IPlanetView) {
        this.view = view
        attachListeners()
    }

    override fun shutdown() {
        planetListener?.let { planetProvider?.removeListener(it) }
        view = null
    }
}