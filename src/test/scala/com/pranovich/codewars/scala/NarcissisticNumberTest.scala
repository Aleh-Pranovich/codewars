package com.pranovich.codewars.scala

import org.scalatest.funsuite.AnyFunSuite

class NarcissisticNumberTest extends AnyFunSuite {

  test("Samples") {
    assert(NarcissisticNumber.narcissistic(7))
    assert(NarcissisticNumber.narcissistic(371))
    assert(NarcissisticNumber.narcissistic(153))
    assert(NarcissisticNumber.narcissistic(1634))
    assert(!NarcissisticNumber.narcissistic(122))
    assert(!NarcissisticNumber.narcissistic(4887))
  }
}
