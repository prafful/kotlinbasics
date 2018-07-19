fun main(args:Array<String>){
  println("Lambda Functions")

  println("Addition: ${add(9, 2)}")
  println("Multiplication: ${multiply(25, 25)}")
  var scores = intArrayOf(12, 15, 3, 6, 8, 2,1)

  scores.forEach { eachScore -> run{
                                  print(eachScore*eachScore)
                                  print(" ")
                                }
  }
}

var add = {n1:Int, n2:Int -> n1+ n2 }
var multiply: (Int, Int) ->Int = {n1, n2 -> n1 * n2}

/*

fun add(n1: Int, n2: Int){
   println(n1 + n2)
}
*/
