package string

//Given a set of string, make the first letter of string capital and rest small.
//Ex: [Ram,ravi,raJ] output [Ram,Ravi,Raj]

object Program1 {
  def main(args:Array[String]):Unit={
    
    var z=Array("Ram","raVi","raJ")
    
    for(elm <- z){
      println(elm.map(_.toLower).capitalize);
      val small=elm.charAt(0)
      //println(elm.capitalize)
      
      
    }
    //var small=z.map(_.toLowerCase())
    //var finalstr=small
    //var finalelm=(small.charAt(0))
  }
}