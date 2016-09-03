package com.pronvis.compstack

import com.pronvis.compstack.Task2.Card

object Main {
  def main(args: Array[String]): Unit = {

    val cards = Seq(Card(2, 3), Card(3, 2), Card(6, 2), Card(8, 2), Card(1, 3))
    println(Task2.isFourOfAKindWithTask1(cards))
  }


}
