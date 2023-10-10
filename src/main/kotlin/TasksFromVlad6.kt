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

fun printNullableString(a: String?) {
    println(a?.length ?: "Строка пуста")
}

// 2. Рассмотрение кода (без изменений)
fun printFilteredIntList() {
    val nullableList: List<Int?> = listOf(1, 2, null, 4)
    val intList: List<Int> = nullableList.filterNotNull()
    println(intList)
}

// 3. Преобразование `s` в "empty", если `s` равно null, с использованием elvis.
fun printTransformedString() {
    val s: String? = null
    println(s ?: "empty")
}

// 4. Попытка преобразования nullable строки в ненулевую строку с использованием `!!`.
fun tryForceNonNull(value: String?) {
    try {
        println(value!!)
    } catch (e: KotlinNullPointerException) {
        println("Строка пуста")
    }
}

// 5. Пользовательское исключение и его обработка (без изменений)
class InvalidUserInputException : Exception("Неверный ввод пользователя")

fun checkInput(input: String) {
    if (input.isEmpty()) {
        throw InvalidUserInputException()
    }
    println(input)
}
