package oop

enum class DayOfWeek {
    ПОНЕДЕЛЬНИК, ВТОРНИК, СРЕДА, ЧЕТВЕРГ, ПЯТНИЦА, СУББОТА, ВОСКРЕСЕНЬЕ
}

object Singleton {
    fun printMessage() {
        println("Спасибо,Влад!")
    }
}

fun main() {
    DayOfWeek.values().forEach {
        println(it.name)
    }

    Singleton.printMessage()
}