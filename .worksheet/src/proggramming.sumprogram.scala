package proggramming

object sumprogram {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(120); 
  println("sum of integer , sum of square of integer, sum of cube of integer");$skip(47); 
  
  def sumOfInteger(n:Int)={
  n*(n+1)/2
  };System.out.println("""sumOfInteger: (n: Int)Int""");$skip(95); 
  
  def sumOfSqareOfInteger(n:Int)={
  	//(n*(n+1)*(n+1)*(n+2))/12
  	(n*(n+1)*(2*n+1))/6
  };System.out.println("""sumOfSqareOfInteger: (n: Int)Int""");$skip(22); val res$0 = 
  
  sumOfInteger(4);System.out.println("""res0: Int = """ + $show(res$0));$skip(25); val res$1 = 
  sumOfSqareOfInteger(2);System.out.println("""res1: Int = """ + $show(res$1))}
}
