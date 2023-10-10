package oop

interface Flyable {
    fun fly()
}

class Bird : Flyable {
    override fun fly() {
        println("Птица летит")
    }
}

class Airplane : Flyable {
    override fun fly() {
        println("Самолет летит")
    }
}

fun main() {
    val bird = Bird()
    bird.fly()

    val airplane = Airplane()
    airplane.fly()
}
