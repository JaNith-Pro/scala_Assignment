object ass_3_q1 {
   def main(args: Array[String]) {
        var n =1000
            
            for(i<-1 to n)
            {
                 if(primeSeq(i))
                    println(i)
                    
            }
   }
   
   def primeSeq(num: Int,n:Int=2): Boolean = n match {
      case x if num == n  => return true
      case x if gcd(num,n)>1 =>return false
      case _ => primeSeq(num,n+1)
   }
   def gcd(a:Int,b:Int):Int=b match {
       case 0=>return a
       case b if a%b == 0 => return b
       case _ =>return gcd(b,a%b) 

       }
   }
