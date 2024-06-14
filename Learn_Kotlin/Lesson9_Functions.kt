fun main(args: Array<String>) {
  val res = sum(2, 3)
  println("$res")
  println(helloName("John"))
  println(min(8, 4))
  val dres = sum(2.0, 3.5)
  println("$dres")
  //Lamda funct
  val firstLambda: (String) -> String = { text -> "The length = ${text.length}" }
  println(firstLambda("Hello"))
  lengthMsg("Hello again!", firstLambda)
}

fun sum(x: Int, y: Int): Int {//param types and return type
  return x + y
}
//Overloading
fun sum(x: Double, y: Double): Double {
  return x + y
}

fun helloName(name: String): String {
  val msg: String = "Hello $name. You are welcome!"
  return msg
}

fun min(x: Int, y: Int): Int{
  if (x < y) {
    return x
  }
  else {
    return y
  }
}
//Pass lamda funct to other function
fun lengthMsg(msg: String, calcLength: (String) -> String) {
  // Calls the lambda
  println(calcLength(msg))
}