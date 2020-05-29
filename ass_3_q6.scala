object ass_3_q6
{ 
    
    def fibonacci(n:Int):Int=n match {
      case n if n <=1 =>return n
      case _ => fibonacci(n-1)+fibonacci(n-2)
    }
    
   
    def main(args:Array[String]) 
    {    
         var n=10
           
         for (i <-0 to n){
             println(fibonacci(i))
         } 
          
    } 
} 