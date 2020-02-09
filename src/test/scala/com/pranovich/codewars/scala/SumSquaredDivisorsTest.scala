package com.pranovich.codewars.scala

import com.pranovich.codewars.scala.SumSquaredDivisorsTest._
import org.scalatest.Assertions._
import org.scalatest._

class SumSquaredDivisorsTest extends FlatSpec {
  it should "pass basic tests" in {
    dotest(1, 250, "[[1, 1], [42, 2500], [246, 84100]]")
    dotest(42, 250, "[[42, 2500], [246, 84100]]")
    dotest(250, 500, "[[287, 84100]]")
  }
}

object SumSquaredDivisorsTest {

  private def dotest(m: Long, n: Long, expect: String): Unit = {
    println("Testing: " + m + ", " + n)
    val actual: String = SumSquaredDivisors.listSquared(m, n)
    println("Actual: " + actual)
    println("Expect: " + expect)
    println("*")
    assertResult(expect) {
      actual
    }
  }
}
