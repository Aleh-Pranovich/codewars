package com.pranovich.codewars.scala

/**
 * https://www.codewars.com/kata/57eb8fcdf670e99d9b000272/train/scala
 *
 * Given a string of words, you need to find the highest scoring word.
 * Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.
 * You need to return the highest scoring word as a string.
 * If two words score the same, return the word that appears earliest in the original string.
 * All letters will be lowercase and all inputs will be valid.
 */
object WordScoring {

  def countScore(word: String): Int = word.map(char => char - 96).sum

  def high(s: String): String = {
    s.split(" ")
      .map(word => word -> countScore(word))
      .maxBy(pair => pair._2)
      ._1
  }

  //  def high(s: String): String = s.split(" ").maxBy(_.map(_.toInt - 96).sum)
}
