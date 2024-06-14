import java.io.File

fun main() {
    val fileName = "numbers.txt"
    val file = File(fileName)
    
    // Clear the file at the beginning
    file.writeText("")

    while (true) {
        println("Type a positive integer (-1 to exit):")
        val input = readLine()?.toIntOrNull() ?: continue

        if (input == -1) {
            break
        }

        if (input > 0) {
            file.appendText(input.toString() + "\n")
        } else {
            println("The number must be positive")
        }
    }

    val numbers = file.readLines().mapNotNull { it.toIntOrNull() }

    val count = numbers.size
    val average = if (numbers.isNotEmpty()) numbers.average() else 0.0

    println("You typed $count numbers.")
    println("The average is $average.")
}
