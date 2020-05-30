package C.conditionals

//kotlin supports the usual control flow statements:
// if and else
// for loops
// while and do-while loops
// break and continue
// switch and case
// assert

fun main() {

    print(elvisOperator())
    switchCase(200.toDouble())
    forLoop()
}

fun ifElse(age: Int) {
    if (age > 18) {
        print("Allowed to drink")
    } else {
        print("Block")
    }
}

fun elvisOperator(): String {
    //elvis operator
    // return the non null value

    val word: String? = null

    return word ?: "zekaryas"
}

fun switchCase(price: Double) {
    //when is the equivalent switch case in kotlin
    when (price) {
        0.0 -> print("Noting purchased")
        in 0.0..100.0 -> print("small item")
        in 101.0..1000.0 -> print("big item bought")
        else -> print("expensive item bought")
    }
}

fun forLoop() {
    val data = listOf("word", "word2", "word3")
    for (word: String in data) {
        println(word)
    }

//    val keyValueData: Map<String, String> = mapOf("A" to "Apple", "B" to "Banana")
//    for ((key, value) in keyValueData) {
//        print(key + "" + value)
//    }

    //range in for-loop
//    for (i in 'b'..'g')
//    for (i in 1..5)
//    for (i in 5.downTo(10))
//    for (i in 5..10 step 2)


}