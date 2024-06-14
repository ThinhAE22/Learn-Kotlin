fun main(args : Array<String>) {
  //elements in the list because it is immutable
  val nums1 = listOf(1, 2, 3, 4, 5)
  println(nums1.get(2))
  println(nums1[3])
  println(nums1.size)
  // Not allowed
  // nums1[3] = 10

  //mutable list the method modify it but do not change the original
  val nums = mutableListOf(1, 2, 7, 5, 2, 9, 0, 5)
  // Remove the first element (index = 0)
  nums.removeAt(0)
  println(nums)
  // Remove the first 2 element
  nums.remove(2)
  println(nums)
  // Remove all 5 elements
  nums.removeAll(listOf(5))
  println(nums)

  //For each
  val nums2 = mutableListOf(1, 2, 3, 4, 5)
  nums2.forEach{ println(it) }

  //names
  val names = mutableListOf(Person("John", "Johnson"), Person("Lisa", "Lifeson"))
  println(names.toString())

  //Filter
  val names1 = mutableListOf("Jim", "Mary", "Matt", "Priscilla")
  val filteredNames = names1.filter{ it.startsWith("M") }
  println(filteredNames.toString())

  //Reverse list
  val names2 = mutableListOf("Jim", "Mary", "Matt", "Priscilla")
  println(names2.asReversed().toString())

  //Binary search
  val names3 = mutableListOf("Jim", "Mary", "Matt", "Priscilla")
  println(names3.binarySearch("Matt"))

  //Count
  val nums3 = mutableListOf(2, 3, 5, 2, 6, 7, 1, 2, 6)
  println(nums3.count { it == 2 })

  //Contain
  val names4 = listOf("Jim", "Mary", "Matt", "Priscilla", "Mike", "Kelly")
  println(names4.contains("Matt"))

  //Sort
  val names5 = listOf("Jim", "Mary", "Matt", "Priscilla", "Mike", "Kelly")
  println(names5.sorted())

  //min max sum average
  val nums4 = listOf(5, 3, 9, 11, 4)
  println("The sum = ${nums4.sum()}")
  println("The average = ${nums.average()}")

}

data class Person(var firstName: String, var lastName: String) {
}