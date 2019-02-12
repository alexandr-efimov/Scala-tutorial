package dev.alex.hello

object Clojure {

  def main(args: Array[String]): Unit = {
    val multiplier = (i: Int) => i * 10

    println("Multiplier result: " + multiplier(5))
  }

}
