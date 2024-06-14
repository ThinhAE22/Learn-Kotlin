package com.kotlin.vehicle

class Car: Vehicle() {
  var brand: String = ""
  var model: String = ""
  var color: String = ""

  fun changeGear() {
    // method code
  }

  override fun start() {
     super.start()
     println("Car start")
  }
}