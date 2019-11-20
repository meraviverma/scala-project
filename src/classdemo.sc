object classdemo {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
println(2+2)                                      //> 4
val p=new Person("Adam","Ravi")                   //> the constructor begins
                                                  //| HOME=C:\Users\rv00451128
                                                  //| Adam Ravi is 0 years old
                                                  //| Still in constructor
                                                  //| p  : Person = Adam Ravi is 0 years old
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