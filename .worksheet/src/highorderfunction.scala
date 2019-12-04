object highorderfunction {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(90); 
  println("Welcome to the Scala High Order function worksheet");$skip(43); 
def convertToUpper(x:String)=x.toUpperCase;System.out.println("""convertToUpper: (x: String)String""");$skip(88); 


def stringOps(s:String,n:String=>String)={
      if(s!=null)n(s)
      else s
      };System.out.println("""stringOps: (s: String, n: String => String)String""");$skip(36); val res$0 = 


stringOps("scala",convertToUpper);System.out.println("""res0: String = """ + $show(res$0));$skip(46); val res$1 = 

stringOps("scala",(x:String)=>x.toUpperCase);System.out.println("""res1: String = """ + $show(res$1));$skip(35); val res$2 = 


stringOps("scala",_.toUpperCase);System.out.println("""res2: String = """ + $show(res$2));$skip(31); val res$3 = 


stringOps("scala",_.reverse);System.out.println("""res3: String = """ + $show(res$3));$skip(202); 


//High Order function:
//----------------------
//-----------Example 1--------------
def simpleOps(x:Int,y:Int,f:(Int,Int)=>Int)={
      val m=x+2
      val n=y+2
      val p=f(m,n)
      p*2
      };System.out.println("""simpleOps: (x: Int, y: Int, f: (Int, Int) => Int)Int""");$skip(29); 


def sum(a:Int,b:Int)=a + b;System.out.println("""sum: (a: Int, b: Int)Int""");$skip(332); 


//simpleOps(4,5,sum)

//simpleOps(4,5,(a:Int,b:Int)=>a+b)

//simpleOps(4,5,_+_)

//simpleOps(4,5,_*_)


//simpleOps(4,5,_-_)


//simpleOps(4,5,_/_)


//simpleOps(4,5,_>_)

//This fails but how can we make that it doesn't fail.
//We can take the use of type parameter to do so.

//------ Generic function---
def identify[T](s:T)=s;System.out.println("""identify: [T](s: T)T""");$skip(18); val res$4 = 


identify("ram");System.out.println("""res4: String = """ + $show(res$4));$skip(15); val res$5 = 


identify(10);System.out.println("""res5: Int = """ + $show(res$5));$skip(17); val res$6 = 


identify(true);System.out.println("""res6: Boolean = """ + $show(res$6));$skip(49); 



def simpleOps[A,B](x:A,y:A,f:(A,A)=>B)=f(x,y);System.out.println("""simpleOps: [A, B](x: A, y: A, f: (A, A) => B)B""");$skip(30); val res$7 = 


simpleOps[Int,Int](2,4,_+_);System.out.println("""res7: Int = """ + $show(res$7));$skip(30); val res$8 = 


simpleOps[Int,Int](2,4,_*_);System.out.println("""res8: Int = """ + $show(res$8));$skip(30); val res$9 = 


simpleOps[Int,Int](2,4,_-_);System.out.println("""res9: Int = """ + $show(res$9));$skip(34); val res$10 = 


simpleOps[Int,Boolean](2,4,_>_);System.out.println("""res10: Boolean = """ + $show(res$10));$skip(67); val res$11 = 


//simpleOps[Int,Int](2,4,_>_)

simpleOps[Double,Double](2,4,_/_);System.out.println("""res11: Double = """ + $show(res$11));$skip(93); 


//-------- Eample 3---------
def tripleOp(a:Int,b:Int,c:Int,f:(Int,Int,Int)=>Int)=f(a,b,c);System.out.println("""tripleOp: (a: Int, b: Int, c: Int, f: (Int, Int, Int) => Int)Int""");$skip(24); val res$12 = 


tripleOp(2,3,4,_+_*_);System.out.println("""res12: Int = """ + $show(res$12));$skip(24); val res$13 = 


tripleOp(2,3,4,_*_*_);System.out.println("""res13: Int = """ + $show(res$13))}

}
