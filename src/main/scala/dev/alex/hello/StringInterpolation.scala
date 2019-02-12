package dev.alex.hello

object StringInterpolation {

  def main(args: Array[String]): Unit = {

    val name = "Alex"

    println(s"Hello, $name")
    println(s"1+1 = ${1 + 1}")
  }
}
