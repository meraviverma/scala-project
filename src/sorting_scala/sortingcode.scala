package sorting_scala

object sortingcode {
  def main(args:Array[String]):Unit={
    
//Scala usesTimSort, which is a hybrid of Merge Sort and Insertion Sort.
//Here is three sorting method of Scala.
    
  //sorted
    
    /*The sort is stable. That is, elements that are equal (as determined by
   `lt`) appear in the same order in the sorted sequence as in the original.
   [[scala.math.Ordering]]*/
    val seq=Seq(12,3,78,121,90,1,121)
    println(seq.sorted)
    
    println(seq.sorted(Ordering.Int.reverse))
    
/*If you want to sort on the basis of an attribute of a case class using  sorted method, 
then you need to extend Ordered trait and override abstract method compare. 
In compare method, we define on which attribute we want to sort the objects of  case class.
here is an example sort on the basis of the name attribute of the case class.*/

    case class Emp(id:Int,name:String,salary:Double) extends Ordered[Emp]{
      def compare(that:Emp)=this.name compare that.name
    }
    
    val firstEmp = Emp(1, "michael", 12000.00)
    val secondEmp = Emp(2, "james", 12000.00)
    val thirdEmp = Emp(3, "shaun", 12000.00)
    
    val empList = List(firstEmp,secondEmp,thirdEmp)
    println(empList.sorted)
    
    
    //sortBy
    case class Emp1(id: Int, name: String, salary: Double)
    val firstEmp1 = Emp1(1,"james",12000.00)
    val secondEmp1 = Emp1(2,"shaun",13000.00)
    val thirdEmp1 = Emp1(3,"michael",10000.00)
    val forthEmp1 = Emp1(4,"michael",11000.00)
    val fifthEmp1 = Emp1(5,"michael",15000.00)
    
    val empList1 = List(firstEmp1,secondEmp1,thirdEmp1,forthEmp1,fifthEmp1)
    println(empList1.sortBy(_.name))
    println(empList1.sortBy(_.salary))
    
    val list = List(('b',30),('c',10),('a',20))
    println(list.sortBy(_._2))
    println(list.sortBy(_._1))
    
    //sortWith(function)
    //def sortWith(lt: (A, A) => Boolean): Repr
    
    //The sortWith function Sorts this sequence according to a comparison function. 
    //It takes a comparator function and sort according to it.you can provide your own custom comparison function.
    
    println("####### sortWith ##############")
    println(empList.sortWith(_.salary > _.salary))
    
    //Sort using own function
    def sortBySalary(emp1:Emp,emp2:Emp):Boolean={
      emp1.salary < emp2.salary
    }
    
    println("####### Sort using our own function #############")
    val result = empList.sortWith((emp1,emp2) => sortBySalary(emp1,emp2))
    println(result)
    
    //How to sort a Scala Array
    println("####### Sorted Fruits #############")
    val fruits = Array("cherry", "apple", "banana")
    val sortedfruits=scala.util.Sorting.quickSort(fruits)
    println(sortedfruits);
    
    //sort a sequence (Seq, List, Array, Vector) in Scala
    val a = List(10, 5, 8, 1, 7).sorted
    val b = List("banana", "pear", "apple", "orange").sorted
    println(a+"----a and b sorted---"+b)
    
    //The “rich” versions of the numeric classes (like RichInt) and the StringOps 
    //class all extend the Ordered trait, so they can be used with the sorted method.
    
    println(List(10, 5, 8, 1, 7).sortWith(_ < _))
    println(List(10, 5, 8, 1, 7).sortWith(_ > _))
    println(List("banana", "pear", "apple", "orange").sortWith(_ < _))
    println(List("banana", "pear", "apple", "orange").sortWith(_ > _))
    println(List("banana", "pear", "apple", "orange").sortWith(_.length < _.length))
    println(List("banana", "pear", "apple", "orange").sortWith(_.length > _.length))
    
    //defining function
    def sortByLength(s1: String, s2: String) = {
      println("comparing %s and %s".format(s1, s2))
      s1.length > s2.length
    }
    
    println(List("banana", "pear", "apple").sortWith(sortByLength))
    
    
    class Person (var name: String) {
    override def toString = name
    }
    val ty = new Person("Tyler")
    val al = new Person("Al")
    val paul = new Person("Paul")
    val dudes = List(ty, al, paul)
    
    println(dudes.sortWith(_.name < _.name))
    println(dudes.sortWith(_.name > _.name))
    
    //Person class with the sorted method, just mix the Ordered trait into the Person class, 
    //and implement a compare method
    
    class Person1(var name:String)extends Ordered[Person1]{
      override def toString = name
      // return 0 if the same; negative if this < that; positive if this > that
    def compare (that: Person1) = {
        if (this.name == that.name)
            0
        else if (this.name > that.name)
            1
        else
          -1
    }
    }
    
    
  }
}

//OUTPUT
/*List(1, 3, 12, 78, 90, 121, 121)
List(121, 121, 90, 78, 12, 3, 1)
List(Emp(2,james,12000.0), Emp(1,michael,12000.0), Emp(3,shaun,12000.0))
List(Emp1(1,james,12000.0), Emp1(3,michael,10000.0), Emp1(4,michael,11000.0), Emp1(5,michael,15000.0), Emp1(2,shaun,13000.0))
List(Emp1(3,michael,10000.0), Emp1(4,michael,11000.0), Emp1(1,james,12000.0), Emp1(2,shaun,13000.0), Emp1(5,michael,15000.0))
List((c,10), (a,20), (b,30))
List((a,20), (b,30), (c,10))
####### sortWith ##############
List(Emp(1,michael,12000.0), Emp(2,james,12000.0), Emp(3,shaun,12000.0))
####### Sort using our own function #############
List(Emp(1,michael,12000.0), Emp(2,james,12000.0), Emp(3,shaun,12000.0))
####### Sorted Fruits #############
()
List(1, 5, 7, 8, 10)----a and b sorted---List(apple, banana, orange, pear)
List(1, 5, 7, 8, 10)
List(10, 8, 7, 5, 1)
List(apple, banana, orange, pear)
List(pear, orange, banana, apple)
List(pear, apple, banana, orange)
List(banana, orange, apple, pear)
comparing pear and banana
comparing banana and pear
comparing apple and pear
comparing apple and pear
comparing apple and banana
comparing banana and apple
List(banana, apple, pear)
List(Al, Paul, Tyler)
List(Tyler, Paul, Al)
 * */

