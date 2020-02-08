package com.pranovich.codewars.scala

class StringToIntParserTest extends org.scalatest.FlatSpec {
  it should "work with example tests" in {
    assert(StringToIntParser.parse("iiisdoso") == List(8, 64))
    assert(StringToIntParser.parse("iiisdosodddddiso") == List(8, 64, 3600))
  }
}