package com.pranovich.codewars.scala

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class HumanTimeTest extends AnyFlatSpec with Matchers {

  val tests = List(
    (1, "1 second"),
    (62, "1 minute and 2 seconds"),
    (120, "2 minutes"),
    (3600, "1 hour"),
    (3662, "1 hour, 1 minute and 2 seconds"),
    (15731080, "182 days, 1 hour, 44 minutes and 40 seconds"),
    (132030240, "4 years, 68 days, 3 hours and 4 minutes"),
    (76305615, "2 years, 153 days, 4 hours and 15 seconds")
  )

  tests.foreach {
    case (input, expected) =>
      s"format($input)" should s"return $expected" in {
        HumanTime.formatDuration(input) should be(expected)
      }
  }
}