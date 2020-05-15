object Demo {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(57); 
  println("Welcome to the Scala worksheet");$skip(209); 
  
  val convertLowNumToString = new PartialFunction[Int, String] {
    val nums = Array("one", "two", "three", "four", "five")
    def apply(i: Int) = nums(i-1)
    def isDefinedAt(i: Int) = i > 0 && i < 6
};System.out.println("""convertLowNumToString  : PartialFunction[Int,String]{val nums: Array[String]} = """ + $show(convertLowNumToString ));$skip(57); 

lazy val l={
      println("evaluating")
      9
     };System.out.println("""l: => Int = <lazy>""")}
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
