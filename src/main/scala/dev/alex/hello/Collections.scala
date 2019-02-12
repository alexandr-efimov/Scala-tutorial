package dev.alex.hello

object Collections {

  def main(args: Array[String]): Unit = {
    println("\n\nTest LISTS")
    testLists

    println("\n\nTest SETS")
    testSets

    println("\n\nTest TUPLES")
    testTuples

    println("\n\nTest OPTIONS")
    testOptions
  }

  private def testSets = {
    val fruit1 = Set("apples", "oranges", "pears")
    val fruit2 = Set("mangoes", "banana")

    val fruit = fruit1 ++ fruit2
    println("fruit1 ++ fruit2 : " + fruit)

    println("Min fruit: " + fruit.min)
    println("Max fruit: " + fruit.max)
  }

  private def testLists = {
    val fruits: List[String] = List("apples", "oranges")
    println(fruits.::("banana"))

    val numbers = 1 :: (2 :: (3 :: (4 :: Nil)))
    println(numbers)

    val manyFruits = List.fill(5)("apple", "banana")
    println(manyFruits)
    println(manyFruits.getClass)
  }

  private def testTuples = {
    val tuple = (1, "hi", Console)

    println(tuple)
    tuple.productIterator.foreach(i => println(i))
  }

  private def testOptions = {
    val capitals = Map("France" -> "Paris", "Japan" -> "Tokyo")

    println(capitals.get("France"))
    println(capitals.get("France").isDefined)

    println(capitals.get("USA"))
    println(capitals.get("USA").isDefined)
  }
}
