package proggramming

object factorial {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(71); 
  println("Factorial Program");$skip(12); 
  var num=5;System.out.println("""num  : Int = """ + $show(num ));$skip(12); 
  var res=1;System.out.println("""res  : Int = """ + $show(res ));$skip(34); 
  for(i <-1 to num){
  	res=res*i
  };$skip(19); 
  println(res);$skip(43); 
  
  println("Factorial In Recursion way");$skip(75); 
  //var a=0
  def factrec(a:Int):Int={
  if(a==1)1 else a*factrec(a-1)
  };System.out.println("""factrec: (a: Int)Int""");$skip(13); val res$0 = 
  factrec(5);System.out.println("""res0: Int = """ + $show(res$0))}
}
