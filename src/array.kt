fun main(args:Array<String>) {
    println("Array")
    //Array Constructor -> Array(size:Int, init:(Init) -> Elements)
    //arrayOf(), intArrayof(), charArrayOf(), booleanArrayof()

    var array1 = arrayOf(1, 2, 3, 5)
    var array2 = arrayOf<Int>(2, 8, 9, 5)
    var array3 = arrayOf<String>("abc", "def", "ghi")
    var array4 = arrayOf(1, 2.5, 'A', "prafful")
    println("old array")
    array1.forEach { eachone ->
        run {
            print(eachone)
            print(" ")
        }
    }
    println("")
    array1.set(0, 8)

    println("new array")
    array1.forEach { eachone ->
        run {
            print(eachone)
            print(" ")
        }
    }

    println("Fourth:" + array1.get(3))
    println("Using For")
    for(element in array4){
        print(element)
        print(" ")
    }

    println("Range")
    for(index in 0..array3.size-1){
        print(array3[index])
        print(" ")
    }

}