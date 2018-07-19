fun main(agrs: Array<String>){
    println("Variables")

    var name:String = "prafful"
    val age:Number = 36
    name = "Bikash" //possible as name is mutable
    //age = 26 //not possible as age is immutable
    println("Name: " + name)
    println("Age: " + age)

    //Kotlin built in data types
    //Number String Boolean Array Character
    //Number - Byte, Short, Int, Long, Float, Double

    val alphabet:Char = 'a' //4 bit  -> -128  to 127

    val flag:Boolean = true

    val scores = arrayOf(20,30,80,60,50)

    val marks  = IntArray(5){i -> 4 }

    val numbers = Array(5, {i -> 8 })

    val location:String = "Kotlin is beauty!!!"

    println(alphabet + " " + flag + " " + scores[0] + " " + numbers[0] +  " "  + location )

    println(scores[scores.size-1 ])

    for (m in marks){
        print(m)
        print(", ")
    }
}