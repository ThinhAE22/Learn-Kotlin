fun main(args : Array<String>) {
  var col = Color.Red()
  println(getColor(col))
}

fun getColor(col: Color) {
  when(col) {
     is Color.Black -> println("Color is black")
     is Color.Red -> println("Color is red")
     is Color.Yellow -> println("Color is yellow")
  } 
}

sealed class Color {
  class Black: Color()
  class Red: Color()
  class Yellow: Color()
}