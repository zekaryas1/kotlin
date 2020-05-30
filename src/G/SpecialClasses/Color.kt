package G.SpecialClasses

enum class Color {
    Red,
    Green,
    Blue,
    White
}

fun main() {
    val myFavColor = Color.White
    when (myFavColor) {
        Color.White -> print("white")
        Color.Blue -> print("blue")
        else -> print("something else")
    }
}