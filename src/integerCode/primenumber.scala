package integerCode

//code to find the prime number
object primenumber {
   
 
  def isprime(i:Integer):Boolean={
     for(e <- 2 until i){
      if(i%e == 0 )
        return false
    }
      
     return true
    }
  
  def main(args:Array[String]){
    var n=3;
    //var count=0;  
    var check=isprime(n)
    if(check == false)
      println("Number is not prime")
    else
       println("number is prime")
  }
}