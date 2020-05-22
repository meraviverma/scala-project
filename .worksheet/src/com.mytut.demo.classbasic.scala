package com.mytut.demo

object classbasic {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(88); 
  println("Welcome to the Scala worksheeet")
  class demo
  
  class DemoWithFieldsAndMethods{
  val x=10
  val y=x*2
  def timesY(a:Int):Int=a*y
  };$skip(168); 
  
  val demoWithFieldsAndMethods=new DemoWithFieldsAndMethods;System.out.println("""demoWithFieldsAndMethods  : com.mytut.demo.classbasic.DemoWithFieldsAndMethods = """ + $show(demoWithFieldsAndMethods ));$skip(32); val res$0 = 
  
  demoWithFieldsAndMethods.x;System.out.println("""res0: Int = """ + $show(res$0));$skip(37); val res$1 = 
  demoWithFieldsAndMethods.timesY(4)
  
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
  };System.out.println("""res1: Int = """ + $show(res$1));$skip(312); 
  
  val demoWithparams=new DemoWithParams("Zoe");System.out.println("""demoWithparams  : com.mytut.demo.classbasic.DemoWithParams = """ + $show(demoWithparams ));$skip(26); 
  demoWithparams.sayHi(5);$skip(114); val res$2 = 
    //cannot access the name from outside
    //demoWithparams.name //This will not work
  demoWithparams.theName;System.out.println("""res2: String = """ + $show(res$2));$skip(210); 
  
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
  };$skip(597); 
  
  val half=new Rational(1,2);System.out.println("""half  : com.mytut.demo.classbasic.Rational = """ + $show(half ));$skip(129); 
 // val divByZero=new Rational(1,0)
 
 //Could also write require(this.d != 0,"Zero Denominator!")
  val fifth=new Rational(1,5);System.out.println("""fifth  : com.mytut.demo.classbasic.Rational = """ + $show(fifth ));$skip(32); 
  
  val smaller=fifth min half;System.out.println("""smaller  : com.mytut.demo.classbasic.Rational = """ + $show(smaller ));$skip(28); 
  
  val sum=half add fifth;System.out.println("""sum  : com.mytut.demo.classbasic.Rational = """ + $show(sum ));$skip(27); 
  
  val sum1=half + fifth;System.out.println("""sum1  : com.mytut.demo.classbasic.Rational = """ + $show(sum1 ));$skip(37); 
  
  val sum3=half + new Rational(1);System.out.println("""sum3  : com.mytut.demo.classbasic.Rational = """ + $show(sum3 ))}
}
