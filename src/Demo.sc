object Demo {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val convertLowNumToString = new PartialFunction[Int, String] {
    val nums = Array("one", "two", "three", "four", "five")
    def apply(i: Int) = nums(i-1)
    def isDefinedAt(i: Int) = i > 0 && i < 6
}                                                 //> convertLowNumToString  : PartialFunction[Int,String]{val nums: Array[String]
                                                  //| } = <function1>

lazy val l={
      println("evaluating")
      9
     }                                            //> l: => Int = <lazy>
}