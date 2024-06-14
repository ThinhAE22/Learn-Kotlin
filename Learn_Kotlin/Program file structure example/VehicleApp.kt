import com.kotlin.vehicle.Car

fun main(args: Array<String>) {
  val car = Car()
  println("isOn = ${car.isOn}")
  car.start()
  println("isOn = ${car.isOn}")
}