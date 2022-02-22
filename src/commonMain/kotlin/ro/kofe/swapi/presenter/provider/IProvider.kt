package ro.kofe.swapi.presenter.provider

interface IProvider<T> {
    fun get()
    fun addListener(listener: IProviderListener<T>)
    fun removeListener(listener: IProviderListener<T>)
}