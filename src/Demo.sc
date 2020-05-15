object Demo {
  println("Welcome to the Scala worksheet")
  
  val convertLowNumToString = new PartialFunction[Int, String] {
    val nums = Array("one", "two", "three", "four", "five")
    def apply(i: Int) = nums(i-1)
    def isDefinedAt(i: Int) = i > 0 && i < 6
}

lazy val l={
      println("evaluating")
      9
     }
}

class SomeClass {
    def printFilename() = {
        println(SomeClass.HiddenFilename)
    }
}

object SomeClass {
    private val HiddenFilename = "/tmp/foo.bar"
}

class Person(var name: String, var age: Int)

object Person {
    def unapply(p: Person): String = s"${p.name}, ${p.age}"
}

//var p = new Person("Lori", 29)