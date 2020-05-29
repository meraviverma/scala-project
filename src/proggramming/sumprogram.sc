package proggramming

object sumprogram {
  println("sum of integer , sum of square of integer, sum of cube of integer")
                                                  //> sum of integer , sum of square of integer, sum of cube of integer
  
  def sumOfInteger(n:Int)={
  n*(n+1)/2
  }                                               //> sumOfInteger: (n: Int)Int
  
  def sumOfSqareOfInteger(n:Int)={
  	//(n*(n+1)*(n+1)*(n+2))/12
  	(n*(n+1)*(2*n+1))/6
  }                                               //> sumOfSqareOfInteger: (n: Int)Int
  
  sumOfInteger(4)                                 //> res0: Int = 10
  sumOfSqareOfInteger(2)                          //> res1: Int = 5
}