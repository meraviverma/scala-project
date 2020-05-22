package com.mytut.function

object demoAnonymousfunction {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
	
	println("############## Anonymous Function Example 11 ############## ")
                                                  //> ############## Anonymous Function Example 11 ############## 
				// Creating anonymous functions
        // with multiple parameters Assign
        // anonymous functions to variables
	var myfc1=(str1:String,str2:String)=>str1 + str2
                                                  //> myfc1  : (String, String) => String = com.mytut.function.demoAnonymousfuncti
                                                  //| on$$$Lambda$8/1513712028@2752f6e2
	
				// An anonymous function is created
        // using _ wildcard instead of
        // variable name because str1 and
        // str2 variable appear only once
        var myfc2 = (_:String) + (_:String)       //> myfc2  : (String, String) => String = com.mytut.function.demoAnonymousfuncti
                                                  //| on$$$Lambda$9/240650537@1cd072a9
          
        // Here, the variable invoke like a function call
        println(myfc1("Geeks", "12Geeks"))        //> Geeks12Geeks
        println(myfc2("Geeks", "forGeeks"))       //> GeeksforGeeks
        
        
   println("############## Anonymous Function Example 2 ############## ")
                                                  //> ############## Anonymous Function Example 2 ############## 
        // Creating anonymous functions
        // without parameter
        var myfun1 = () => {"Welcome to GeeksforGeeks...!!"}
                                                  //> myfun1  : () => String = com.mytut.function.demoAnonymousfunction$$$Lambda$1
                                                  //| 0/2088051243@4c203ea1
        println(myfun1())                         //> Welcome to GeeksforGeeks...!!
          
        // A function which contain anonymous
        // function as a parameter
        def myfunction(fun:(String, String)=> String) =
        {
            fun("Dog", "Cat")
        }                                         //> myfunction: (fun: (String, String) => String)String
          
        // Explicit type declaration of anonymous
        // function in another function
        val f1 = myfunction((str1: String,str2: String) => str1 + str2)
                                                  //> f1  : String = DogCat
          
        // Shorthand declaration using wildcard
        val f2 = myfunction(_ + _)                //> f2  : String = DogCat
        println(f1)                               //> DogCat
        println(f2)                               //> DogCat
        
        println("############## Anonymous Function Example 3 ############## ")
                                                  //> ############## Anonymous Function Example 3 ############## 
        def sumInts(a: Int, b: Int): Int = if (a > b) 0 else a + sumInts(a + 1, b)
                                                  //> sumInts: (a: Int, b: Int)Int
        sumInts(5,9)                              //> res0: Int = 35
	
}