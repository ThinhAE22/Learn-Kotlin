import java.io.File

fun main() {
    val fileName = "readme.txt"
    val file = File(fileName)

    while (true) {
        print("Type a line: ")
        val input = readLine() ?: continue

        if (input.toLowerCase() == "exit") {
            break
        }

        file.appendText(input + "\n")
    }

    val content = file.readText()
    println(content)
}