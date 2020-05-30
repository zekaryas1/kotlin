package B.variables

//data types in kotlin
//String
//Int
//Double
//Boolean
//Char
//Date
//and more

//data type can be differed no need to explicitly declare
fun main() {

    //var for variable that changes
    var age = 21

    //val for variable that is constant(final)
    val name = "zekaryas"

    //val vs const
    //val - value is determined at program execution
    //const - value is determined at compile time
    //const - at class level must be in companion

}

fun dataConversion() {
    //in kotlin we can treat primitives as objects
    print(1.toLong())
    print("word".toInt())
    print(12.3.toString())
}

fun nullableVariables() {
    //by default every variable is not nullable
    //to make a variable nullable use ? mark

    //var age : Int = null //is an error
    var rocks: Int? = null

    var listOfFish: List<String?> = listOf("word", null, "word3")
    var listOfFish2: List<String>? = null

}