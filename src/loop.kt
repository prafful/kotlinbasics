fun main(agrs: Array<String>){
    println("Loop")

    val scores = arrayOf(20, 80, 50, 60 ,30)
    for(score in scores){
        print(" $score")
    }
    println("")
    println(scores.indices)
    for(score in scores.indices){
        println(" scores[$score] - " + scores[score])
    }

    for(age in 25..30){
        print(" $age")
    }


    /*
    while(condition){
    }

    do{

    }while(condition)

    break -> terminate the innermost loop or condition
    continue -> skip that particular iteration
    @labels
     */
}