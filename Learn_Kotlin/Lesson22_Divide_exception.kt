fun main(args : Array<String>) {
  var x = 0
  var y = 0

  println("Type two integers: ")
  try {
    x = readLine()!!.toInt()
    y = readLine()!!.toInt()
    val res = x / y
    println("The result = $res")
  }
  catch (e: ArithmeticException) {
    println("Divided by zero not allowed")
  }
  catch (e: NumberFormatException) {
    println("Type an integer")
  }
}