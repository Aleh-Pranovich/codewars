package com.pranovich.codewars.scala

import org.scalatest._
import org.scalatest.Assertions._

import MeetingTest._

class InvitedFriendsTest extends FlatSpec {

  it should "pass basic tests" in {
    testing("Alexis:Wahl;John:Bell;Victoria:Schwarz;Abba:Dorny;Grace:Meta;Ann:Arno;Madison:STAN;Alex:Cornwell;Lewis:Kern;Megan:Stan;Alex:Korn",
      "(ARNO, ANN)(BELL, JOHN)(CORNWELL, ALEX)(DORNY, ABBA)(KERN, LEWIS)(KORN, ALEX)(META, GRACE)(SCHWARZ, VICTORIA)(STAN, MADISON)(STAN, MEGAN)(WAHL, ALEXIS)")
    testing("John:Gates;Michael:Wahl;Megan:Bell;Paul:Dorries;James:Dorny;Lewis:Steve;Alex:Meta;Elizabeth:Russel;Anna:Korn;Ann:Kern;Amber:Cornwell",
      "(BELL, MEGAN)(CORNWELL, AMBER)(DORNY, JAMES)(DORRIES, PAUL)(GATES, JOHN)(KERN, ANN)(KORN, ANNA)(META, ALEX)(RUSSEL, ELIZABETH)(STEVE, LEWIS)(WAHL, MICHAEL)")

  }
}

object MeetingTest {

  def testing(s: String, expect: String): Unit = {
    println("Testing:\n" + s)
    val actual: String = InvitedFriends.meeting(s)
    println("Actual: " + actual)
    println("Expect: " + expect)
    println("*")
    assertResult(expect){actual}
  }
}

