fun main(agrs: Array<String>){
    println("Conditions")
    /*
        if(expression){

        }

        if(expression){

        }else{

        }


     */

    val n1 = 50
    val n2 = 15

    val output = if(n1>n2){
        "$n1 is greater than  $n2"
    }else{
        "$n2 is greater than $n1"
    }

    println(output)
}