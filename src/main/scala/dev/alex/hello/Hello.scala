package dev.alex.hello

import dev.alex.hello.Run._

object Hello {

  def main(args: Array[String]): Unit = {
    println("Hello 'standard mode' :)")

    var number = 999
    println(number)
    number = 100500
    println(number)

    printSeparator("Val variables")
    val numberSecond = 998: Long
    println(numberSecond)
    println(numberSecond.getClass)

    printValue("Unit method is same to void")

    val tuple = Tuple2(30, "Millions")
    println(tuple)

    printSeparator("Classes and objects")
    val point = new Point(1, 2)
    println("Point - " + point)

    printSeparator("Implicit Classes")
    3 times println("Hello")
  }

  private def printSeparator(name: String) = {
    printValue("\n<<<<<--------" + name)
  }

  private def printValue(value: String): Unit = {
    println(value)
  }
}
