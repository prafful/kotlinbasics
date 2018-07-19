fun main(agrs: Array<String>){
    println("When")

    var score = 90
    /*var check = when(score){
        22 -> "Twenty Two"
        88 -> "Eighty Eight"
        55 -> "Fifty Five"
        else -> "Invalid Score"
    }
*/
    when(score){
        20, 22, 32 -> {
            print("Twenty Two :")
            print("My score is low!!!")
        }
        in 88..99 -> {
            print("Eighty Eight :")
            print("My score is good!!!")
        }
        55 -> {
            print("Fifty Five :")
            print("Work more better!!!")
        }
        else ->{
            print("No Valid Score - ")
            print("Go get some juice")
        }
    }
    //println("Your score is $check")
}