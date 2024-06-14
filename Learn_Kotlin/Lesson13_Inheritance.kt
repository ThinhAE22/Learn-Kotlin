open class Vehicle { //Open keyword make classes inheritable
  var fuelType: String = ""
  var isOn = false;

  open fun start() { //open to overide in the child class
    this.isOn = true
  }

  fun stop() {
    this.isOn = false
  }
}

class Car: Vehicle() {
  var brand: String = ""
  var model: String = ""
  var color: String = ""

  fun changeGear() {
    // method code
  }

  override fun start() { //The overide function
     super.start()
     println("Car start")
  }
}

fun main(args: Array<String>) {
  val car = Car()
  // isOn property is inherited from Vehicle class
  println("isOn = ${car.isOn}")
  // Call the Vehicle class methdod 
  car.start()
  println("isOn = ${car.isOn}")
}