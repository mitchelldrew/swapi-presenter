package ro.kofe.swapi.presenter.ipv.people

import ro.kofe.swapi.model.People
import ro.kofe.swapi.presenter.ipv.IView

interface IPeopleView: IView {
    fun display(people:List<People>)
}