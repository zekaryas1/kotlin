package E.functions

fun main() {

    greet("Zekaryas")
    greetDefault()
    demoFun(12)
    isTooHot(12)
    lambdaFunction()

}

//function with return type
fun greet(name: String): String {
    return "Hi $name"
}

//function with default value
fun greetDefault(name: String = "zekaryas"): String {
    return "Hi $name"
}


//in kotlin everything returns a value
//example 0 = val temperature = 10 >20
fun demoFun(value: Int): Boolean {
    return when {
        value > 10 -> true
        value == 12 -> false
        else -> false
    }
}

//a function with one line can be re written as
//fun isTooHot(temp: Int): Boolean {
//    return temp > 30
//}
fun isTooHot(temp: Int) = temp > 30


//important lambda functions
fun lambdaFunction() {
    val words: List<String> = listOf("word1", "word2", "word3")

    words.forEach {
        print(it)
    }

    val result = words.find {
        it.startsWith("wor")
    }

    val filteredWords = words.filter {
        it.endsWith("2")
    }
}