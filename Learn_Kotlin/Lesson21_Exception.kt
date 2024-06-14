fun main(args : Array<String>) {
var num = 0

  while(num != -1) {
    println("Type an integer (-1 = exit): ")
    try {
      num = readLine()!!.toInt()
    }
    catch (e: NumberFormatException) {
      println(e)
    }
  }
}