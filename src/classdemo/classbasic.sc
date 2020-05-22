package com.mytut.demo

object classbasic {
  println("Welcome to the Scala worksheeet")      //> Welcome to the Scala worksheeet
  class demo
  
  class DemoWithFieldsAndMethods{
  val x=10
  val y=x*2
  def timesY(a:Int):Int=a*y
  }
  
  val demoWithFieldsAndMethods=new DemoWithFieldsAndMethods
                                                  //> demoWithFieldsAndMethods  : com.mytut.demo.classbasic.DemoWithFieldsAndMetho
                                                  //| ds = com.mytut.demo.classbasic$DemoWithFieldsAndMethods$1@2f7c7260
  
  demoWithFieldsAndMethods.x                      //> res0: Int = 10
  demoWithFieldsAndMethods.timesY(4)              //> res1: Int = 80
  
  class DemoWithParams(name:String){
  // making it val can help to access
  //Example: class demoWithparams(val name:String){
  val theName=name
  def sayHi(times:Int):Unit={
  	var time=0
  	
  	while(time < times){
  	println(name)
  	time+=1
  	}
  }
  }
  
  val demoWithparams=new DemoWithParams("Zoe")    //> demoWithparams  : com.mytut.demo.classbasic.DemoWithParams = com.mytut.demo.
                                                  //| classbasic$DemoWithParams$1@2d209079
  demoWithparams.sayHi(5)                         //> Zoe
                                                  //| Zoe
                                                  //| Zoe
                                                  //| Zoe
                                                  //| Zoe
    //cannot access the name from outside
    //demoWithparams.name //This will not work
  demoWithparams.theName                          //> res2: String = Zoe
  
  //class Rational(val n:Int,val d:Int)
  
  
                                                  
  
  //require(1 > 2,"good the universe make the sense")
  require(1 < 2,"Good the universe make the sense")
  //class Rational(val n:Int,val d:Int)
  
  class Rational(val n:Int,val d:Int){
  require(d !=0, "zero denominator!!")
  
  override def toString:String=s"R($n/$d)"
  
  def this(i:Int)=this(i,1)
  
 def min(other:Rational):Rational=
 		 if ((n.toDouble / d) < (other.n.toDouble / other.d))
 		this else other
 	
 	def add(other:Rational):Rational=
 		new Rational(
 		this.n * other.d + this.d * other.n,
 		this.d * other.d
 		)
 		//Symbolic Method
 		def +(other:Rational):Rational=
 		new Rational(
 		n * other.d + this.d * other.n,
 		d * other.d
 		)
  }
  
  val half=new Rational(1,2)                      //> half  : com.mytut.demo.classbasic.Rational = R(1/2)
 // val divByZero=new Rational(1,0)
 
 //Could also write require(this.d != 0,"Zero Denominator!")
  val fifth=new Rational(1,5)                     //> fifth  : com.mytut.demo.classbasic.Rational = R(1/5)
  
  val smaller=fifth min half                      //> smaller  : com.mytut.demo.classbasic.Rational = R(1/5)
  
  val sum=half add fifth                          //> sum  : com.mytut.demo.classbasic.Rational = R(7/10)
  
  val sum1=half + fifth                           //> sum1  : com.mytut.demo.classbasic.Rational = R(7/10)
  
  val sum3=half + new Rational(1)                 //> sum3  : com.mytut.demo.classbasic.Rational = R(3/2)
}