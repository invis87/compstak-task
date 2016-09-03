package com.pronvis.compstack

import org.scalatest.{Matchers, FlatSpec}

class Task3Test extends FlatSpec with Matchers {
  it should "return empty sequence if both inputs is empty" in {
    assert(Task3.merge(Seq.empty, Seq.empty) === Seq.empty)
  }

  it should "return return first collection is second is empty" in {
    val first = Seq(1, 2, 3)
    assert(Task3.merge(first, Seq.empty) === first)
  }

  it should "return return second collection if first is empty" in {
    val second = Seq(1, 2, 3)
    assert(Task3.merge(Seq.empty, second) === second)
  }

  it should "properly merge 2 collections" in {
    val first = Seq(2, 4, 6)
    val second = Seq(1, 3, 5)
    assert(Task3.merge(first, second) === Seq(1, 2, 3, 4, 5, 6))
  }

  it should "properly merge collection size one with another one" in {
    val first = Seq(1, 2, 4, 5)
    val second = Seq(3)
    assert(Task3.merge(first, second) === Seq(1, 2, 3, 4, 5))
  }
}
