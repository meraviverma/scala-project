package com.mytut.function

object demoAnonymousfunction {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(102); 
  println("Welcome to the Scala worksheet");$skip(75); 
	
	println("############## Anonymous Function Example 11 ############## ");$skip(173); 
				// Creating anonymous functions
        // with multiple parameters Assign
        // anonymous functions to variables
	var myfc1=(str1:String,str2:String)=>str1 + str2;System.out.println("""myfc1  : (String, String) => String = """ + $show(myfc1 ));$skip(209); 
	
				// An anonymous function is created
        // using _ wildcard instead of
        // variable name because str1 and
        // str2 variable appear only once
        var myfc2 = (_:String) + (_:String);System.out.println("""myfc2  : (String, String) => String = """ + $show(myfc2 ));$skip(112); 
          
        // Here, the variable invoke like a function call
        println(myfc1("Geeks", "12Geeks"));$skip(44); 
        println(myfc2("Geeks", "forGeeks"));$skip(92); 
        
        
   println("############## Anonymous Function Example 2 ############## ");$skip(130); 
        // Creating anonymous functions
        // without parameter
        var myfun1 = () => {"Welcome to GeeksforGeeks...!!"};System.out.println("""myfun1  : () => String = """ + $show(myfun1 ));$skip(26); 
        println(myfun1());$skip(198); 
          
        // A function which contain anonymous
        // function as a parameter
        def myfunction(fun:(String, String)=> String) =
        {
            fun("Dog", "Cat")
        };System.out.println("""myfunction: (fun: (String, String) => String)String""");$skip(173); 
          
        // Explicit type declaration of anonymous
        // function in another function
        val f1 = myfunction((str1: String,str2: String) => str1 + str2);System.out.println("""f1  : String = """ + $show(f1 ));$skip(94); 
          
        // Shorthand declaration using wildcard
        val f2 = myfunction(_ + _);System.out.println("""f2  : String = """ + $show(f2 ));$skip(20); 
        println(f1);$skip(20); 
        println(f2);$skip(88); 
        
        println("############## Anonymous Function Example 3 ############## ");$skip(83); 
        def sumInts(a: Int, b: Int): Int = if (a > b) 0 else a + sumInts(a + 1, b);System.out.println("""sumInts: (a: Int, b: Int)Int""");$skip(21); val res$0 = 
        sumInts(5,9);System.out.println("""res0: Int = """ + $show(res$0))}
	
}
