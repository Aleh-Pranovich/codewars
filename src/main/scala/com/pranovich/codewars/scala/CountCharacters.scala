package com.pranovich.codewars.scala

/**
 * https://www.codewars.com/kata/52efefcbcdf57161d4000091/train/scala
 *
 * The main idea is to count all the occuring characters(UTF-8) in string.
 * If you have string like this aba then the result should be { 'a': 2, 'b': 1 }
 *
 * What if the string is empty ? Then the result should be empty object literal { }
 */

object CountCharacters {

  def count(string: String): Map[Char, Int] = {
    string
      .groupBy(identity)
      .mapValues(_.length)
  }

}
