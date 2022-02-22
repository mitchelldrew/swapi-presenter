package ro.kofe.swapi.presenter.ipv.people

import ro.kofe.swapi.presenter.ipv.IInteractor

interface IPeopleInteractor: IInteractor<IPeopleView> {
    fun peopleButtonPressed()
}