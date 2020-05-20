object assignment_q3{
    
       def cost(x:Int,oneprice:Double):Double={
             return x*oneprice+3
             
       }
       def cost1(x:Int,oneprice:Double):Double={
            return cost(x,oneprice)+(x-50)*0.75
       }
     
   def main(args: Array[String]) {  
    var oneprice=24.95*60/100
    var x=60;
    if(x <51){
        println("price is "+cost(x,oneprice))
    }else{
         println("price is "+cost1(x,oneprice));
    }

   
   } 

}
