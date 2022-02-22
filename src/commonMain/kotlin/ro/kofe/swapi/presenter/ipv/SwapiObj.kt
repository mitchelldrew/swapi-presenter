package ro.kofe.swapi.presenter.ipv

import ro.kofe.swapi.presenter.provider.ILoggingProvider

abstract class SwapiObj(
    private var loggingProvider: ILoggingProvider?,
    private val logTag: String
) {

    internal fun log(message:String){
        loggingProvider?.log(logTag,message)
    }

    open fun shutdown(){
        log("shutdown")
        loggingProvider = null
    }
}