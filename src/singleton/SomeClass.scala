package singleton

/*First, a companion object and its class can access each other’s private members 
(fields and methods). This means that the 
printFilename method in this class will work because it can access the HiddenFilename*/ 
class SomeClass {
  def printFilename()={
    println(SomeClass.HiddenFilename)
  }
}

object SomeClass{
  private val HiddenFilename="companion example"
}