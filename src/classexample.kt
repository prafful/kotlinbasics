import java.time.Duration

class Friends(var name:String="adi"){
    //var name:String =""
    private var location:String ="chennai"
    var duration: Number = 0

/*  check mixing primary and secondary constructor
    constructor(name: String, duration: Number, ){

    }*/

    fun addFriend(nm: String, loc:String, dur:Number){
        this.name = nm
        this.location = loc
        this.duration = dur

        println("Added new friend from $duration years: $name from $location")
    }

     class SchoolFriends{
        private var school:String = "IIT"

        fun schoolName():String{
            //return "${school}  at  + ${location}" //nested cannot access provate variable of parent class
            return "${school} "
         }
        }

    inner class WorkplaceFriends{
        private var company:String = "CTS"


        fun companyName():String{
            //return "${school}  at  + ${location}" //nested cannot access provate variable of parent class
            return "${company} at ${location} "
        }
    }

}

fun main(args: Array<String>){

    var f1 = Friends("adi")
    var f2 = Friends()



    f1.addFriend("prafful", "chennai", 2)


    println("Nested Class: " + Friends.SchoolFriends().schoolName())
    println("Inner Class: " + f1.WorkplaceFriends().companyName())
    println("--------------------")
    println("${f2.name}")

}