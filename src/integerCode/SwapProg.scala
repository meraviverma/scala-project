package integerCode

//Write a loop that swaps adjacent elements of an array of integers. For example,
//Array(1, 2, 3, 4, 5) becomes Array(2, 1, 4, 3, 5).
import scala.collection.mutable.ListBuffer

object SwapProg {
  def main(agrs:Array[String]):Unit={
   
    val elem=Array(1,2,3,4,5)
    var newelm= new ListBuffer[Int]()
    
    //increment loop by 2
    for( i <- 0 until (elem.length - 1) by 2){
      newelm += elem(i+1)
      newelm += elem(i)
      
    }
    if(elem.length % 2 != 0)
     newelm += elem(elem.length - 1)
    
     println("swapped array")
      newelm.toList
    
   newelm.foreach(println)
  }
}