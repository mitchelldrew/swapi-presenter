package ro.kofe.swapi.presenter

expect class Freezer: ro.kofe.swapi.presenter.IFreezer {
    override fun freeze(obj:Any):Any
}