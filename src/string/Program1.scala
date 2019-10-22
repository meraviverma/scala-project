package string

//Given a set of string, make the first letter of string capital and rest small.
//Ex: [Ram,ravi,raJ] output [Ram,Ravi,Raj]

object Program1 {
  def main(args:Array[String]):Unit={
    
    var z=Array("Ram","raVi","raJ")
    
    for(elm <- z){
      //1St Way
      //println(elm.map(_.toLower).capitalize);
      //One more way to do it
      var newel=elm.map(_.toLower)
      val chars = newel.toCharArray
      var l2=chars(0).toUpper
      var newlist=newel.toList
      println((l2::newlist.drop(1))mkString(""))
      //println(elm.capitalize)
      
      
    }
    //var small=z.map(_.toLowerCase())
    //var finalstr=small
    //var finalelm=(small.charAt(0))
  }
}
