import java.io.File

fun main(args : Array<String>) {
  var file = File("readme.txt")
  var isDeleted = file.deleteRecursively()

  if (isDeleted) {
    println("File deleted")
  }
}