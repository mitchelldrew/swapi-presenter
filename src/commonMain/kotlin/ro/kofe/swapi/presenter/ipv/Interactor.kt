package ro.kofe.swapi.presenter.ipv

import ro.kofe.swapi.presenter.provider.ILoggingProvider

abstract class Interactor<V: IView, P: IPresenter<V>>(
    internal var presenter: P?,
    loggingProvider: ILoggingProvider?,
    logTag:String
): SwapiObj(loggingProvider,logTag), IInteractor<V> {

    override fun viewPaused() {
        log("viewPaused")
    }

    override fun viewResumed() {
        log("viewResumed")
    }

    override fun setView(view: V) {
        log("setView: $view")
        presenter?.setView(view)
    }

    override fun shutdown() {
        super.shutdown()
        presenter = null
    }
}