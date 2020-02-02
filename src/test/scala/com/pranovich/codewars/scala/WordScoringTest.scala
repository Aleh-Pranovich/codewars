package com.pranovich.codewars.scala

import org.scalatest._
import org.scalatest.matchers.should.Matchers

class WordScoringTest extends FlatSpec with Matchers {

  """high("man i need a taxi up to ubud")""" should """return "taxi" """ in {
    WordScoring.high("man i need a taxi up to ubud") should be("taxi")
  }

  """high("what time are we climbing up to the volcano")""" should """return "volcano" """ in {
    WordScoring.high("what time are we climbing up to the volcano") should be("volcano")
  }

  """high("take me to semynak")""" should """return "semynak" """ in {
    WordScoring.high("take me to semynak") should be("semynak")
  }

  """high("for equals return earliestg")""" should """return "return" """ in {
    WordScoring.high("for equals return earliestg") should be("return")
  }

  """high("find or finda")""" should """return "finda" """ in {
    WordScoring.high("find or finda") should be("finda")
  }
}