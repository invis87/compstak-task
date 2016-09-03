package com.pronvis.compstack

import org.scalatest.{FlatSpec, Matchers}
import Task1._

class Task1Test extends FlatSpec with Matchers {

  it should "should return proper number of pairs" in {
    val testList = List(1, 8, 12, 5, 7)
    val pairs = getPairs(testList)
    pairs.size === 10
  }

  it should "should return proper number of pairs for input with duplicates" in {
    val testList = List(1, 8, 12, 5, 7, 8, 1)
    val pairs = getPairs(testList)
    pairs.size === 12
  }

  it should "should contain (x, x) pair if input list contains two x's" in {
    val testList = List(1, 8, 12, 5, 7, 1)
    val pairs = getPairs(testList)
    pairs should contain(1, 1)
  }

  it should "return list of empty pairs for empty input" in {
    val testList = List.empty
    val pairs = getPairs(testList)
    pairs.size === 0
  }

  it should "return one pair for a list of same numbers" in {
    val testList = Stream.from(1, 0).take(100).toList
    val pairs = getPairs(testList)
    pairs.size === 1
  }

}
