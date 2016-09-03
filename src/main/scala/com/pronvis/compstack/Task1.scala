package com.pronvis.compstack

import scala.annotation.tailrec

object Task1 {
  @tailrec
  private def helper(input: Seq[Int], result: Seq[(Int, Int)]): Seq[(Int, Int)] = input.isEmpty match {
    case true  => result
    case false =>
      val head = input.head
      val tail = input.tail
      val filteredTail = tail.contains(head) match {
        case false => tail
        case true  => tail.filter(_ != head)
      }
      val res = result ++ tail.map(x => (head, x))
      helper(filteredTail, res)
  }

  def getPairs(inputList: Seq[Int]): Seq[(Int, Int)] = helper(inputList, Seq.empty)

  def printPairs(inputList: Seq[Int]): Unit = {
    val result = getPairs(inputList)
    println(result.mkString("\n"))
  }
}
