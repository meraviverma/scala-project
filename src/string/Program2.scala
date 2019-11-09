package string

//Given a set of string sort them length wise.Eliminate duplicate string.
object Program2 {
  def main(args:Array[String]):Unit={
    
    
    val input=List("ramky","ram","sam","Amar","ram");
    
    //val uniq_elm=input.toSet;
    
    //println(uniq_elm);
    
    //uniq_elm.foreach(println);
    println("####### Element size ##########")
    input.foreach((c:String)=>println(c.size));
    
    val sorted_elm=input.sortBy(x=> x.size);
    val sorted_elm_rev=input.sortBy(x=> x.size).reverse;
    
    println("### Sort  Order ####");
    sorted_elm.toSet.foreach(println);
    println("### Sort In reverse Order ####");
    sorted_elm_rev.toSet.foreach(println);   
    
  }
}

/* OUTPUT
 ####### Element size ##########
5
3
3
4
3
### Sort  Order ####
ram
sam
Amar
ramky
### Sort In reverse Order ####
ramky
Amar
ram
sam
 
 */
