open class Vehicle(color:String, tyres: Number, type:String){
        //slfjsdfkjsha
        open var tyres:Number = 5

        init{
            println("Values are $color $tyres $type" )
        }

        open fun bigboss(){
            println("I am in parent class")
        }
}

class SUV(color: String, tyres: Number, type:String): Vehicle(color, tyres, type){
    //sdfsdjfhkj
    override var tyres:Number = 6
    fun callSUV(){
        println("i am in suv  ")
    }

}

class miniSUV(color: String, tyres: Number, type:String):Vehicle(color, tyres, type){

    fun callminiSUV(){
        super.bigboss()
        println("i am in mini suv  ")
    }

    override fun bigboss(){
        println("I will hijack big boss")
    }
}

fun main(ars:Array<String>){

    val v = SUV("red", 4, "SUV")
    println(v.tyres)

    val d = miniSUV("purple", 4, "MUV")
    d.callminiSUV()
    d.bigboss()

}