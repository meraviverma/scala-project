package hackerrankcode

//https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup

/*Gary is an avid hiker. He tracks his hikes meticulously, paying close attention to small details like topography. 
During his last hike he took exactly  steps. For every step he took, he noted if it was an uphill, , or a downhill, 
step. Gary's hikes start and end at sea level and each step up or down represents a  unit change in 
altitude. We define the following terms:

A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level and 
ending with a step down to sea level.
A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level and 
ending with a step up to sea level.*/

object countingvalley {
  def countingValleys(n:Int,s:String):Int={
    //println(n);
    //println(s)
    var l=0;
    var count=0;
    for( c <- s){
      //println(c)
      if(c == 'U')l=l+1
        else if(c == 'D')l=l-1

        if(l==0 && c =='U')
        count=count +1
        }
        return count
    }
  
  def main(args: Array[String]) {
    val n=8
    val s="UDDDUDUU"
    val result = countingValleys(n, s)
    println(result)
  }
}