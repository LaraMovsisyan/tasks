fun main() {
    printNullableString(null)
    printFilteredIntList()
    printTransformedString()
    tryForceNonNull(null)

    try {
        checkInput("")
    } catch (e: InvalidUserInputException) {
        println(e.message)
    }
}

// 1. Обращение к `a` без вызова исключения
fun printNullableString(a: String?) {
    if (a != null) {
        println(a.length)
    } else {
        println("Строка пуста")
    }
}

// 2. Рассмотрение кода
fun printFilteredIntList() {
    val nullableList: List<Int?> = listOf(1, 2, null, 4)
    val intList: List<Int> = nullableList.filterNotNull()
    println(intList)
}

// 3. Преобразование `s` в "empty", если `s` равно null
fun printTransformedString() {
    var s: String? = null
    if (s == null) {
        s = "empty"
    }
    println(s)
}

// 4. Попытка преобразования nullable строки в ненулевую строку
fun tryForceNonNull(value: String?) {
    if (value != null) {
        println(value)
    } else {
        println("Строка пуста")
    }
}

// 5. Пользовательское исключение и его обработка
class InvalidUserInputException : Exception("Неверный ввод пользователя")

fun checkInput(input: String) {
    if (input.isEmpty()) {
        throw InvalidUserInputException()
    }
    println(input)
}
