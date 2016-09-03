package com.pronvis.compstack

object Task2 {
  private val properHandSize = 5

  case class Card(rank: Int, suit: Int)

  def isFourOfAKind(hand: Seq[Card]): Boolean = {
    if(hand.size != properHandSize) {
      throw new IllegalArgumentException(s"Hand should contain exactly $properHandSize cards, but actual size is: ${hand.size}!")
    }

    val suits = hand.map(_.suit % 4) //todo: hack, move suit logic to Card class
    val suitMapping = suits.foldLeft(Array(0, 0, 0, 0)) { case (array, suit) =>
      array(suit) += 1
      array
    }

    suitMapping.contains(4)
  }

  def isFourOfAKindSimplest(hand: Seq[Card]): Boolean = {
    if(hand.size != properHandSize) {
      throw new IllegalArgumentException(s"Hand should contain exactly $properHandSize cards, but actual size is: ${hand.size}!")
    }

    val groupedBySuit = hand.groupBy(_.suit)
    groupedBySuit.values.toSeq.map(_.size).contains(4)
  }

  def isFourOfAKindWithTask1(hand: Seq[Card]): Boolean = {
    if(hand.size != properHandSize) {
      throw new IllegalArgumentException(s"Hand should contain exactly $properHandSize cards, but actual size is: ${hand.size}!")
    }

    val suits = hand.map(_.suit)
    Task1.getPairs(suits).size == 1
  }

}
