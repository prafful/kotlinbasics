class Friends{
    var name:String =""
    private var location:String ="chennai"
    var duration: Number = 0

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

    var f = Friends()
    f.addFriend("prafful", "chennai", 2)


    println("Nested Class: " + Friends.SchoolFriends().schoolName())
    println("Inner Class: " + f.WorkplaceFriends().companyName())

}