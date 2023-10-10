import java.util.*

fun main() {
    showNullableStringLength(null)
    displayDefaultValueForNull()
    demonstrateNonNullAssertion(null)
}

fun showNullableStringLength(input: String?) {
    println(input?.length)
    // or
    val anotherString: String? = "Hello, world!"
    println(anotherString?.uppercase(Locale.getDefault()))
}

// elvis
fun displayDefaultValueForNull() {
    val sample: String? = null
    val transformedValue = sample ?: "No value provided"
    println(transformedValue)
    // other variant
    val anotherSample: String? = "Example String"
    val anotherTransformedValue = anotherSample ?: "No value provided"
    println(anotherTransformedValue)
}

fun demonstrateNonNullAssertion(nullableString: String?) {
    try {
        println(nullableString!!)
    } catch (e: KotlinNullPointerException) {
        println("An error occurred: ${e.message}")
    }
    // 2nd example
    val anotherNullableString: String? = "This is not null"
    try {
        println(anotherNullableString!!)
    } catch (e: KotlinNullPointerException) {
        println("An error occurred: ${e.message}")
    }
}
