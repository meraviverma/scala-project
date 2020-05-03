package singleton

class ExampleofCompanion  {
  var str1="Companion example"
  var str2="Two companion example"
  
  def display(){
    println(str1)
    println(str2)
  }
}

// Companion object 
object ExampleofCompanion 
{ 
    def main(args: Array[String])  
    { 
        var obj = new ExampleofCompanion(); 
        obj.display(); 
    } 
} 