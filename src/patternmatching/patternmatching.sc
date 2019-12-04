package patternmatching
import scala.util._
object patternmatching {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val status=404                                  //> status  : Int = 404
  val msg=status match{
  case 200=>"success"
  case 500=>"Critiacl Error"
  case s if(s == 404)=>"Not found error" //It's a pattern guard
  }                                               //> msg  : String = Not found error
  
  val day="MON"                                   //> day  : String = MON
  val kind=day match{
  case "MON"|"TUE"|"WED"|"THU"|"FRI"=>"Weekday"
  case "SAT"|"SUN"=>"Weekend"
  }                                               //> kind  : String = Weekday
  
  def matchIt(x:Any):Unit=x match{
  case 10				=> 	println("the number 10")
  case true			=>	println("truth")
  case 2.0			=>	println("precision 2.0")
  case "hello"	=>	println("Well, hi there")
  case ()				=>	println("Unit")
  case _ 				=>	println("It's something else")
  }                                               //> matchIt: (x: Any)Unit
  
  matchIt(10)                                     //> the number 10
  matchIt(2.0)                                    //> precision 2.0
  matchIt("hello")                                //> Well, hi there
  matchIt(())                                     //> Unit
  matchIt(true)                                   //> truth
  matchIt(4)                                      //> It's something else
  
  def pair(s:String):String=s match{
  case "fish"		=>	"chips"
  case "bacon"	=>	"eggs"
  case	"tea"		=>	"scones"
  }                                               //> pair: (s: String)String
  
  println(pair("fish"))                           //> chips
  println(pair("tea"))                            //> scones
  //println(pair("Universe"))
  def opposite(s:String):String=s match{
  case "hot"		=>	"cold"
  case "full"	=>	"empty"
  case	"happy"		=>	"sad"
  case anythingElse => s"not $anythingElse"
  }                                               //> opposite: (s: String)String

println(opposite("cool"))                         //> not cool
println(opposite("happy"))                        //> sad
println(opposite("sane"))                         //> not sane

	def opposite2(s:String):String=s match{
  
  case "hot"				=>	"cold"
  case "full"				=>	"empty"
  case	"happy"			=>	"sad"
  case inWord@("sane"|"edible"|"secure")	=>s"in $inWord"
  case anythingElse => s"not $anythingElse"
  }                                               //> opposite2: (s: String)String
  println(opposite2("cool"))                      //> not cool
	println(opposite2("happy"))               //> sad
	println(opposite2("sane"))                //> in sane
  println(opposite2("fish"))                      //> not fish
  println(opposite2("edible"))                    //> in edible
  
  
  def describeNumber(x:Int):String= x match{
  case 0		=>	"zero"
  case n if n > 0 && n < 100	=>	"smaller positive"
  case n if n > 0				=>"large positive"
  case n if n < 0 && n > -100 =>"large negative"
  case _	=>"large negative"
  }                                               //> describeNumber: (x: Int)String
  
  println(describeNumber(-99))                    //> large negative
  println(describeNumber(99))                     //> smaller positive
  println(describeNumber(0))                      //> zero
  println(describeNumber(101))                    //> large positive
  
 
  def matchOption(o:Option[Int])=o match{
	case Some(n)if n > 10=> "It's a number above 10"
	case Some(_)	=>"It's a number 10 or less"
	case None	=>"No number given"
	}                                         //> matchOption: (o: Option[Int])String
	println(matchOption(Some(50)))            //> It's a number above 10
	println(matchOption(Some(5)))             //> It's a number 10 or less
	println(matchOption(None))                //> No number given


	def matchTuple3(tup:(Int,Boolean,String)):String=tup match{
	
		case (1,flag,string)=>s" a 1 followed by $flag and $string"
		case (i,true,"Fred")=>s"a true Fred with int $i"
		case(a,b,c)=>s"Some other tuple int $a,flag $b,string $c"
	}                                         //> matchTuple3: (tup: (Int, Boolean, String))String
	
	println(matchTuple3(1,false,"Sally"))     //>  a 1 followed by false and Sally
	println(matchTuple3(1,true,"Harry"))      //>  a 1 followed by true and Harry
	println(matchTuple3(2,true,"Fred"))       //> a true Fred with int 2
	println(matchTuple3(2,false,"Fred"))      //> Some other tuple int 2,flag false,string Fred
	
	def matchList(xs:List[Int]):String=xs match{
	
		case 1 :: 2 :: rest=>s" A 1,2 list followed by $rest"
		case a :: b :: _ => s"A lsit of at least 2 items, starting with $a, $b"
		case a :: Nil => s"A single element list of $a"
		case Nil => "The empty list"
	}                                         //> matchList: (xs: List[Int])String
	
	matchList(List(1,2,3))                    //> res0: String = " A 1,2 list followed by List(3)"
	matchList(List(1,2))                      //> res1: String = " A 1,2 list followed by List()"
	matchList(List(1,3,4))                    //> res2: String = A lsit of at least 2 items, starting with 1, 3
	matchList(List(4))                        //> res3: String = A single element list of 4
	matchList(Nil)                            //> res4: String = The empty list
	
	def matchSeq(xs:Vector[Int]):String=xs match{
	
		case 1 +: 2 +: rest=>s" A 1,2 vector followed by $rest"
		case Vector(a,b,_*) => s"A vector of at least 2 items, starting with $a, $b"
		case Vector(a) => s"A single element vector of $a"
		case Vector() => "The empty vector"
	}                                         //> matchSeq: (xs: Vector[Int])String
	
	matchSeq(Vector(1,2,3))                   //> res5: String = " A 1,2 vector followed by Vector(3)"
	matchSeq(Vector(1,2))                     //> res6: String = " A 1,2 vector followed by Vector()"
	matchSeq(Vector(4))                       //> res7: String = A single element vector of 4
	matchSeq(Vector())                        //> res8: String = The empty vector
	
	//Match TRY
	def matchTry(t:Try[_]):String=t match{
	case Success(x)=>s"It worked, result is $x"
	case Failure(e)=>s"It failed with $e"
	}                                         //> matchTry: (t: scala.util.Try[_])String
	
	matchTry(Try(4/2))                        //> res9: String = It worked, result is 2
	matchTry(Try(4/0))                        //> res10: String = It failed with java.lang.ArithmeticException: / by zero
	
	case class Address(street:String,city:String,postCode:Option[String])
	case class Person(name:String,phone:Option[String],address:Option[Address])
	
	val harry=Person("Harry",None,Some(Address("123 Little Whinging way","Purley",Some("PN22 6RT"))))
                                                  //> harry  : patternmatching.patternmatching.Person = Person(Harry,None,Some(Ad
                                                  //| dress(123 Little Whinging way,Purley,Some(PN22 6RT))))
	val sally=Person("Sally",Some("321-222-3344"),None)
                                                  //> sally  : patternmatching.patternmatching.Person = Person(Sally,Some(321-222
                                                  //| -3344),None)
  sally == harry                                  //> res11: Boolean = false
  sally == sally                                  //> res12: Boolean = true
  sally == Person("Sally",Some("321-222-3344"),None)
                                                  //> res13: Boolean = true
  sally == Person("Sally",Some("321-234-3344"),None)
                                                  //> res14: Boolean = false
  
  sally.hashCode                                  //> res15: Int = -171467737
  Person("Sally",Some("321-222-3344"),None).hashCode
                                                  //> res16: Int = -171467737
  harry.hashCode                                  //> res17: Int = 1544670842
  
  val sally2=sally.copy(address=harry.address,phone=Some("321-333-2211"))
                                                  //> sally2  : patternmatching.patternmatching.Person = Person(Sally,Some(321-33
                                                  //| 3-2211),Some(Address(123 Little Whinging way,Purley,Some(PN22 6RT))))
  val harry2=harry.copy(phone=sally2.phone)       //> harry2  : patternmatching.patternmatching.Person = Person(Harry,Some(321-33
                                                  //| 3-2211),Some(Address(123 Little Whinging way,Purley,Some(PN22 6RT))))
   
  def postCodeForHarry(person:Person)=person match{
  case Person("Harry",_,Some(Address(street,city,Some(postcode))))=>
  	println("Harry found with postcode")
  	println(s"City $city")
  	println(s"Street $street")
  	postcode
  	case _ => ""
  }                                               //> postCodeForHarry: (person: patternmatching.patternmatching.Person)String
  postCodeForHarry(harry)                         //> Harry found with postcode
                                                  //| City Purley
                                                  //| Street 123 Little Whinging way
                                                  //| res18: String = PN22 6RT
  postCodeForHarry(harry2)                        //> Harry found with postcode
                                                  //| City Purley
                                                  //| Street 123 Little Whinging way
                                                  //| res19: String = PN22 6RT
  postCodeForHarry(sally)                         //> res20: String = ""
  postCodeForHarry(sally2)                        //> res21: String = ""
  
  println("------ Typed Pattern Matches -----------")
                                                  //> ------ Typed Pattern Matches -----------
  
  def describeType(x:Any)=x match{
  case i:Int if i>0 => s"Int ${i*i}"
  case d:Double => s"Double $d"
  case s:String=> s"String ${s.reverse}"
  case p:Person=>s"Person,name=${p.name}"
  case _=>"some other data type"
  }                                               //> describeType: (x: Any)String
  
  describeType(3)                                 //> res22: String = Int 9
  describeType(-3)                                //> res23: String = some other data type
  describeType(3.4)                               //> res24: String = Double 3.4
  describeType("Hello")                           //> res25: String = String olleH
  describeType(harry)                             //> res26: String = Person,name=Harry
  describeType(true)                              //> res27: String = some other data type
  
  println("------ Beware Type Erasure -----------")
                                                  //> ------ Beware Type Erasure -----------
  def withIntStringMap(x:Any):Int=x match{
  case m:Map[Int,String]=>m.head._1 * m.head._1
  case _=>0
  }                                               //> withIntStringMap: (x: Any)Int
  
  withIntStringMap(Map(2->"two"))                 //> res28: Int = 4
  withIntStringMap(List(2))                       //> res29: Int = 0
  //withIntStringMap(Map("One"->1))
                                                  

val people=List(harry,harry2,sally,sally2)        //> people  : List[patternmatching.patternmatching.Person] = List(Person(Harry,
                                                  //| None,Some(Address(123 Little Whinging way,Purley,Some(PN22 6RT)))), Person(
                                                  //| Harry,Some(321-333-2211),Some(Address(123 Little Whinging way,Purley,Some(P
                                                  //| N22 6RT)))), Person(Sally,Some(321-222-3344),None), Person(Sally,Some(321-3
                                                  //| 33-2211),Some(Address(123 Little Whinging way,Purley,Some(PN22 6RT)))))
for{
Person(name,phone,_)<-people
if phone.isDefined
}yield name->phone.get                            //> res30: List[(String, String)] = List((Harry,321-333-2211), (Sally,321-222-3
                                                  //| 344), (Sally,321-333-2211))

val numberMap=Map(1->"one",2->"two",3->"three")   //> numberMap  : scala.collection.immutable.Map[Int,String] = Map(1 -> one, 2 -
                                                  //| > two, 3 -> three)
for((k,v)<-numberMap){
println(s"$k is $v")}                             //> 1 is one
                                                  //| 2 is two
                                                  //| 3 is three
}