package oop

class Mammal {
    fun breastfeed() {
        println("Кормлю молоком")
    }
}

class CanFly {
    fun fly() {
        println("Летаю")
    }
}

class Bat {
    private val mammal = Mammal()
    private val canFly = CanFly()

    fun breastfeed() {
        mammal.breastfeed()
    }

    fun fly() {
        canFly.fly()
    }
}

fun main() {
    val bat = Bat()
    bat.breastfeed()
    bat.fly()
}
