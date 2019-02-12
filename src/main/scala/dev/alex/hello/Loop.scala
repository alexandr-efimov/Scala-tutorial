package dev.alex.hello

object Loop {

  def main(args: Array[String]): Unit = {

    println("--->>>>>><<<<<----- UNTIL for excluding last")
    for (a <- 5 until 7) {
      println("Current loop iterator value: " + a)
    }

    println("--->>>>>><<<<<----- TO for including last")
    for (a <- 5 to 7) {
      println("Current loop iterator value: " + a)
    }


    println("--->>>>>><<<<<----- two ranges with ; for all computations")
    for (a <- 1 to 3; b <- 1 to 3) {
      println("\nCurrent A: " + a)
      println("Current B: " + b)
    }


    println("--->>>>>><<<<<----- collection")
    val numbers = List(1, 2, 3, 4, 5)
    for (a <- numbers) {
      println("Current loop value: " + a)
    }
  }
}
