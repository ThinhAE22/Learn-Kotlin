import java.io.File

fun main(args : Array<String>) {
  var file = File("readme.txt")
  file.forEachLine { println(it) }
}