package dev.alex.hello

object Traits {

  def main(args: Array[String]): Unit = {
    val alex = new User("Alex", "Efimov")
    val ronaldo = new User("Cristiano", "Ronaldo")
    val messi = new User("Lionel", "Efimov")

    println(alex)
    println(ronaldo)
    println(messi)

    println(alex.isEqual(ronaldo))
    println(alex.isEqual(messi))
  }
}

trait Equals {
  def isEqual(x: Any): Boolean

  def isNotEqual(x: Any): Boolean = !isEqual(x)
}

class User(val name: String, val surname: String) extends Equals {
  override def isEqual(x: Any): Boolean = x.isInstanceOf[User] &&
    x.asInstanceOf[User].surname == surname

  override def toString = s"User($name $surname)"
}