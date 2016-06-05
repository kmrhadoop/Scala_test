import scala.io._

object shoppingCartApp extends App {

     println("***Shopping Cart***")
     println("Enter List of Items(Apple,Orange) separated by comma:")
     var cart = scala.io.StdIn.readLine.split(",").toList
    // Assinging the Cost of the items and initializing the shoppingcart 
     var shopCart=new shoppingCart(.60,.25,cart) 
}

//Shoppingcart for performing the cart operations
class shoppingCart(var appleCost: Double, var orangeCost:Double, var cart: List[String])
{
 var aCost:Double = appleCost
 var oCost:Double = orangeCost
 var totalCost:Double=0
 var numberOfApples=0
 var numberOfOranges=0
 
 //Calling the Number of items 
 calculateNoItems
 
 //Implementation of number of items object 
 //responsible for calculating number of items
 object calculateNoItems {
   val items=cart
   if(items(0)!="")
   {
     for (name <- items) 
     {
       if(name.toLowerCase().contains("apple"))
         numberOfApples+=1;
       else if (name.toLowerCase().contains("orange"))
         numberOfOranges+=1;
      }
  
     //Calling the calculate items
     calculateCost(aCost,numberOfApples,oCost,numberOfOranges)
  
   
   }
   else
     println("Empty Cart")
  
 }
//Calculate the cost of the items
 def calculateCost(aCost:Double,numberOfApples:Int,oCost:Double,numberOfOranges:Int){
      totalCost= aCost* numberOfApples + oCost* numberOfOranges;
      println("Here is the total Cost:"+totalCost)
 }
}