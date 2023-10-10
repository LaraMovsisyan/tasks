package oop

class Car(val model: String, val color: String, val year: Int) {
    fun drive() {
        println("Вожу машину " + model + " цвета " + color + " " + year + " года выпуска.")
    }
}

fun main() {
    val car1 = Car("Tesla Model 3", "Красный", 2022)
    val car2 = Car("Toyota Corolla", "Синий", 2021)
    car1.drive()
    car2.drive()
}
