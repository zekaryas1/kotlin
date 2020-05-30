package D.dataStructure

//1.map
//2.list
//3.set

//mutable
//not fixed can add more

//immutable
//default
//fixed can't add more

fun main() {
    //list
    val fixedList: List<String> = listOf("A", "B", "C")

    val dynamicList: MutableList<String> = mutableListOf("A", "B", "C")
    dynamicList.add("D")


    //map
    val fixedMap: Map<String, String> = mapOf("A" to "Apple", "B" to "Banana")

    val dynmaicMap: MutableMap<String, String> = mutableMapOf("A" to "Apple", "B" to "Banana")

    //set
    val fixedSet: Set<Int> = setOf(1, 2, 3, 3) //the last 3 is lost

    var dynamicSet: MutableSet<Int> = mutableSetOf(1, 2, 3, 4, 5)
}

//reversing a list
fun reverseAList(list: List<String>) = list.reversed()