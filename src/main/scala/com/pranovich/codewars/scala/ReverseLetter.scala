package com.pranovich.codewars.scala

/**
 * https://www.codewars.com/kata/58b8c94b7df3f116eb00005b/train/scala
 *
 * Given a string str, reverse it omitting all non-alphabetic characters.
 * Example:
 * For str = "krishan", the output should be "nahsirk".
 * For str = "ultr53o?n", the output should be "nortlu".
 * A string consists of lowercase latin letters, digits and symbols.
 */

object ReverseLetter {

  def reverseLetter(str: String): String = str.replaceAll("[^A-Za-z]", "").reverse

  //  def reverseLetter(str: String): String = str.filter(_.isLetter).reverse
}
