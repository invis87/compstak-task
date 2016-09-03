package com.pronvis.compstack

import scala.annotation.tailrec

object Task3 {

  def merge(a: Seq[Int], b: Seq[Int]): Seq[Int] = {
    val result = scala.collection.mutable.ListBuffer.empty[Int]

    @tailrec
    def helper(first: Seq[Int], second: Seq[Int]): Unit = (first, second) match {
      case (f, Nil) => result ++= f
      case (Nil, s) => result ++= s
      case (f, s)   =>
        val (fhead, shead) = (f.head, s.head)
        if (fhead > shead) {
          result += shead
          helper(f, s.tail)
        } else {
          result += fhead
          helper(f.tail, s)
        }
    }
    helper(a, b)

    result
  }
}
