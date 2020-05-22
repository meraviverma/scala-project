package com.mytut.demo

object companionObject {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  class Rational private (val n: Int, val d: Int) {
  require(d != 0, "Zero denominator!")

  override def toString: String = s"R($n/$d)"

  // auxiliary constructor -
  // don't really need this with factory methods
  // def this(i: Int) = this(i, 1)

  def min(other: Rational): Rational =
    if ((n.toDouble / d) < (other.n.toDouble / other.d))
      this else other

  def +(other: Rational): Rational =
    new Rational(
      this.n * other.d + this.d * other.n,
      this.d * other.d
    )
}

// in same source file as Rational class
object Rational {
  def apply(n: Int, d: Int): Rational =
    new Rational(n, d)

  def apply(i: Int): Rational =
    new Rational(i, 1)
}

val fifth = Rational(1, 5)                        //> fifth  : com.mytut.demo.companionObject.Rational = R(1/5)
val five = Rational(5)                            //> five  : com.mytut.demo.companionObject.Rational = R(5/1)

// can no longer call new, it's private
// val half = new Rational(1, 2)

val sum = five + fifth                            //> sum  : com.mytut.demo.companionObject.Rational = R(26/5)

  
}