package oop

open class Animal {
    open fun makeSound() {
        println("cdfdcghj")
    }
}

class Dog : Animal() {
    override fun makeSound() {
        println("Гав")
    }
}

class Cat : Animal() {
    override fun makeSound() {
        println("Мяу")
    }
}

fun main() {
    val dog = Dog()
    val cat = Cat()

    dog.makeSound()
    cat.makeSound()
}
