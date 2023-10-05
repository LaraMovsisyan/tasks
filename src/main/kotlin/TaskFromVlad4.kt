fun main() {
    //Задание 1.
    val car1 = Car("Lamborghini", "белый", 2023)
    val car2 = Car("BMW", "черный", 2023)
    car1.drive()
    car2.drive()

    //Задание 2.
    for (day in DayOfWeek.values()) {
        println(day.name)
    }
}

class Car(val model: String, val color: String, val year: Int) {
    fun drive() {
        println("Влад купил $model цвета $color $year года.")
    }
}

enum class DayOfWeek {
    ПОНЕДЕЛЬНИК, ВТОРНИК, СРЕДА, ЧЕТВЕРГ, ПЯТНИЦА, СУББОТА, ВОСКРЕСЕНЬЕ
}
