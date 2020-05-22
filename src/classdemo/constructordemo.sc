package com.mytut.demo

object constructordemo {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  println("#### Primary Constructor Example ####")//> #### Primary Constructor Example ####
  
  class Employee{
  println("Primary constructor Example")
  }
  
  //Initilize the constructor
  val e=new Employee                              //> Primary constructor Example
                                                  //| e  : com.mytut.demo.constructordemo.Employee = com.mytut.demo.constructordem
                                                  //| o$Employee$1@2f7c7260
  
  val e1=new Employee()                           //> Primary constructor Example
                                                  //| e1  : com.mytut.demo.constructordemo.Employee = com.mytut.demo.constructorde
                                                  //| mo$Employee$1@2d209079
  
  //Parameterized Constructor Example:
  
  class mathoperation(x:Int,y:Int){
  def sum()=x+y
  def mul(v1:Int,v2:Int)=v1*v2
  }
  
  val mo=new mathoperation(5,10)                  //> mo  : com.mytut.demo.constructordemo.mathoperation = com.mytut.demo.construc
                                                  //| tordemo$mathoperation$1@6bdf28bb
  mo.sum                                          //> res0: Int = 15
  mo.mul(4,5)                                     //> res1: Int = 20
  
  //e create primary constructor using the var in parameter then Scala compiler
  //automatically create a getter and setter method for them
  class Employee1(var empId: Int,var name: String,var salary :Double)
  val emp1=new Employee1(1,"smith",300)           //> emp1  : com.mytut.demo.constructordemo.Employee1 = com.mytut.demo.constructo
                                                  //| rdemo$Employee1$1@6b71769e
  
  emp1.name="ram"
  emp1.name                                       //> res2: String = ram
  emp1.salary                                     //> res3: Double = 300.0
  
  //If you create the class using val in the
  //primary constructor then Scala compiler generates only getter method.
  
  class Employee2(val empId: Int,val name: String,val salary :Double)
  
  val emp2=new Employee2(2,"ram",333)             //> emp2  : com.mytut.demo.constructordemo.Employee2 = com.mytut.demo.construct
                                                  //| ordemo$Employee2$1@1d251891
  emp2.name                                       //> res4: String = ram
 // emp2.name="" // Error reassignment to val
 
 //Now if you define Primary constructor using val or var with private modifier then
 //Scala compiler will not generate getter and setter method for them.
 
 class Employee3(private var empId: Int,private val name :String) {
		def getName = name
	}
	
	val emp3=new Employee3(1,"john")          //> emp3  : com.mytut.demo.constructordemo.Employee3 = com.mytut.demo.construct
                                                  //| ordemo$Employee3$1@48140564
	emp3.getName                              //> res5: String = john
	//emp3.name
  //Eror: value name in class Employee3 cannot be accessed in com.mytut.demo.constructordemo.Employee3
}