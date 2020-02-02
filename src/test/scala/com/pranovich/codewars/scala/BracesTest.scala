package com.pranovich.codewars.scala

class BracesTest extends org.scalatest.FunSuite {

  test("Initial test") {
    assert(Braces.validBraces("(){}[]"))
    assert(Braces.validBraces("([{}])"))
    assert(!Braces.validBraces("(}"))
    assert(!Braces.validBraces("[(])"))
    assert(!Braces.validBraces("[({})](]"))
  }

  test("test 2") {
    assert(!Braces.validBraces("()(}{][)"))
    assert(!Braces.validBraces("(())({}}{()][][)"))
    assert(!Braces.validBraces("(}((]])"))
    assert(!Braces.validBraces("({]})()"))
    assert(!Braces.validBraces("(]]}{(}}()"))
    assert(!Braces.validBraces("(}]]((])"))
    assert(!Braces.validBraces("(}[)"))
    assert(!Braces.validBraces("()])"))
    assert(!Braces.validBraces("(})"))
    assert(!Braces.validBraces("())]])"))
  }
}
