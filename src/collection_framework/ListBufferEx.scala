package collection_framework

import scala.collection.mutable.ListBuffer

object ListBufferEx {
  def main(args:Array[String]):Unit={
    
    val p1 = List("Kim")
    val p2 = "Julia" :: p1
    val p3 = "Judi" :: p2
    
    println(p3)
    
    //ListBuffer
    var fruits = new ListBuffer[String]()
    fruits += "Apple"
    fruits += "Banana"
    fruits += "Orange"
    
    val fruitsList = fruits.toList
    
    
    
    
  }
}