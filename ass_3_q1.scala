
object ass_3_q1 {
   def main(args: Array[String]) {
         if(prime(5))
                 println("yes")
            else
                println("NO") 
   }
   
   def prime(num: Int,n:Int=2): Boolean = n match {
      case n if num == n  => return true
      case n if gcd(num,n)>1 =>return false
      case _ => prime(num,n+1)
   }
   def gcd(a:Int,b:Int):Int=b match {
       case 0=>return a
       case b if a%b == 0 => return b
       case _ =>return gcd(b,a%b) 

       }
   }
