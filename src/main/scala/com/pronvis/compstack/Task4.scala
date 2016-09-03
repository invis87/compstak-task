package com.pronvis.compstack

import scala.annotation.tailrec

object Task4 {

  /**
    * Find maximum {base} pow in {x} dividers.
    * For example:
    * (36, 6) = 2 - 36 is 6 in power of 2
    * (72, 6) = 2 - maximum power of 6 divider in 72 is 36
    * (150, 5) = 2 - maximus power of 5 divider in 150 is 25
    * @param x
    * @param base
    * @return
    */
   private def maximumPower(x: Int, base: Int): Int = {
    @tailrec
    def helper(i: Int, res: Int): Int = {
      val divide = i % base
      if(divide == 0) {
        helper(i / base, res + 1)
      } else {
        res
      }
    }

    helper(x, 0)
  }

  def f(n: Int): Int = {
    val fiveMultipliers = Range(1, Math.abs(n) / 5 + 1)
    fiveMultipliers.map(maximumPower(_, 5) + 1).sum // +1 because we already divide by 5 in step above
  }

}
