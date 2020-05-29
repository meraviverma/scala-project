package proggramming

object fibonacci {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(71); 
  println("fibonacci Program");$skip(12); 
  var a=10;System.out.println("""a  : Int = """ + $show(a ));$skip(13); ;
  var pre=0;System.out.println("""pre  : Int = """ + $show(pre ));$skip(14); ;
  var curr=1;System.out.println("""curr  : Int = """ + $show(curr ));$skip(15); ;
  println(pre);$skip(16); 
  println(curr);$skip(98); 
  for(i <- 2 to a-1){
   var nextval=pre+curr
   pre=curr
   curr=nextval
   println(nextval)
  }}
  
}
