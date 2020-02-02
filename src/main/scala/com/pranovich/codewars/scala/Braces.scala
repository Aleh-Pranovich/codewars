package com.pranovich.codewars.scala

/**
 * https://www.codewars.com/kata/5277c8a221e209d3f6000b56/train/scala
 *
 * Write a function that takes a string of braces, and determines if the order of the braces is valid. It should return true if the string is valid, and false if it's invalid.
 * This Kata is similar to the Valid Parentheses Kata, but introduces new characters: brackets [], and curly braces {}. Thanks to @arnedag for the idea!*
 * All input strings will be nonempty, and will only consist of parentheses, brackets and curly braces: ()[]{}.
 *
 * What is considered Valid?
 * A string of braces is considered valid if all braces are matched with the correct brace.
 *
 * Examples:
 * "(){}[]"   =>  True
 * "([{}])"   =>  True
 * "(}"       =>  False
 * "[(])"     =>  False
 * "[({})](]" =>  False
 */
object Braces {

  private val bracesPairs = Map('(' -> ')', '{' -> '}', '[' -> ']')

  private def isOpened(brace: Char) = bracesPairs.keySet.contains(brace)

  private def closedMatchOpened(opened: Char, closed: Char): Boolean = bracesPairs(opened) == closed

  def validBraces(inputBraces: String): Boolean = {
    var stack = List[Char]()
    val bracesArray = inputBraces.toCharArray

    bracesArray.foreach { brace =>
      if (isOpened(brace)) stack = brace :: stack
      else {
        if (stack.isEmpty) return false
        else if (closedMatchOpened(stack.head, brace)) stack = stack.tail
        else return false
      }
    }
    stack.isEmpty
  }

//  def validBraces(inputBraces: String): Boolean = {
//    inputBraces
//      .replace("()", "")
//      .replace("[]", "")
//      .replace("{}", "")
//    match {
//      case "" => true
//      case `inputBraces` => false
//      case x => validBraces(x)
//    }
//  }
}
