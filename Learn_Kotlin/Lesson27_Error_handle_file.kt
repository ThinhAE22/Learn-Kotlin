import java.io.File
import java.io.FileNotFoundException

fun main(args : Array<String>) {
  var file = File("readme.txt")
  try {
    file.writeText("Hello")
  }
  catch (e: FileNotFoundException) {
    println("File not found or Access is denied")
  }
}