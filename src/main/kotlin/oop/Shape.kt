package oop

abstract class Shape {
    abstract fun area(): Double
}

class Circle(val radius: Double) : Shape() {
    override fun area() = 3.14 * radius * radius
}

class Rectangle(val width: Double, val height: Double) : Shape() {
    override fun area() = width * height
}

fun main() {
    val myCircle = Circle(3.0)
    val myRectangle = Rectangle(2.0, 4.0)

    println("Площадь круга: " + myCircle.area())
    println("Площадь прямоугольника: " + myRectangle.area())
}
