fun main(args: Array<String>) {
  println("What is your name?")
  val name = readLine()
  println("Hello $name")
    //math
  println("Type the first number: ")
  val num1 = readLine()!!.toInt();
  println("Type the second number: ")
  val num2 = readLine()!!.toInt();

  println("$num1 + $num2 = ${num1 + num2}")
  //java interoperable
  val inputa = Scanner(System.`in`)

  println("Type the first number: ")
  val num1a = input.nextDouble()
  println("Type the second number: ")
  val num2a = input.nextDouble()

  println("$num1a + $num2a = ${num1a + num2a}")
  //Initials
  val firstName = "Kate"
  val lastName = "Hudson"
  println("Your initials: ${firstName[0]}.${lastName[0]}")
}