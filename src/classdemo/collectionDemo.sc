package com.mytut.demo

object collectionDemo {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val words=List("one","two","three","four")      //> words  : List[String] = List(one, two, three, four)
  val nums=List(2,3,5,8,13,21)                    //> nums  : List[Int] = List(2, 3, 5, 8, 13, 21)
  
  nums.sum                                        //> res0: Int = 52
  nums.product                                    //> res1: Int = 65520
  
  //SORTING
  case class Person(name:String,age:Int)
  val xs=List(Person("Harry",25),Person("Sally",21),Person("Dhawan",30))
                                                  //> xs  : List[com.mytut.demo.collectionDemo.Person] = List(Person(Harry,25), Pe
                                                  //| rson(Sally,21), Person(Dhawan,30))
  
  xs.sortWith((p1,p2)=>p1.age < p2.age)           //> res2: List[com.mytut.demo.collectionDemo.Person] = List(Person(Sally,21), Pe
                                                  //| rson(Harry,25), Person(Dhawan,30))
  
  xs.sortBy(_.name)                               //> res3: List[com.mytut.demo.collectionDemo.Person] = List(Person(Dhawan,30), P
                                                  //| erson(Harry,25), Person(Sally,21))
  xs.sortBy(_.age)                                //> res4: List[com.mytut.demo.collectionDemo.Person] = List(Person(Sally,21), Pe
                                                  //| rson(Harry,25), Person(Dhawan,30))
  
  List(1,3,21,9,2,3,11).sorted                    //> res5: List[Int] = List(1, 2, 3, 3, 9, 11, 21)
  
  //Other Sorting Way
  implicit object PersonOrdering extends Ordering[Person]{
  	override def compare(x:Person,y:Person)={
  		if(x.name == y.name) x. age - y.age
  		else if(x.name > y.name) 1 else -1
  	}
  }
  xs.sorted                                       //> res6: List[com.mytut.demo.collectionDemo.Person] = List(Person(Dhawan,30), P
                                                  //| erson(Harry,25), Person(Sally,21))
  
  //sort are stable
  
  //Matrix Transpose
  val matrix=List(List(1,2,3),List(4,5,6),List(7,8,9))
                                                  //> matrix  : List[List[Int]] = List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9)
                                                  //| )
  matrix.transpose                                //> res7: List[List[Int]] = List(List(1, 4, 7), List(2, 5, 8), List(3, 6, 9))
  
  matrix.flatten.sum                              //> res8: Int = 45
  
    //group By first letters of a word:
  val words1=List("four","four","char","word")    //> words1  : List[String] = List(four, four, char, word)
  words1.groupBy(_.head)                          //> res9: scala.collection.immutable.Map[Char,List[String]] = Map(w -> List(word
                                                  //| ), c -> List(char), f -> List(four, four))
  
  //Even More function
  trait Fruit
  case class Apple(name:String) extends Fruit
  case class Orange(name:String)extends Fruit
  
  val fruits=List(Apple("Fiji"),Orange("jaffa"),Apple("cox's"))
                                                  //> fruits  : List[Product with Serializable with com.mytut.demo.collectionDemo
                                                  //| .Fruit] = List(Apple(Fiji), Orange(jaffa), Apple(cox's))
  
  fruits.collect{
  	case a:Apple=>a
  }                                               //> res10: List[com.mytut.demo.collectionDemo.Apple] = List(Apple(Fiji), Apple(
                                                  //| cox's))
  //Permutation And Combination
  val pcex=List.range(0,10)                       //> pcex  : List[Int] = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
  
  pcex.grouped(3).take(5).toList                  //> res11: List[List[Int]] = List(List(0, 1, 2), List(3, 4, 5), List(6, 7, 8), 
                                                  //| List(9))
  pcex.sliding(3).take(5).toList                  //> res12: List[List[Int]] = List(List(0, 1, 2), List(1, 2, 3), List(2, 3, 4), 
                                                  //| List(3, 4, 5), List(4, 5, 6))
  pcex.sliding(3,2).take(5).toList                //> res13: List[List[Int]] = List(List(0, 1, 2), List(2, 3, 4), List(4, 5, 6), 
                                                  //| List(6, 7, 8), List(8, 9))
  
  pcex.combinations(3).take(5).toList             //> res14: List[List[Int]] = List(List(0, 1, 2), List(0, 1, 3), List(0, 1, 4), 
                                                  //| List(0, 1, 5), List(0, 1, 6))
  pcex.permutations.take(5).toList                //> res15: List[List[Int]] = List(List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9), List(0, 1
                                                  //| , 2, 3, 4, 5, 6, 7, 9, 8), List(0, 1, 2, 3, 4, 5, 6, 8, 7, 9), List(0, 1, 2
                                                  //| , 3, 4, 5, 6, 8, 9, 7), List(0, 1, 2, 3, 4, 5, 6, 9, 7, 8))
  
  val numsPlusOne=nums.map(_+1)                   //> numsPlusOne  : List[Int] = List(3, 4, 6, 9, 14, 22)

	//Indices, Zip,Unzip
	
	val chars=List.range('a','h')             //> chars  : List[Char] = List(a, b, c, d, e, f, g)
	
	val idx=chars.indices                     //> idx  : scala.collection.immutable.Range = Range 0 until 7
	chars.zip(idx)                            //> res16: List[(Char, Int)] = List((a,0), (b,1), (c,2), (d,3), (e,4), (f,5), (
                                                  //| g,6))
	val zipped=chars.zipWithIndex             //> zipped  : List[(Char, Int)] = List((a,0), (b,1), (c,2), (d,3), (e,4), (f,5)
                                                  //| , (g,6))
	zipped.unzip                              //> res17: (List[Char], List[Int]) = (List(a, b, c, d, e, f, g),List(0, 1, 2, 3
                                                  //| , 4, 5, 6))
	
	val xs3=List(1,2,3)                       //> xs3  : List[Int] = List(1, 2, 3)
	val ys3=List("four","five")               //> ys3  : List[String] = List(four, five)
	xs3.tail.tail.tail eq ys3.tail.tail       //> res18: Boolean = true
                  
}