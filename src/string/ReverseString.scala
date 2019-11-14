package string

//Write a code to reverse string
//given a list of string reverse each element of string
import scala.collection.mutable.ListBuffer

object ReverseString {
  
  def main(args:Array[String]):Unit={
    val list_str=List("ram","samas");
  val str="msis"
  //println(list_str.foreach(x=>x.reverse))
  
  //reverse String function: Iterating each character
  def reversestring(str:String):String={
    val buf=new StringBuilder
    //val len=str.length
    for(i<- 0 until str.length){
      buf.append(str.charAt(str.length() - i - 1))
    }
    
    if(buf.toString() == str){
    println("Palinderom")
    }else println("Not Palindrom")
  
    //println(buf)
    buf.toString  
    
    }
  
  def reverseliststring(str:String):List[String]={
    val buf=new StringBuilder
    val out=new ListBuffer[String]()
    //val len=str.length
    for(i<- 0 until str.length){
      buf.append(str.charAt(str.length() - i - 1))
    }
    out += buf.toString()
    println(out.toList)
    out.toList
    }
  
  //val reverse_list=ListBuffer()
//  reverse_list.//
  //for(i <- 0 until list_str.length){
 val rev_list=list_str.foreach((x:String)=>reverseliststring(x))
  //reverse_list.appendAll(rev_list)
  //}
  
  println(rev_list)
  
  println(reversestring("SsamasS"))
  println(reversestring("RashhaR"))
  println(revstr("dalad"))
  //using direct method
  def revstr(str:String):String={
    str.reverse
  }
  
  
  
  }
  
}