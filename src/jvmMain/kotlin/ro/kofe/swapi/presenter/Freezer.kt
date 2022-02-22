package ro.kofe.swapi.presenter

actual class Freezer: ro.kofe.swapi.presenter.IFreezer {
    actual override fun freeze(obj: Any): Any {
        return obj
    }
}