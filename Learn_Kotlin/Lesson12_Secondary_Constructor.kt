fun main(args: Array<String>) {
  // Create an object using the 1st secondary constructor
  val shp = Shape(0, 0)
  // Create an object using the 2nd secondary constructor
  val shp2 = Shape(0,0, "Red")
  shp.print()
  shp2.print()
}

class Shape {
  var xPos: Int = 0
  var yPos: Int = 0
  var color: String = "White"

  constructor(xPos: Int, yPos: Int) {
    // Constructor code
  }

  constructor(xPos: Int, yPos: Int, color: String) {
    this.color = color
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
    println("The position is ($xPos, $yPos) and the color is $color")
  }
}