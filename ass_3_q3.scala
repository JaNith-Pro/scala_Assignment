object ass_3_q3
{ 
     
    def addition(n:Int): Int=n match {
      case n if n <=0 => return n
      case _ => n+addition(n-1)
    }

    def main(args:Array[String]) 
    {   
         var n=5
           println(addition(n))
    } 
} 