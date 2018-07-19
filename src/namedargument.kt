fun main(agrs: Array<String>){
    println("Named Argument")

    callThis()
    callThis2(8)
    callThis2(8, "adi")
    callThis2( name= "adi")
}

fun callThis(name: String = "prafful", score: Number = 88){
    println("Default arguments are: $name and $score")
}

fun callThis2(score:Number = 88, name:String = "prafful"){
    println("Default arguments are: $name and $score")
}