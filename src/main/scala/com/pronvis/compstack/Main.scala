package com.pronvis.compstack

import com.pronvis.compstack.Task2.Card

object Main {

  def main(args: Array[String]): Unit = {

    println("Task1:")
    Task1.printPairs(List(1, 8, 12, 5, 7))
    println

    println("Task2:")
    val cards = List(Card(2,2), Card(2,3), Card(4,2), Card(6,2), Card(1,2))
    println(s"Hand (${cards.mkString(", ")}) isFourOfAKind: ${Task2.isFourOfAKind(cards)}")
    println

    println("Task3:")
    val seqA = List(1,3,5)
    val seqB = List(2,4,6)
    println(s"Result of merge sequences (${seqA.mkString(", ")}) and (${seqB.mkString(", ")}) is: (${Task3.merge(seqA, seqB).mkString(", ")})")
    println

    println("Task4:")
    val x = 1587
    println(s"Trailing zeroes in factorial of $x is: ${Task4.f(x)}")
  }

}
