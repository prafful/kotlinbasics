fun main(args:Array<String>) {
    println("String")
    //String is the array of character types

    val character = charArrayOf('k','o','t','l','i','n')
    val score = intArrayOf(1,2,3,4)
    val language = String(character)
    println(character)
    println(language)
    println("Length: " + language.length)
    println("Indices: " + language.indices)
    println("Last Index: " + language.lastIndex)

    println(language.compareTo("kotlin1"))
    println(language.get(language.lastIndex-4))
    println(language.plus(" is fun"))
    println(language.subSequence(0, 3))
    println(language.drop(3))

    println(language[language.lastIndex])

    var message = "have fun \nat the beach!!!"

    println(message)

    var multimessage = """
        hello
        i
        am
        good
        have
        some fun
    """
    println(multimessage)
}