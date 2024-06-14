fun main(args: Array<String>) {
  val car = Car("Ford", "Mondeo", "Red")
  println(car.toString()) //data keyword automatically defined methods like: toString(), equals() and copy()
  // Copy the car object
  val car2 = car.copy(color="Black")
  println(car2.toString())

  // Compare objects
  println(car.equals(car2))
}

// Car data class
data class Car(val brand: String, val model: String, val color: String) {
}