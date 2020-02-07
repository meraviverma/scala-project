package caseclass

trait SuperTrait
case class caseclass1(a:Int,b:Int) extends SuperTrait
case class caseclass2(a:Int) extends SuperTrait
case object caseobject extends SuperTrait
object casedemo2 {
  
  def main(args:Array[String]){
    
    callCase(caseclass1(10,20))
    callCase(caseclass2(40))
    callCase(caseobject)
  }
  
  def callCase(f:SuperTrait)=f match{
    case caseclass1(f,g)=>println("a= "+f+" b= "+g)
    case caseclass2(f)=>println("a= "+f)
    case caseobject=>println("No Argument")
  }
}