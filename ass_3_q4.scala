object ass_3_q4
{ 
   
    def number(n:Int):String=n match {
      case n if n == 0 =>return "Number is even"
      case n if n == 1 => return "Number is odd"
      case _ => number(n-2)
    }
 
    def main(args:Array[String]) 
    {   
         var n=5
           println(number(n))
    } 
} 