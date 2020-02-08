package com.pranovich.codewars.scala

/**
 * https://www.codewars.com/kata/51e0007c1f9378fa810002a9/train/scala
 *
 * Write a simple parser that will parse and run Deadfish.
 *
 * Deadfish has 4 commands, each 1 character long:
 *
 * i increments the value (initially 0)
 * d decrements the value
 * s squares the value
 * o outputs the value into the return array
 * Invalid characters should be ignored.
 *
 * Deadfish.parse("iiisdoso") => List(8, 64)
 *
 */

object StringToIntParser {

    def parse(data: String): List[Int] = {
      var result = List[Int]()
      var initValue = 0

      data.foreach {
        case 'i' => initValue += 1
        case 'd' => initValue -= 1
        case 's' => initValue *= initValue
        case 'o' => result = result :+ initValue
        case _ =>
      }
      result
    }

//  def parse(data: String): List[Int] = {
//    data.foldLeft((0, List[Int]())) {
//      case ((value, output), 'i') => (value + 1, output)
//      case ((value, output), 'd') => (value - 1, output)
//      case ((value, output), 's') => (value * value, output)
//      case ((value, output), 'o') => (value, output :+ value)
//      case ((value, output), _) => (value, output)
//    }._2
//  }
}
