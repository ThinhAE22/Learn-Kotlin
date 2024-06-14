import java.io.File

fun main(args : Array<String>) {
  var file = File("readme.txt")
  file.writeText("Hello World")

  //append text syntax also creates a file if it does not exist.
  file.appendText("Hello World\n")
  file.appendText("More text")


}