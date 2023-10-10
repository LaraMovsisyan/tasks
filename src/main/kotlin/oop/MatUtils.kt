package oop

class MathUtils {
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun add(a: Int, b: Int, c: Int): Int {
        return a + b + c
    }
}

fun main() {
    val mathUtils = MathUtils()

    println(mathUtils.add(1, 2))
    println(mathUtils.add(1, 2, 3))
}
