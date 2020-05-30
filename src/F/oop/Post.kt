package F.oop


//data class
//default getter and setter
//have comparison
//have to string

data class Post(val userName: String, val post: String)

fun main() {
    val post1 = Post("zekaryas", "the box by roddy richie")
    print(post1)

    //destructor
    val (username, post) = post1
}