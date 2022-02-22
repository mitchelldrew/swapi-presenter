package ro.kofe.swapi.presenter.provider


interface IProviderListener<T>{
    fun onReceive(elements:List<T>)
    fun onError(error:Exception)
}