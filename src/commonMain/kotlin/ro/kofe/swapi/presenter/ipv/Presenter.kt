package ro.kofe.swapi.presenter.ipv

import ro.kofe.swapi.presenter.provider.ILoggingProvider

abstract class Presenter<V: IView>(
    internal var view: V?,
    loggingProvider: ILoggingProvider?,
    logTag:String
): SwapiObj(loggingProvider,logTag), IPresenter<V> {

    override fun shutdown() {
        super.shutdown()
        view = null
    }

    override fun setView(view: V) {
        log("setView")
        this.view = view
    }
}