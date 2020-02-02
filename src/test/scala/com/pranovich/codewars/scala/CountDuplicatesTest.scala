package com.pranovich.codewars.scala

import org.scalatest.funsuite.AnyFunSuite

class CountDuplicatesTest extends AnyFunSuite {

  test("duplicateCount(\"abcde\") should return 0") {
    assert(CountDuplicates.duplicateCount("abcde").equals(0))
  }

  test("duplicateCount(\"abcdea\") should return 1 in") {
    assert(CountDuplicates.duplicateCount("abcdea").equals(1))
  }

  test("duplicateCount(\"indivisibility\") should return 1" ) {
    assert(CountDuplicates.duplicateCount("indivisibility").equals(1))
  }

  test("duplicateCount(\"JDajWbukZU\") should return 2" ) {
    assert(CountDuplicates.duplicateCount("JDajWbukZU").equals(2))
  }


}
