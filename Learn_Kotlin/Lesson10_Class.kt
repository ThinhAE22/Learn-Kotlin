fun main(args: Array<String>) {
  // Create an object
  var shp = Shape()
  shp.print()
  // Change the value of properties
  shp.xPos = 10
  shp.yPos = 20
  shp.print()
  // Call the member function
  shp.reset()
  shp.print()
}

class Shape() {
  // Class properties
  var xPos: Int = 0
  var yPos: Int = 0

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