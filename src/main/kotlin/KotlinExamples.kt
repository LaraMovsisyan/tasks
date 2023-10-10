class KotlinExamples {

    data class Point(val x: Int, val y: Int) {
        operator fun plus(other: Point): Point = Point(x + other.x, y + other.y)
    }

    fun conventionExample() {
        val p1 = Point(1, 2)
        val p2 = Point(3, 4)
        println(p1 + p2)
    }

    fun collectionsExample() {
        val list = listOf(1, 2, 3, 4, 5)
        val doubled = list.map { it * 2 }
        println(doubled)
    }

    class Rectangle(val width: Int, val height: Int) {
        val isSquare: Boolean
            get() = width == height
    }

    fun propertiesExample() {
        val rect = Rectangle(5, 5)
        println("Is square: ${rect.isSquare}")
    }

    // 4. Builders
    class HTML {
        fun body() = "Body of HTML"
    }

    fun html(init: HTML.() -> Unit): HTML {
        val html = HTML()
        html.init()
        return html
    }

    fun buildersExample() {
        val page = html {
            body()
        }
        println(page.body())
    }

    // 5. Generics
    class Box<T>(val content: T) {
        fun retrieve(): T = content
    }

    fun genericsExample() {
        val intBox = Box(42)
        val stringBox = Box("Hello, Kotlin")

        println("Integer box: ${intBox.retrieve()}")
        println("String box: ${stringBox.retrieve()}")
    }

    fun runAllExamples() {
        println("Conventions:")
        conventionExample()

        println("\nCollections:")
        collectionsExample()

        println("\nProperties:")
        propertiesExample()

        println("\nBuilders:")
        buildersExample()

        println("\nGenerics:")
        genericsExample()
    }
}

fun main() {
    val examples = KotlinExamples()
    examples.runAllExamples()
}
