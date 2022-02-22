package ro.kofe.swapi.presenter.ipv

interface IPresenter<V: IView> {
    fun setView(view:V)
    fun shutdown()
}