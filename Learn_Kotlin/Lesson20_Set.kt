fun main(args : Array<String>) {
  val nums = setOf(1, 2, 3, 4, 5, 5, 2)
  println(nums)
  println(nums.size)

  //element at and index of
  val names = mutableSetOf("John", "Kate", "Mary", "Jim")
  println(names.elementAt(1))
  println(names.indexOf("Kate"))
  //adding
  names.add("Allison")
  names.addAll(setOf("James", "Harry"))
  println(names)
  //removing
  names.remove("Kate")
  println(names)
  //for each
  names.forEach {el -> println("$el")}
  //union and intersect
  val names2 = mutableSetOf("John", "Kate", "Mary", "Jim")
  val names3 = mutableSetOf("Matt", "Mike", "Kate", "John")

  println(names3.union(names2))
  println(names3.intersect(names2))

}