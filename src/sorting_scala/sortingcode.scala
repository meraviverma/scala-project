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
    
  }
}