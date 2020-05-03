object classdemo {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
println(2+2)                                      //> 4
val p=new Person("Adam","Ravi")                   //> the constructor begins
                                                  //| HOME=C:\Users\User
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
def printSHome{println(s"HOME=$HOME")}
def printFullName{println(this)}

printSHome
printFullName
println("Still in constructor")
}

abstract class Pet(name:String){
	def speak():Unit=println("Yo")
	def comeToCustomer():Unit
}

class Dog(name: String)extends Pet(name){
override def speak()=println("woof")
def comeToCustomer()=println("Here I Come")

def main(args:Array[String]){
	val d=new Dog("Rover")
	println(d.speak)
}

}



//class demo extends Dog{
//def main(args:Array[String]){