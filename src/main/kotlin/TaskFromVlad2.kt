import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    // Условные операторы
    print("Введите число: ")
    val number = scanner.nextInt()

    if (number > 0) {
        println("Число положительное")
    } else if (number < 0) {
        println("Число отрицательное")
    } else {
        println("Число равно нулю")
    }

    // Циклы
    println("Число   Квадрат")
    for (i in 1..10) {
        val square = i * i
        println("$i       $square")
    }

    println("Число   Куб")
    var j = 1
    while (j <= 10) {
        val cube = j * j * j
        println("$j       $cube")
        j++
    }

    // Repeat
    repeat(10) {
        println("Привет, мир!")
    }

    // Return, Break, Continue
    val numbers = listOf(5, 12, 3, 15, -2, 8)
    var sum = 0

    for (num in numbers) {
        if (num < 0) {
            break
        }
        if (num > 10) {
            sum += num
        }
    }

    println("Сумма чисел больше 10: $sum")

    for (i in 1..10) {
        if (i == 3 || i == 7) {
            continue
        }
        println(i)
    }

    // Обработка исключений.
    try {
        print("Введите целое число: ")
        val userInput = scanner.nextInt()
        println("Вы ввели: $userInput")
    } catch (e: InputMismatchException) {
        println("Ошибка: Введенное значение не является целым числом")
    } finally {
        println("Конец программы")
    }
}
