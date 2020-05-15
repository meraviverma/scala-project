object collectionDemo {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(67); 
  println("Welcome to the Scala worksheet");$skip(22); 

val onetwo=List(1,2);System.out.println("""onetwo  : List[Int] = """ + $show(onetwo ));$skip(24); 
val threefour=3::4::Nil;System.out.println("""threefour  : List[Int] = """ + $show(threefour ));$skip(39); 
val onetwothreefour=onetwo:::threefour;System.out.println("""onetwothreefour  : List[Int] = """ + $show(onetwothreefour ));$skip(40); val res$0 = 

onetwothreefour.tail.tail eq threefour;System.out.println("""res0: Boolean = """ + $show(res$0));$skip(22); 

val empty=List.empty;System.out.println("""empty  : List[Nothing] = """ + $show(empty ));$skip(14); val res$1 = 

empty eq Nil;System.out.println("""res1: Boolean = """ + $show(res$1));$skip(18); 

val one=1::empty;System.out.println("""one  : List[Int] = """ + $show(one ));$skip(11); val res$2 = 

true::one;System.out.println("""res2: List[AnyVal] = """ + $show(res$2));$skip(54); val res$3 = 
//Nothing is subtype of everything

	List.fill(10)(1);System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(27); val res$4 = 
	List.tabulate(10)(x=>x*x);System.out.println("""res4: List[Int] = """ + $show(res$4));$skip(18); val res$5 = 
	List.range(1,10);System.out.println("""res5: List[Int] = """ + $show(res$5));$skip(30); val res$6 = 
	
	Vector('a','b','c').toList;System.out.println("""res6: List[Char] = """ + $show(res$6));$skip(27); val res$7 = 
	
	Set(1.0,2.0,3.0).toList;System.out.println("""res7: List[Double] = """ + $show(res$7));$skip(33); val res$8 = 
	
	Map(1->"one",2->"two").toList;System.out.println("""res8: List[(Int, String)] = """ + $show(res$8));$skip(24); val res$9 = 
	
	"hello world".toList;System.out.println("""res9: List[Char] = """ + $show(res$9));$skip(85); 
	
	//Operationn at the head of a list are constant time
	
	val nums=(1 to 10).toList;System.out.println("""nums  : List[Int] = """ + $show(nums ));$skip(11); val res$10 = 
	nums.head;System.out.println("""res10: Int = """ + $show(res$10));$skip(11); val res$11 = 
	nums.tail;System.out.println("""res11: List[Int] = """ + $show(res$11));$skip(14); val res$12 = 
	nums.isEmpty;System.out.println("""res12: Boolean = """ + $show(res$12));$skip(28); val res$13 = 
	//nums.nonEmpty
	
	0::nums;System.out.println("""res13: List[Int] = """ + $show(res$13));$skip(6); val res$14 = 
	nums;System.out.println("""res14: List[Int] = """ + $show(res$14));$skip(12); val res$15 = 
	nums.::(0);System.out.println("""res15: List[Int] = """ + $show(res$15));$skip(31); 
	
	val nums1 = (1 to 5).toList;System.out.println("""nums1  : List[Int] = """ + $show(nums1 ));$skip(14); val res$16 = 
	
	nums1.last;System.out.println("""res16: Int = """ + $show(res$16));$skip(14); val res$17 = 
	
	nums1.init;System.out.println("""res17: List[Int] = """ + $show(res$17));$skip(16); val res$18 = 
	
	nums1.length;System.out.println("""res18: Int = """ + $show(res$18));$skip(17); val res$19 = 
	
	nums1.reverse;System.out.println("""res19: List[Int] = """ + $show(res$19));$skip(12); val res$20 = 
	
	nums1(3);System.out.println("""res20: Int = """ + $show(res$20));$skip(17); val res$21 = 
	
	nums1.drop(3);System.out.println("""res21: List[Int] = """ + $show(res$21));$skip(15); val res$22 = 
	nums1.take(3);System.out.println("""res22: List[Int] = """ + $show(res$22));$skip(30); 
	
	val nums2=(6 to 10).toList;System.out.println("""nums2  : List[Int] = """ + $show(nums2 ));$skip(31); 
	
	val allNums=nums1 ::: nums2;System.out.println("""allNums  : List[Int] = """ + $show(allNums ));$skip(20); val res$23 = 
	
	allNums.drop(50);System.out.println("""res23: List[Int] = """ + $show(res$23));$skip(38); 
	
	val updated=allNums.updated(4,100);System.out.println("""updated  : List[Int] = """ + $show(updated ));$skip(88); 
	//Takes position and add at the position
	
	val words=List("one","two","three","four");System.out.println("""words  : List[String] = """ + $show(words ));$skip(24); val res$24 = 
	
	words.map(_.reverse);System.out.println("""res24: List[String] = """ + $show(res$24));$skip(32); val res$25 = 
	
	words.reverse.map(_.reverse);System.out.println("""res25: List[String] = """ + $show(res$25));$skip(34); val res$26 = 
	
	words.map(words=>words.toList);System.out.println("""res26: List[List[Char]] = """ + $show(res$26));$skip(38); val res$27 = 
	
	words.flatMap(words=>words.toList);System.out.println("""res27: List[Char] = """ + $show(res$27));$skip(25); 
	
	words foreach println;$skip(96); val res$28 = 
  //Predicate Based Function
  
  //A predicate is just a function returning Boolean
  
  words;System.out.println("""res28: List[String] = """ + $show(res$28));$skip(32); val res$29 = 
  words.filter(_.contains("o"));System.out.println("""res29: List[String] = """ + $show(res$29));$skip(32); val res$30 = 
  words.filter(_.contains("z"));System.out.println("""res30: List[String] = """ + $show(res$30));$skip(33); val res$31 = 
  
  words.find(_.contains("e"));System.out.println("""res31: Option[String] = """ + $show(res$31));$skip(30); val res$32 = 
  words.find(_.contains("z"));System.out.println("""res32: Option[String] = """ + $show(res$32));$skip(39); val res$33 = 
  
  words.indexWhere(_.contains("a"));System.out.println("""res33: Int = """ + $show(res$33));$skip(36); val res$34 = 
  words.indexWhere(_.contains("f"));System.out.println("""res34: Int = """ + $show(res$34));$skip(37); val res$35 = 
  
 words.filterNot(_.contains("o"));System.out.println("""res35: List[String] = """ + $show(res$35));$skip(34); val res$36 = 
 words.partition(_.contains("e"));System.out.println("""res36: (List[String], List[String]) = """ + $show(res$36));$skip(36); val res$37 = 
 
 words.takeWhile(_.contains("f"));System.out.println("""res37: List[String] = """ + $show(res$37));$skip(59); 
 
 //Fold
 val wordsfold=List("four","four","char","word");System.out.println("""wordsfold  : List[String] = """ + $show(wordsfold ));$skip(34); 
 val numsfold=List(2,3,5,8,13,21);System.out.println("""numsfold  : List[Int] = """ + $show(numsfold ));$skip(48); 
 
 val sumNums=numsfold.foldLeft(0)((a,b)=>a+b);System.out.println("""sumNums  : Int = """ + $show(sumNums ));$skip(40); 
 val prodnums=numsfold.foldLeft(1)(_*_);System.out.println("""prodnums  : Int = """ + $show(prodnums ));$skip(49); 
 
 val asstring=wordsfold.foldLeft("")(_+ ","+_);System.out.println("""asstring  : String = """ + $show(asstring ));$skip(37); 
 
 val sum2=numsfold.reduceLeft(_+_);System.out.println("""sum2  : Int = """ + $show(sum2 ));$skip(36); val res$38 = 
 
 List.empty[Int].foldLeft(0)(_+_);System.out.println("""res38: Int = """ + $show(res$38))}
 
 
 //Can also use foldRight or just fold
 
 
 
 
 
 
 
 
 
}
