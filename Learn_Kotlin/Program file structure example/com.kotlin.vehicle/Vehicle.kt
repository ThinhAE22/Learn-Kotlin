package com.kotlin.vehicle

open class Vehicle {
  var fuelType: String = ""
  var isOn = false;

  open fun start() {
    this.isOn = true
  }

  fun stop() {
    this.isOn = false
  }
}