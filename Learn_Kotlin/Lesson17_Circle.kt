open class Shape {
    // Class properties
    var xPos: Int = 0
    var yPos: Int = 0

    open fun print() {
        println("Position: x=$xPos, y=$yPos")
    }
}

class Circle(var radius: Double) : Shape() {
    fun getArea(): Double {
        return radius * radius * 3.14159
    }

    override fun print() {
        super.print()
        println("Radius: $radius")
    }
}

fun main(args: Array<String>) {
    val circle = Circle(5.5)
    println("The area = ${circle.getArea()}")
}
