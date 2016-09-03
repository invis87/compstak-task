package com.pronvis.compstack

import org.scalatest.{Matchers, WordSpec}
import Task2._

class Task2Test extends WordSpec with Matchers {

  def checkFourOfAKind(funcName: String, fourOfAKindFunc: Seq[Card] => Boolean) = {
    funcName should {
      "throw illegalArgumentException if hand is not a proper size" in {
        assertThrows[IllegalArgumentException](fourOfAKindFunc(Seq.empty))
        val cards = Seq(Card(2, 2), Card(3, 3), Card(6, 1))
        assertThrows[IllegalArgumentException](fourOfAKindFunc(cards))
      }

      "return false for hand that haven't 4 cards with same suit" in {
        val cards = Seq(Card(2, 2), Card(3, 3), Card(6, 1), Card(8, 2), Card(1, 3))
        assert(fourOfAKindFunc(cards) === false)
      }

      "return true for hand with 4 same suit cards" in {
        val cards = Seq(Card(2, 2), Card(3, 2), Card(6, 2), Card(8, 2), Card(1, 3))
        assert(fourOfAKindFunc(cards) === true)
      }

      "return true for hand with 5 same suit cards" in {
        val cards = Seq(Card(2, 2), Card(3, 2), Card(6, 2), Card(8, 2), Card(1, 2))
        assert(fourOfAKindFunc(cards) === true)
      }
    }
  }

  checkFourOfAKind("isFourOfAKind", Task2.isFourOfAKind)
  checkFourOfAKind("isFourOfAKindSimplest", Task2.isFourOfAKindSimplest)
  checkFourOfAKind("isFourOfAKindWithTask1", Task2.isFourOfAKindWithTask1)
}
