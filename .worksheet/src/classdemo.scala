object classdemo {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(62); 
  println("Welcome to the Scala worksheet");$skip(13); 
println(2+2);$skip(32); 
val p=new Person("Adam","Ravi");System.out.println("""p  : Person = """ + $show(p ))}
}
class Person(var firstname:String,var lastname:String){
println("the constructor begins")

//some class fields
private val HOME=System.getProperty("user.home")
var age=0

//some method
override def toString=s"$firstname $lastname is $age years old"
def printHome{println(s"HOME=$HOME")}
def printFullName{println(this)}

printHome
printFullName
println("Still in constructor")


}
