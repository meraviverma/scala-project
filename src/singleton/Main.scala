package singleton

object Exampleofsingleton{
  var str1="Singleton example"
  var str2="Two singleton example"
  
  def display(){
    println(str1)
    println(str2)
  }
}
object Main {
  def main(args:Array[String]){
    
    Exampleofsingleton.display()
  }
}