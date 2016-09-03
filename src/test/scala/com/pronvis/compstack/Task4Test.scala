package com.pronvis.compstack

import org.scalatest.{Matchers, FlatSpec}

class Task4Test extends FlatSpec with Matchers {
  it should "return zero for zero input" in {
    assert(Task4.f(0) === 0)
  }

  it should "return zero for factorial that don't have trailing zeroes" in {
    assert(Task4.f(4) === 0)
  }

  it should "return 1 for factorial that have one trailing zeroe. 1 * 2 * 3 * 4 * 5 = 120" in {
    assert(Task4.f(5) === 1)
  }

  it should "return proper trailing zeroes for test data" in {
    assert(Task4.f(29) === 6)
    assert(Task4.f(142) === 34)
    assert(Task4.f(409) === 100)
  }
}
