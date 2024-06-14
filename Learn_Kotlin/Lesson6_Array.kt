fun main(args: Array<String>) {
  val numbers = Array(10) {i -> i * 2}
  // num = 16, 8th element
  val num = numbers.get(8)
  println(num)
  println("${numbers.size}")
  // Change the first element value to 10  
  numbers.set(0, 10)
  var strs = arrayOf<String>("John", "Mary", "Jim", "Jane")
  //Array function
  val nums = arrayOf(3, 5, 7, 2, 12, 14, 5, 7)

  val dnums = nums.distinct()
  println(dnums)
  //Other func
  val avg = nums.average()
  val min = nums.min()
  val max = nums.max()
  println("The average = $avg, The largest element = $max, The smallest element = $min")
  //Array Object
  var nums1 = Array(4) { it * 3 } // Creates an array of size 4 with elements 0, 3, 6, 9
  println("The first: ${nums[0]}")
  println("The last: ${nums[nums.size - 1]}")

  //name sort
  var strs1 = arrayOf("Mary", "Paul", "Jane", "Phil", "John", "Jane", "Paul", "Anthony", "Mary")
    
    // Getting distinct names
    val dnames = strs1.distinct()
    
    // Counting occurrences of each distinct name
    val nameCounts = dnames.count()
    
    // Sorting the array to find the first and last in alphabetical order
    val sortedNames = strs1.sortedArray()
    
    // Finding the first name in alphabetical order
    val firstInAlphabet = sortedNames.firstOrNull() ?: "No names available"
    
    // Finding the last name in alphabetical order
    val lastInAlphabet = sortedNames.lastOrNull() ?: "No names available"
    
    // Printing the results
    println("There is $nameCounts distinct names")
    println("The first in the alphabetical order is $firstInAlphabet")
    println("The last in the alphabetical order is $lastInAlphabet")
}