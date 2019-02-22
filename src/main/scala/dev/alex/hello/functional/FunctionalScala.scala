package dev.alex.hello.functional

object FunctionalScala {

  def main(args: Array[String]): Unit = {

    //higher-order function
    val salaries = Seq(20000, 70000, 40000)
    val doubleSalary = (value: Int) => value * 2
    val doubledSalaries = salaries.map(doubleSalary)

    println(doubledSalaries)
  }
}
