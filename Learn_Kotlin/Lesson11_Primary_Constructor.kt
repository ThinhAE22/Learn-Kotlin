fun main(args: Array<String>) {
  // Create an object using the primary constructor
  val shp = Shape(1, 1)
  shp.print()
  shp.move(5, 6)
  shp.print()
}

class Shape(var xPos: Int, var yPos: Int) {
  init {
    println("Object intialization")
  }

  // Memeber functions
  fun reset() {
    xPos = 0
    yPos = 0
  }

  fun move(x: Int, y: Int ) {
    xPos = x
    yPos = y
  }

  fun print() {
    println("The position is ($xPos, $yPos)")
  }
}