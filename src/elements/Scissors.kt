package elements

import Suit

class Scissors(name: String) : Suit(name) {

    override fun loseTo(): String {
        return StringContainer.rock
    }

    override fun winFrom(): String {
        return StringContainer.paper
    }

    override fun drawFrom(): String {
        return this.name
    }

}