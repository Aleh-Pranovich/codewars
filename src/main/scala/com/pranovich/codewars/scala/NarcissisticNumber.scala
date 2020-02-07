package com.pranovich.codewars.scala

/**
 * https://www.codewars.com/kata/5287e858c6b5a9678200083c/train/scala
 *
 * A Narcissistic Number is a number which is the sum of its own digits,
 * each raised to the power of the number of digits in a given base.
 * In this Kata, we will restrict ourselves to decimal (base 10).
 *
 * For example, take 153 (3 digits):
 * 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
 * and 1634 (4 digits):
 * 1^4 + 6^4 + 3^4 + 4^4 = 1 + 1296 + 81 + 256 = 1634
 * The Challenge:
 * Your code must return true or false depending upon whether the given number is a Narcissistic number in base 10.
 * Error checking for text strings or other invalid inputs is not required,
 * only valid integers will be passed into the function.
 **/

object NarcissisticNumber {

  def narcissistic(n: Int): Boolean = {
    def getSumOfRaisedToPower(num:Int, power:Int): Int = {
      if (num < 10) Math.pow(num, power).toInt
      else getSumOfRaisedToPower(num / 10, power) + Math.pow(num % 10, power).toInt
    }

    n == getSumOfRaisedToPower(n, n.toString.length)
  }

//  def narcissistic(n: Int): Boolean = {
//    n == n.toString.map(i => math.pow(i.asDigit, n.toString.length)).sum
//  }
}
