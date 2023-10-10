package oop

sealed class MathOperation

class Add : MathOperation()
class Subtract : MathOperation()
class Multiply : MathOperation()
class Divide : MathOperation()

fun calculate(operation: MathOperation, num1: Double, num2: Double): Double {
    return when (operation) {
        is Add -> num1 + num2
        is Subtract -> num1 - num2
        is Multiply -> num1 * num2
        is Divide -> if (num2 != 0.0) num1 / num2 else throw Exception("нельзя!")
    }
}

fun main() {
    println("Сложение: " + calculate(Add(), 5.0, 3.0))
    println("Вычитание: " + calculate(Subtract(), 5.0, 3.0))
    println("Умножение: " + calculate(Multiply(), 5.0, 3.0))
    println("Деление: " + calculate(Divide(), 5.0, 3.0))
}
