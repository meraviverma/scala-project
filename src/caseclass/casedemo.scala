package caseclass

case class caseclass(var a:Int,b:Int)
object casedemo {
  def main(args: Array[String])={
  
    var c=caseclass(10,20)
    c.a=50;
    println("c= "+c.a)
    println("c= "+c.b)
    
  }
}