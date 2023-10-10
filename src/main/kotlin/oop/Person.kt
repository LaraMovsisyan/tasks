package oop

class Person(private var name: String, private var age: Int) {
    fun getName() = name
    fun getAge() = age

    var personName: String
        get() = name
        set(value) {
            if (value.isNotBlank()) {
                name = value
            }
        }

    var personAge: Int
        get() = age
        set(value) {
            if (value >= 0) {
                age = value
            } else {
                println("Ошибка: Нельзя установить отрицательный возраст.")
            }
        }
}

fun main() {
    val person = Person("Влад", 25)

    println("Имя: " + person.getName())
    println("Возраст: " + person.getAge())

    person.personName = "Лара"
    person.personAge = 28

    println("Имя после: " + person.getName())
    println("Возраст после: " + person.getAge())

    person.personAge = -5
}
