fun main() {
    // 1. Создала список чисел от 1 до 10
    val numbers = (1..10).toList()
    val evenNumbersDoubled = numbers.filter { it % 2 == 0 }.map { it * 2 }
    println(evenNumbersDoubled)

    // 2. Создала список строк
    val words = listOf("один", "два", "три", "четыре", "пять")
    val lengths = words.map { it.length }
    println(lengths)

    // 3. Функция высшего порядка
    fun transformNumber(number: Int, transformation: (Int) -> String): String {
        return transformation(number)
    }
    println(transformNumber(5) { it.toString() })

    // 4. Лямбда-функция
    val square: (Int) -> Int = { it * it }
    fun describeSquare(number: Int): String {
        return "$number и его квадрат равен ${square(number)}"
    }
    println(describeSquare(5))

    // 5. Класс Person и фильтрация
    data class Person(val name: String, val age: Int)
    val people = listOf(
        Person("Vlad", 20),
        Person("Lara", 17),
        Person("Vika", 25),
        Person("David", 15)
    )
    val adultNames = people.filter { it.age > 18 }.map { it.name }
    println(adultNames)

    // 6. Ленивые операции
    val lazySequence = generateSequence(1) { it + 1 }
        .filter { it % 5 == 0 }
        .map { it * 2 }
        .take(20)
        .toList()
    println(lazySequence)

    // 7. Класс Car и группировка
    data class Car(val make: String, val model: String, val year: Int)
    val cars = listOf(
        Car("Toyota", "Camry", 2023),
        Car("Toyota", "Corolla", 2021),
        Car("Ford", "Focus", 2020),
        Car("Mercedec", "AMG", 2022)
    )
    val carsGroupedByYear = cars.groupBy { it.year }
    println(carsGroupedByYear)

    // 8. Ленивая инициализация
    val lazyValue: String by lazy {
        println("Initializing...")
        "Hello, Kotlin!"
    }
    println("Before accessing lazyValue")
    println(lazyValue)

    // 9. Функция calculate
    fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
        return operation(a, b)
    }
    println(calculate(5, 3, Int::plus))
    println(calculate(5, 3, Int::minus))
    println(calculate(5, 3, Int::times))

    // 10. fold и reduce
    val numbersCollection = listOf(1, 2, 3, 4, 5)
    val sum = numbersCollection.reduce { acc, i -> acc + i }
    val min = numbersCollection.minOrNull() ?: 0
    val max = numbersCollection.maxOrNull() ?: 0
    println("Sum: $sum, Min: $min, Max: $max")
}
