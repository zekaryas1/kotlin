package G.SpecialClasses

object Database {

    var dbName = "AbcTrent inc."

}

fun main() {
    //no need for ()
    val singletion = Database
    singletion.dbName = "12"
}