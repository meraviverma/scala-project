package hackerrankcode

//Problem statement
/*John works at a clothing store. He has a large pile of socks that he must pair by color for sale. 
Given an array of integers representing the color of each sock, determine how many pairs of 
socks with matching colors there are.

For example, there are n=7 socks with colour arr=[1,2,1,2,1,3,2] 
There is one pair of color  1 and one of color 2. 
There are three odd socks left, one of each color. The number of pairs is 2 .

Sample Input
9

10 20 20 10 10 30 50 10 20

Sample Output

3*/

object sockCode {
  // Complete the sockMerchant function below.
    def sockMerchant(n: Int, ar: Array[Int]): Int = {

      var count=0;
      var pair=0;
      var finalpair=0
      val elem=ar.toSet.toArray
     
      for(i<- 0 until elem.length ){
        for(j <- 0 until ar.length){
          if(elem(i)==ar(j))count=count+1;
        }
        pair=count/2;
        finalpair=finalpair+pair;
        count=0;
      }

      finalpair
    }

    def main(args: Array[String]) {
      val n=9;
      val ar= Array(10, 20, 20, 10, 10, 30, 50, 10, 20);
      
        //val stdin = scala.io.StdIn

        //val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        //val n = stdin.readLine.trim.toInt

        //val ar = stdin.readLine.split(" ").map(_.trim.toInt)
        val result = sockMerchant(n, ar)

        println(result)
        //printWriter.println(result)

        //printWriter.close()
    }
}