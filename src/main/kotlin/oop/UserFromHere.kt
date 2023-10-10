package oop

data class UserFromHere(val name: String, val age: Int) {
    fun printInfo() {
        println("Имя: " + name + ", Возраст: " + age)
    }
}

fun main() {
    val user = UserFromHere("Влад", 25)
    user.printInfo()
}
