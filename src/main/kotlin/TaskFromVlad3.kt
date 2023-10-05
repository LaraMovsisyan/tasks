fun maxOfTwo(a: Int, b: Int): Int {
    return if (a > b) a else b
}

// Задание 1: Функция maxOfTwo
fun main() {
    val num1 = 1
    val num2 = 2
    val num3 = 3
    val num4 = 4

    val max1 = maxOfTwo(num1, num2)
    val max2 = maxOfTwo(num3, num4)

    println("Максимальное из ($num1, $num2) = $max1")
    println("Максимальное из ($num3, $num4) = $max2")

    // Задание 2: Функция sayHello
    val name1 = "Влад"
    val name2 = "Лара"

    val message1 = sayHello(name1)
    val message2 = sayHello()

    println(message1)
    println(message2)

    // Задание 3: Функция isGreater
    val a = 5
    val b = 3
    val result = a isGreater b
    println("$a больше, чем $b: $result")

    // Задание 4: generateSequence
    val n = 10
    val sequence = generateSequence(n)
    println("Последовательность от 1 до $n: $sequence")

    // Задание 5: Работа с списком имен
    val имена = mutableListOf("Алиса", "Борис", "Валентин")

    // Добавить имя
    имена.add("Дмитрий")

    // Удалить имя
    имена.remove("Борис")

    // Перевернуть список
    val перевернутыеИмена = имена.reversed()

    // Использовать функцию let для вывода всех имен
    имена.let { println("Имена: $it") }

    // Использовать функцию run для изменения списка
    val измененныеИмена = имена.run {
        add("Евгений")
        remove("Алиса")
        this
    }

    // Использовать функцию also для записи изменений
    val такжеИзмененныеИмена = имена.also {
        it.remove("Валентин")
    }

    // Использовать функцию apply для изменения списка внутри блока
    имена.apply {
        add("Федор")
    }

    // Использовать функцию with для операций над списком без изменения
    with(имена) {
        println("Первое имя: ${firstOrNull()}")
        println("Последнее имя: ${lastOrNull()}")
    }

    println("Измененный список: $имена")
    println("Обратный список: $перевернутыеИмена")
    println("Измененный с run: $измененныеИмена")
    println("Измененный с also: $такжеИзмененныеИмена")
}

fun sayHello(name: String = "мир"): String {
    return "Привет, $name!"
}
infix fun Int.isGreater(other: Int): Boolean {
    return this > other
}
fun generateSequence(n: Int, current: Int = 1): List<Int> {
    return if (current > n) {
        emptyList()
    } else {
        listOf(current) + generateSequence(n, current + 1)
    }
}