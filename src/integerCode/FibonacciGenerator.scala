package integerCode

import scala.collection.mutable.ListBuffer

//1, 1, 2, 3, 5, 8
object FibonacciGenerator {
  
  def main(args:Array[String]):Unit={
    
    //1 st way print in the function itself
    def fibonacigen(arg:Integer){
      
      println("Fibonacci Series Print in function--1st Way")
      
      var perv1=1;
      var perv2=1;
      var sum=0;
      if(arg==1)
        println("1")
        else if(arg == 2){
          println(perv1)
          println(perv2)}
          else{
            println(perv1)
            println(perv2)
            for(n<-2 to arg){ //5 1 1 2 3 
              sum=perv1 + perv2;
              perv1=perv2;
              perv2=sum;
              println(sum)
            }
          }
            
    }
    fibonacigen(3)
    
    
  }
}