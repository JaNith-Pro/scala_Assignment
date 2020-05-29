object ass_3_q5
{ 
  
    def evenaddition(s:Int,n:Int):Int= s match {
       case s if s>n => return 0
       case _ => s+evenaddition(s+2,n)
    }
   
     
    def main(args:Array[String]) 
    {  
         var n=5
           println(evenaddition(2,n))
    } 
} 