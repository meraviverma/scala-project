package com.mytut.demo

object overloading {
  //println("Welcome to the Scala worksheet")


class Rational private(val n:Int,val d:Int){
	require(d!=0,"zero denominator")
	
	override def toString:String=s"R($n/$d)"
	
	def +(other:Rational):Rational=
		new Rational(
			this.n * other.d + this.d * other.n,
			this.d * other.d
			)
	def +(i:Int):Rational=
	this + Rational(i)
}

object Rational{
def apply(n:Int,d:Int):Rational=
new Rational(n,d)

def apply(i:Int):Rational=
new Rational(i,1)
}

val half=Rational(1,2)                            //> half  : com.mytut.demo.overloading.Rational = R(1/2)

half + 5                                          //> res0: com.mytut.demo.overloading.Rational = R(11/2)
}