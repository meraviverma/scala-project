package integerCode

//Given a set of integer Insert integer between them so that it become the largest number

//Example: 783 insert 9 new number will be 9783
//Example: 783 insert 4 new number will be 7843

object InsertInteger {
  def makenumber(n:Int,value:Int){
    
    val len=value.toString().length()
    
   for(i<-0 until len){
     val n1=value.toString().charAt(i)
     //println(n1)
     if(n<n1)
       println(n1)
   }
    println(value.toString().length())
  }
  

  def main(args: Array[String]) {
      val n=9
      val value= 783
      
      val largestnumber=makenumber(n,value)
      println(largestnumber);
      
  }
  }