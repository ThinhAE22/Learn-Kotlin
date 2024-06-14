fun main(args: Array<String>) {
  //Koltin switch 
  val num = 2

  val res = when(num) {
    1 -> "Value is 1"
    2 -> "Value is 2"
    3 -> "Value is 3"
    else -> "Unknown"
  }

  println("$res")
  //endpoints ..
  val age = 24

  when(age) {
    in 1..17 -> println("You are young")
    in 18..40 -> println("You are adult")
    in 40..60 -> println("You are middle aged")
    else -> println("You can enjoy")
  }
  //if else clause and readline() function combine
  println("Type a word:")
    val word = readLine()?.toLowerCase() ?: ""
    if (word == word.reversed()) {
        println("The word $word is palindrome")
    } else {
        println("The word $word is not palindrome")
    }

  var nums = Array(3) { 0 }
  println("Type the first number:")
  nums[0] = readLine()!!.toInt()
  println("Type the second number:")
  nums[1] = readLine()!!.toInt()
  println("Type the third number:")
  nums[2] = readLine()!!.toInt()

  val sortedNums = nums.sortedArray()
  println("The largest number = ${sortedNums.last()}")
}