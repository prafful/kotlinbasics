fun main(args: Array<String>) {
    val myObj = Students("Arjun")
    myObj.printMsg()
}
class Students(var name: String) {

    var age: Int = 14


    constructor (name: String, age: Int): this(name){
        this.age = age
    }
    fun printMsg(){
        println("Name is $name. Age is $age.");
    }
}
