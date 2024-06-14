import java.io.File

fun main(args : Array<String>) {
  var file = File("readme.txt")
  var isFileCreated = file.createNewFile()

  if (isFileCreated) {
    println("New file created")
  }
  else {
    println("File already exists")
  }

  if (file.exists()) {
    // Copy file and don't overwrite
    file.copyTo(File("new_readme.txt"), false)
  }
}