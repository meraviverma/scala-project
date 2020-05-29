package hackerrankcode
import scala.sys._
import java.io._
import java.math._
import scala.io._
object comparetriplet {
  def compareTriplets(a: Array[Int], b: Array[Int]): Array[Int] = {

    var allice=0
    var bob=0
    
    for(i <- 0 until a.length)
      //for(j <-0 until b.length)
        if(a(i) > b(i)) allice=allice + 1
        else if(a(i) < b(i)) bob=bob + 1
     
    var res=Array(allice,bob)
    return res
    }
  def main(args: Array[String]) {
        //val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val a = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

        val b = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
        
        val result = compareTriplets(a, b)
        
        println(result.mkString(" "))
        println(a.mkString(" "))
        println(b.mkString(" "))
        //Console.println("")
  }
}