package collection_framework.option

object Demo {
  def main(args: Array[String]) {
      val capitals = Map("France" -> "Paris", "Japan" -> "Tokyo")
      
      println("capitals.get( \"France\" ) : " +  capitals.get( "France" ))
      println("capitals.get( \"India\" ) : " +  capitals.get( "India" ))
   
  
  def show(x: Option[String]) = x match {
      case Some(s) => s
      case None => "?"
   }
  println(show(capitals get "Japan"))
  println(show(capitals get "India"))
  }
}
//OUTPUT
/*capitals.get( "France" ) : Some(Paris)
capitals.get( "India" ) : None
Tokyo
?*/
