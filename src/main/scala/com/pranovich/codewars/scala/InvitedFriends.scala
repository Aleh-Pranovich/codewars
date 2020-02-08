package com.pranovich.codewars.scala

/**
 * https://www.codewars.com/kata/59df2f8f08c6cec835000012/train/scala
 *
 * John has invited some friends. His list is:
 *
 * s = "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";
 * Could you make a program that
 *
 * makes this string uppercase
 * gives it sorted in alphabetical order by last name.
 * When the last names are the same, sort them by first name.
 * Last name and first name of a guest come in the result between parentheses separated by a comma.
 *
 * So the result of function meeting(s) will be:
 *
 * "(CORWILL, ALFRED)(CORWILL, FRED)(CORWILL, RAPHAEL)(CORWILL, WILFRED)(TORNBULL, BARNEY)(TORNBULL, BETTY)(TORNBULL, BJON)"
 * It can happen that in two distinct families with the same family name two people have the same first name too.
 */

case class Friend(firstName: String, lastName: String) {
  override def toString = s"($lastName, $firstName)"
}

object Friend {
  def apply(data: Array[String]): Friend = {
    Friend(data(0), data(1))
  }
}

object InvitedFriends {

  def meeting(s: String): String = {
    s.toUpperCase
      .split(";")
      .map(_.split(":"))
      .map(Friend(_))
      .sortBy(friend => (friend.lastName, friend.firstName))
      .mkString("")
  }

  //  def meeting(s: String): String = {
  //    s
  //      .map(_.toUpper)
  //      .split(";")
  //      .map(_.split(":")).map(friend => friend(0) -> friend(1))
  //      .sortBy(friend => (friend._2, friend._1))
  //      .map(friend => s"(${friend._2}, ${friend._1})")
  //      .mkString("")
  //  }
}
