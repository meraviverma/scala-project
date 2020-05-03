package collection_framework.option

/*getOrElse() Method:
This method is utilized in returning either a value if it is present or a default value 
when its not present. 
Here, For Some class a value is returned and for None class a default value is returned.

Here, the default value assigned to the None is 17 so, it is returned for the None class.

Returns the option's value if it is nonempty,or `null` if it is empty.Although the use of null is discouraged,
* */


object get {
  
  def main(args: Array[String]){
    
    //Using some class
    val some:Option[Int]=Some(15)
    
    //Using None class
    val none:Option[Int]=None
    
    //Applying getorelse method
    val x=some.getOrElse(0)
    val y=none.getOrElse(17)
    
    println(x)
    println(y)
    
   /* isEmpty() Method:
This method is utilized to check if the Option has a value or not.*/

    // Applying isEmpty method 
        val x1 = some.isEmpty 
        val y1 = none.isEmpty 
  
        // Displays true if there 
        // is a value else false 
        println(x1) 
        println(y1)
    
  }
}
