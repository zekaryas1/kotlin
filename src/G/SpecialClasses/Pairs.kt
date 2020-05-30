package G.SpecialClasses

fun main() {
    var (firstNmae, lastName) = giveMeTwo()
}

//use pair to return multiple result
fun giveMeTwo(): Pair<String, String> {
    return "Zekaryas" to "Tadele"
}