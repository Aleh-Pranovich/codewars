package com.pranovich.codewars.scala

import org.scalatest.flatspec.AnyFlatSpec

class CountCharactersTest extends AnyFlatSpec {
  it should "work with example tests" in {
    assert(CountCharacters.count("aba") == Map[Char, Int]('a' -> 2, 'b' -> 1))
    assert(CountCharacters.count("") == Map[Char, Int]())
  }
}