package ro.kofe.swapi.presenter

import kotlin.native.concurrent.freeze

actual class Freezer : ro.kofe.swapi.presenter.IFreezer {
    actual override fun freeze(obj: Any): Any {
        return obj.freeze()
    }
}