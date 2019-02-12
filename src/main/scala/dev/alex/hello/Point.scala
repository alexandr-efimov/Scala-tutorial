package dev.alex.hello

class Point(xc: Int, yc: Int) {
  val x: Int = xc
  val y: Int = yc

  override def toString: String = {
    "Point: [" + x + ", " + y + "]"
  }
}
