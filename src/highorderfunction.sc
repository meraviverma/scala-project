object highorderfunction {
  println("Welcome to the Scala High Order function worksheet")
def convertToUpper(x:String)=x.toUpperCase


def stringOps(s:String,n:String=>String)={
      if(s!=null)n(s)
      else s
      }


stringOps("scala",convertToUpper)

stringOps("scala",(x:String)=>x.toUpperCase)


stringOps("scala",_.toUpperCase)


stringOps("scala",_.reverse)


//High Order function:
//----------------------
//-----------Example 1--------------
def simpleOps(x:Int,y:Int,f:(Int,Int)=>Int)={
      val m=x+2
      val n=y+2
      val p=f(m,n)
      p*2
      }


def sum(a:Int,b:Int)=a + b


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
def identify[T](s:T)=s


identify("ram")


identify(10)


identify(true)



def simpleOps[A,B](x:A,y:A,f:(A,A)=>B)=f(x,y)


simpleOps[Int,Int](2,4,_+_)


simpleOps[Int,Int](2,4,_*_)


simpleOps[Int,Int](2,4,_-_)


simpleOps[Int,Boolean](2,4,_>_)


//simpleOps[Int,Int](2,4,_>_)

simpleOps[Double,Double](2,4,_/_)


//-------- Eample 3---------
def tripleOp(a:Int,b:Int,c:Int,f:(Int,Int,Int)=>Int)=f(a,b,c)


tripleOp(2,3,4,_+_*_)


tripleOp(2,3,4,_*_*_)

}