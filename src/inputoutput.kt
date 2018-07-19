import javax.print.attribute.IntegerSyntax

fun main(agrs: Array<String>){
    println("Input and Output")
    print("Your name: ")
    val name = readLine()
    print("Your age: ")
    val age = readLine()
    //println("")
    println("Name: " + name + " " + "Age: " + age)
    print("Score1: ")
    var score1 = Integer.valueOf(readLine())

    print("Score2: ")
    var score2 = Integer.valueOf(readLine())

    println("Scores are $score1 and $score2")

}