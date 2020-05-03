package singleton

object classExample {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(85); 
 
 println("Welcome to the Scala worksheet");$skip(84); 
 
 def apply(name:String):classExample={
 var p=new classExample
 p.name=name
 p
 };System.out.println("""apply: (name: String)singleton.classExample""")}
}

class classExample{
 var name="ravi verma"
}

class Person {
    var name: Option[String] = None
    var age: Option[Int] = None
    override def toString = s"$name, $age"
}

object Person {

    // a one-arg constructor
    def apply(name: Option[String]): Person = {
        var p = new Person
        p.name = name
        p
    }

    // a two-arg constructor
    def apply(name: Option[String], age: Option[Int]): Person = {
        var p = new Person
        p.name = name
        p.age = age
        p
    }

}

//val p1 = Person(Some("Fred"))
//val p2 = Person(None)

//val p3 = Person(Some("Wilma"), Some(33))
//val p4 = Person(Some("Wilma"), None)
