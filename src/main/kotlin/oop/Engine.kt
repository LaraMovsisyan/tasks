package oop

class Engine {
    fun start() {
        println("sdfd")
    }
}

class Tires {
    fun inflate() {
        println("sdfeg")
    }
}

class Car2(private val engine: Engine, private val tires: Tires) {
    fun drive() {
        engine.start()
        tires.inflate()
        println("sdf")
    }
}

fun main() {
    val engine = Engine()
    val tires = Tires()
    val car = Car2(engine, tires)

    car.drive()
}
