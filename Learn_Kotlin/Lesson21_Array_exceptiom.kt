fun main() {
    val numbers = arrayOf(1, 2, 4, 4)

    try {
        // Attempt to access the element at index 7
		println("Type an index:")
		val x = readLine()!!.toInt()
        println(numbers[x])
    } catch (e: ArrayIndexOutOfBoundsException) {
        // Handle the exception
        println("Element not found. Index out of bounds")
    } catch (e: NumberFormatException) {
	    println("Type an integer")
    }
}