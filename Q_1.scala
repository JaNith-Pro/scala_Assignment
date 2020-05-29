
object Q_1{
       def normal(hour:Int):Int=hour*150

       def ot(hour:Int):Int=hour*75

       def income(h1:Int,h2:Int):Int=normal(h1)+ot(h2)

       def tax(income:Int):Int=income/10

       def takehome(h1:Int,h2:Int):Double=income(h1,h2)-tax(income(h1,h2))

   def main(args: Array[String]) {
       
         println(takehome(40,20));
   }

}
