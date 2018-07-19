fun main(agrs: Array<String>){
    println("Function")
    //user defined
    //standard library

    var num2 = 25
    var number1 = Math.sqrt(num2.toDouble())
    println(number1   )
    println(number1 is Double)

    var received:String = callMeNow("hello from andromeda")

    println(received)
}

fun callMeNow(msg: String): String{
    return "called from space: $msg"
}