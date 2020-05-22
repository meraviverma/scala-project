package com.mytut.demo

object ImplicitConversion {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  class Rational private (val n: Int, val d: Int) {
  require(d != 0, "Zero denominator!")

  override def toString: String = s"R($n/$d)"

  def +(other: Rational): Rational =
    new Rational(
      this.n * other.d + this.d * other.n,
      this.d * other.d
    )
}

object Rational {
  def apply(n: Int, d: Int): Rational =
    new Rational(n, d)

  implicit def apply(i: Int): Rational =
    new Rational(i, 1)
}

val half = Rational(1, 2)                         //> half  : com.mytut.demo.ImplicitConversion.Rational = R(1/2)

half + 5                                          //> res0: com.mytut.demo.ImplicitConversion.Rational = R(11/2)

Rational(5) + half                                //> res1: com.mytut.demo.ImplicitConversion.Rational = R(11/2)

5 + half                                          //> res2: com.mytut.demo.ImplicitConversion.Rational = R(11/2)
}