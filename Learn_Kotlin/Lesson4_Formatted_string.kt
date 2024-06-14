fun main(args: Array<String>) {
  //Formatted string
  var firstName: String = "John"
  var lastName: String = "Johnson"
  println("Hello $firstName $lastName")
  
  //Print
  var msg: String = """
      This is the
      example of 
      raw string literals
   """
  println("$msg")

  //Trim margin
  var msg1: String = """
    |This is the
    |example of 
    |raw string literals
  """.trimMargin()

  println("$msg1")

  //Len string
  val msg2: String = "Hello World"
  val len = msg2.length

  println("The length is $len")

  //compare string
  val password: String = "password123"
  val check: String = "password123!'"

  println(password.compareTo(check))

  //Replace string
  val msg3: String = "Hello World"

  println(msg3.replace("World" , "Earth"))

  //reverse string
  val msg4: String = "Hello World"

  println(msg4.reversed())

  //start with
  val msg5: String = "Hello World"

  println(msg5.startsWith('W'))

  //to upper case and lower case
  val msg6: String = "Hello World"
  val str = msg6.toLowerCase()

  println("$str")

  //Type conversions
  var msg7 = "Hello"
  msg7 = 5.toString();

  println("$msg")

  //error when convert bigger size data type to smaller
  var sum: Int = 12362000
  var tmp: Short = sum.toShort()

  println("$sum\n$tmp")

  //ASCII code
  var num1: Int = 65
  var chr1: Char = num1.toChar()

  println("$chr1")
}