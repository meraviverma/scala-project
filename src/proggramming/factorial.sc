package proggramming

object factorial {
  println("Factorial Program")                    //> Factorial Program
  var num=5                                       //> num  : Int = 5
  var res=1                                       //> res  : Int = 1
  for(i <-1 to num){
  	res=res*i
  }
  println(res)                                    //> 120
  
  println("Factorial In Recursion way")           //> Factorial In Recursion way
  //var a=0
  def factrec(a:Int):Int={
  if(a==1)1 else a*factrec(a-1)
  }                                               //> factrec: (a: Int)Int
  factrec(5)                                      //> res0: Int = 120
}