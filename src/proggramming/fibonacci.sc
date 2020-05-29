package proggramming

object fibonacci {
  println("fibonacci Program")                    //> fibonacci Program
  var a=10;                                       //> a  : Int = 10
  var pre=0;                                      //> pre  : Int = 0
  var curr=1;                                     //> curr  : Int = 1
  println(pre)                                    //> 0
  println(curr)                                   //> 1
  for(i <- 2 to a-1){
   var nextval=pre+curr
   pre=curr
   curr=nextval
   println(nextval)
  }                                               //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 5
                                                  //| 8
                                                  //| 13
                                                  //| 21
                                                  //| 34
  
}