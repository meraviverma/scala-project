package patternmatching
import scala.util._
object patternmatching {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(112); 
  println("Welcome to the Scala worksheet");$skip(279); 
  def matchIt(x:Any):Unit=x match{
  case 10				=> 	println("the number 10")
  case true			=>	println("truth")
  case 2.0			=>	println("precision 2.0")
  case "hello"	=>	println("Well, hi there")
  case ()				=>	println("Unit")
  case _ 				=>	println("It's something else")
  };System.out.println("""matchIt: (x: Any)Unit""");$skip(17); 
  
  matchIt(10);$skip(15); 
  matchIt(2.0);$skip(19); 
  matchIt("hello");$skip(14); 
  matchIt(());$skip(16); 
  matchIt(true);$skip(13); 
  matchIt(4);$skip(121); 
  
  def pair(s:String):String=s match{
  case "fish"		=>	"chips"
  case "bacon"	=>	"eggs"
  case	"tea"		=>	"scones"
  };System.out.println("""pair: (s: String)String""");$skip(27); 
  
  println(pair("fish"));$skip(23); 
  println(pair("tea"));$skip(193); 
  //println(pair("Universe"))
  def opposite(s:String):String=s match{
  case "hot"		=>	"cold"
  case "full"	=>	"empty"
  case	"happy"		=>	"sad"
  case anythingElse => s"not $anythingElse"
  };System.out.println("""opposite: (s: String)String""");$skip(27); 

println(opposite("cool"));$skip(27); 
println(opposite("happy"));$skip(26); 
println(opposite("sane"));$skip(230); 

	def opposite2(s:String):String=s match{
  
  case "hot"				=>	"cold"
  case "full"				=>	"empty"
  case	"happy"			=>	"sad"
  case inWord@("sane"|"edible"|"secure")	=>s"in $inWord"
  case anythingElse => s"not $anythingElse"
  };System.out.println("""opposite2: (s: String)String""");$skip(29); 
  println(opposite2("cool"));$skip(29); 
	println(opposite2("happy"));$skip(28); 
	println(opposite2("sane"));$skip(29); 
  println(opposite2("fish"));$skip(31); 
  println(opposite2("edible"));$skip(243); 
  
  
  def describeNumber(x:Int):String= x match{
  case 0		=>	"zero"
  case n if n > 0 && n < 100	=>	"smaller positive"
  case n if n > 0				=>"large positive"
  case n if n < 0 && n > -100 =>"large negative"
  case _	=>"large negative"
  };System.out.println("""describeNumber: (x: Int)String""");$skip(34); 
  
  println(describeNumber(-99));$skip(30); 
  println(describeNumber(99));$skip(29); 
  println(describeNumber(0));$skip(31); 
  println(describeNumber(101));$skip(174); 
  
 
  def matchOption(o:Option[Int])=o match{
	case Some(n)if n > 10=> "It's a number above 10"
	case Some(_)	=>"It's a number 10 or less"
	case None	=>"No number given"
	};System.out.println("""matchOption: (o: Option[Int])String""");$skip(32); 
	println(matchOption(Some(50)));$skip(31); 
	println(matchOption(Some(5)));$skip(28); 
	println(matchOption(None));$skip(241); 


	def matchTuple3(tup:(Int,Boolean,String)):String=tup match{
	
		case (1,flag,string)=>s" a 1 followed by $flag and $string"
		case (i,true,"Fred")=>s"a true Fred with int $i"
		case(a,b,c)=>s"Some other tuple int $a,flag $b,string $c"
	};System.out.println("""matchTuple3: (tup: (Int, Boolean, String))String""");$skip(41); 
	
	println(matchTuple3(1,false,"Sally"));$skip(38); 
	println(matchTuple3(1,true,"Harry"));$skip(37); 
	println(matchTuple3(2,true,"Fred"));$skip(38); 
	println(matchTuple3(2,false,"Fred"));$skip(264); 
	
	def matchList(xs:List[Int]):String=xs match{
	
		case 1 :: 2 :: rest=>s" A 1,2 list followed by $rest"
		case a :: b :: _ => s"A lsit of at least 2 items, starting with $a, $b"
		case a :: Nil => s"A single element list of $a"
		case Nil => "The empty list"
	};System.out.println("""matchList: (xs: List[Int])String""");$skip(26); val res$0 = 
	
	matchList(List(1,2,3));System.out.println("""res0: String = """ + $show(res$0));$skip(22); val res$1 = 
	matchList(List(1,2));System.out.println("""res1: String = """ + $show(res$1));$skip(24); val res$2 = 
	matchList(List(1,3,4));System.out.println("""res2: String = """ + $show(res$2));$skip(20); val res$3 = 
	matchList(List(4));System.out.println("""res3: String = """ + $show(res$3));$skip(16); val res$4 = 
	matchList(Nil);System.out.println("""res4: String = """ + $show(res$4));$skip(282); 
	
	def matchSeq(xs:Vector[Int]):String=xs match{
	
		case 1 +: 2 +: rest=>s" A 1,2 vector followed by $rest"
		case Vector(a,b,_*) => s"A vector of at least 2 items, starting with $a, $b"
		case Vector(a) => s"A single element vector of $a"
		case Vector() => "The empty vector"
	};System.out.println("""matchSeq: (xs: Vector[Int])String""");$skip(27); val res$5 = 
	
	matchSeq(Vector(1,2,3));System.out.println("""res5: String = """ + $show(res$5));$skip(23); val res$6 = 
	matchSeq(Vector(1,2));System.out.println("""res6: String = """ + $show(res$6));$skip(21); val res$7 = 
	matchSeq(Vector(4));System.out.println("""res7: String = """ + $show(res$7));$skip(20); val res$8 = 
	matchSeq(Vector());System.out.println("""res8: String = """ + $show(res$8));$skip(142); 
	
	//Match TRY
	def matchTry(t:Try[_]):String=t match{
	case Success(x)=>s"It worked, result is $x"
	case Failure(e)=>s"It failed with $e"
	};System.out.println("""matchTry: (t: scala.util.Try[_])String""");$skip(22); val res$9 = 
	
	matchTry(Try(4/2));System.out.println("""res9: String = """ + $show(res$9));$skip(20); val res$10 = 
	matchTry(Try(4/0))
	
	case class Address(street:String,city:String,postCode:Option[String])
	case class Person(name:String,phone:Option[String],address:Option[Address]);System.out.println("""res10: String = """ + $show(res$10));$skip(251); 
	
	val harry=Person("Harry",None,Some(Address("123 Little Whinging way","Purley",Some("PN22 6RT"))));System.out.println("""harry  : patternmatching.patternmatching.Person = """ + $show(harry ));$skip(53); 
	val sally=Person("Sally",Some("321-222-3344"),None);System.out.println("""sally  : patternmatching.patternmatching.Person = """ + $show(sally ));$skip(17); val res$11 = 
  sally == harry;System.out.println("""res11: Boolean = """ + $show(res$11));$skip(17); val res$12 = 
  sally == sally;System.out.println("""res12: Boolean = """ + $show(res$12));$skip(53); val res$13 = 
  sally == Person("Sally",Some("321-222-3344"),None);System.out.println("""res13: Boolean = """ + $show(res$13));$skip(53); val res$14 = 
  sally == Person("Sally",Some("321-234-3344"),None);System.out.println("""res14: Boolean = """ + $show(res$14));$skip(20); val res$15 = 
  
  sally.hashCode;System.out.println("""res15: Int = """ + $show(res$15));$skip(53); val res$16 = 
  Person("Sally",Some("321-222-3344"),None).hashCode;System.out.println("""res16: Int = """ + $show(res$16));$skip(17); val res$17 = 
  harry.hashCode;System.out.println("""res17: Int = """ + $show(res$17));$skip(77); 
  
  val sally2=sally.copy(address=harry.address,phone=Some("321-333-2211"));System.out.println("""sally2  : patternmatching.patternmatching.Person = """ + $show(sally2 ));$skip(44); 
  val harry2=harry.copy(phone=sally2.phone);System.out.println("""harry2  : patternmatching.patternmatching.Person = """ + $show(harry2 ));$skip(253); 
   
  def postCodeForHarry(person:Person)=person match{
  case Person("Harry",_,Some(Address(street,city,Some(postcode))))=>
  	println("Harry found with postcode")
  	println(s"City $city")
  	println(s"Street $street")
  	postcode
  	case _ => ""
  };System.out.println("""postCodeForHarry: (person: patternmatching.patternmatching.Person)String""");$skip(26); val res$18 = 
  postCodeForHarry(harry);System.out.println("""res18: String = """ + $show(res$18));$skip(27); val res$19 = 
  postCodeForHarry(harry2);System.out.println("""res19: String = """ + $show(res$19));$skip(26); val res$20 = 
  postCodeForHarry(sally);System.out.println("""res20: String = """ + $show(res$20));$skip(27); val res$21 = 
  postCodeForHarry(sally2);System.out.println("""res21: String = """ + $show(res$21));$skip(57); 
  
  println("------ Typed Pattern Matches -----------");$skip(227); 
  
  def describeType(x:Any)=x match{
  case i:Int if i>0 => s"Int ${i*i}"
  case d:Double => s"Double $d"
  case s:String=> s"String ${s.reverse}"
  case p:Person=>s"Person,name=${p.name}"
  case _=>"some other data type"
  };System.out.println("""describeType: (x: Any)String""");$skip(21); val res$22 = 
  
  describeType(3);System.out.println("""res22: String = """ + $show(res$22));$skip(19); val res$23 = 
  describeType(-3);System.out.println("""res23: String = """ + $show(res$23));$skip(20); val res$24 = 
  describeType(3.4);System.out.println("""res24: String = """ + $show(res$24));$skip(24); val res$25 = 
  describeType("Hello");System.out.println("""res25: String = """ + $show(res$25));$skip(22); val res$26 = 
  describeType(harry);System.out.println("""res26: String = """ + $show(res$26));$skip(21); val res$27 = 
  describeType(true);System.out.println("""res27: String = """ + $show(res$27));$skip(55); 
  
  println("------ Beware Type Erasure -----------");$skip(107); 
  def withIntStringMap(x:Any):Int=x match{
  case m:Map[Int,String]=>m.head._1 * m.head._1
  case _=>0
  };System.out.println("""withIntStringMap: (x: Any)Int""");$skip(37); val res$28 = 
  
  withIntStringMap(Map(2->"two"));System.out.println("""res28: Int = """ + $show(res$28));$skip(28); val res$29 = 
  withIntStringMap(List(2));System.out.println("""res29: Int = """ + $show(res$29));$skip(131); 
  //withIntStringMap(Map("One"->1))
                                                  

val people=List(harry,harry2,sally,sally2);System.out.println("""people  : List[patternmatching.patternmatching.Person] = """ + $show(people ));$skip(76); val res$30 = 
for{
Person(name,phone,_)<-people
if phone.isDefined
}yield name->phone.get;System.out.println("""res30: List[(String, String)] = """ + $show(res$30));$skip(49); 

val numberMap=Map(1->"one",2->"two",3->"three");System.out.println("""numberMap  : scala.collection.immutable.Map[Int,String] = """ + $show(numberMap ));$skip(45); 
for((k,v)<-numberMap){
println(s"$k is $v")}}
}
