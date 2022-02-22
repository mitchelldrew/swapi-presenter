package ro.kofe.swapi.presenter.ipv.people

import ro.kofe.swapi.presenter.ipv.IPresenter

interface IPeoplePresenter: IPresenter<IPeopleView> {
    fun showPeople()
}