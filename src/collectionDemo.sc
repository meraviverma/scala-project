object collectionDemo {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

val onetwo=List(1,2)                              //> onetwo  : List[Int] = List(1, 2)
val threefour=3::4::Nil                           //> threefour  : List[Int] = List(3, 4)
val onetwothreefour=onetwo:::threefour            //> onetwothreefour  : List[Int] = List(1, 2, 3, 4)

onetwothreefour.tail.tail eq threefour            //> res0: Boolean = true

val empty=List.empty                              //> empty  : List[Nothing] = List()

empty eq Nil                                      //> res1: Boolean = true

val one=1::empty                                  //> one  : List[Int] = List(1)

true::one                                         //> res2: List[AnyVal] = List(true, 1)
//Nothing is subtype of everything

	List.fill(10)(1)                          //> res3: List[Int] = List(1, 1, 1, 1, 1, 1, 1, 1, 1, 1)
	List.tabulate(10)(x=>x*x)                 //> res4: List[Int] = List(0, 1, 4, 9, 16, 25, 36, 49, 64, 81)
	List.range(1,10)                          //> res5: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
	
	Vector('a','b','c').toList                //> res6: List[Char] = List(a, b, c)
	
	Set(1.0,2.0,3.0).toList                   //> res7: List[Double] = List(1.0, 2.0, 3.0)
	
	Map(1->"one",2->"two").toList             //> res8: List[(Int, String)] = List((1,one), (2,two))
	
	"hello world".toList                      //> res9: List[Char] = List(h, e, l, l, o,  , w, o, r, l, d)
	
	//Operationn at the head of a list are constant time
	
	val nums=(1 to 10).toList                 //> nums  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
	nums.head                                 //> res10: Int = 1
	nums.tail                                 //> res11: List[Int] = List(2, 3, 4, 5, 6, 7, 8, 9, 10)
	nums.isEmpty                              //> res12: Boolean = false
	//nums.nonEmpty
	
	0::nums                                   //> res13: List[Int] = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
	nums                                      //> res14: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
	nums.::(0)                                //> res15: List[Int] = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
	
	val nums1 = (1 to 5).toList               //> nums1  : List[Int] = List(1, 2, 3, 4, 5)
	
	nums1.last                                //> res16: Int = 5
	
	nums1.init                                //> res17: List[Int] = List(1, 2, 3, 4)
	
	nums1.length                              //> res18: Int = 5
	
	nums1.reverse                             //> res19: List[Int] = List(5, 4, 3, 2, 1)
	
	nums1(3)                                  //> res20: Int = 4
	
	nums1.drop(3)                             //> res21: List[Int] = List(4, 5)
	nums1.take(3)                             //> res22: List[Int] = List(1, 2, 3)
	
	val nums2=(6 to 10).toList                //> nums2  : List[Int] = List(6, 7, 8, 9, 10)
	
	val allNums=nums1 ::: nums2               //> allNums  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
	
	allNums.drop(50)                          //> res23: List[Int] = List()
	
	val updated=allNums.updated(4,100)        //> updated  : List[Int] = List(1, 2, 3, 4, 100, 6, 7, 8, 9, 10)
	//Takes position and add at the position
	
	val words=List("one","two","three","four")//> words  : List[String] = List(one, two, three, four)
	
	words.map(_.reverse)                      //> res24: List[String] = List(eno, owt, eerht, ruof)
	
	words.reverse.map(_.reverse)              //> res25: List[String] = List(ruof, eerht, owt, eno)
	
	words.map(words=>words.toList)            //> res26: List[List[Char]] = List(List(o, n, e), List(t, w, o), List(t, h, r, 
                                                  //| e, e), List(f, o, u, r))
	
	words.flatMap(words=>words.toList)        //> res27: List[Char] = List(o, n, e, t, w, o, t, h, r, e, e, f, o, u, r)
	
	words foreach println                     //> one
                                                  //| two
                                                  //| three
                                                  //| four
  //Predicate Based Function
  
  //A predicate is just a function returning Boolean
  
  words                                           //> res28: List[String] = List(one, two, three, four)
  words.filter(_.contains("o"))                   //> res29: List[String] = List(one, two, four)
  words.filter(_.contains("z"))                   //> res30: List[String] = List()
  
  words.find(_.contains("e"))                     //> res31: Option[String] = Some(one)
  words.find(_.contains("z"))                     //> res32: Option[String] = None
  
  words.indexWhere(_.contains("a"))               //> res33: Int = -1
  words.indexWhere(_.contains("f"))               //> res34: Int = 3
  
 words.filterNot(_.contains("o"))                 //> res35: List[String] = List(three)
 words.partition(_.contains("e"))                 //> res36: (List[String], List[String]) = (List(one, three),List(two, four))
 
 words.takeWhile(_.contains("f"))                 //> res37: List[String] = List()
 
 //Fold
 val wordsfold=List("four","four","char","word")  //> wordsfold  : List[String] = List(four, four, char, word)
 val numsfold=List(2,3,5,8,13,21)                 //> numsfold  : List[Int] = List(2, 3, 5, 8, 13, 21)
 
 val sumNums=numsfold.foldLeft(0)((a,b)=>a+b)     //> sumNums  : Int = 52
 val prodnums=numsfold.foldLeft(1)(_*_)           //> prodnums  : Int = 65520
 
 val asstring=wordsfold.foldLeft("")(_+ ","+_)    //> asstring  : String = ,four,four,char,word
 
 val sum2=numsfold.reduceLeft(_+_)                //> sum2  : Int = 52
 
 List.empty[Int].foldLeft(0)(_+_)                 //> res38: Int = 0
 
 
 //Can also use foldRight or just fold
 
 
 
 
 
 
 
 
 
}