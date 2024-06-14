fun main(args : Array<String>) {
  val names = mutableMapOf(1 to "Matt", 2 to "Jack", 3 to "Kate")
  println(names.keys)
  println(names.values)
  println(names.get(2))
  // Add new element where key=4 and value=Jim
  names.put(4, "Jim")
  // Update the value with the key 1
  names.put(1, "Mary")
  println(names)
  // Add new element where key=4 and value="Jim"
  names[4] = "Jim"
  // Add two new elements
  names += mapOf(5 to "Lisa", 6 to "Mary")
  println(names)
  //remove
  names.remove(3)
  //Constrain key/value
  if (names.containsValue("Kate")) {
    println("Map contains Kate")
  }

  if (names.containsKey(2)) {
    println("The map contains key 2")
  }
  //Filter
  val filteredNames = names.filterValues { it.startsWith("J") }
  println(filteredNames)
}