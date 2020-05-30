package F.oop

//good practice
//use only primary constructor
//use val/var at primary constructor as it adder getter and setter

class Animal(val name: String, var age: Int = 0) {

    //use to check(validate) primary constructor value
    init {
        if (age < 0) {
            throw IllegalArgumentException("age can't be negative")
        }
    }

    fun anotherYear() {
        this.age++
    }

    fun getInformation(): String {
        return "Name is $name age is $age"
    }
}


fun main() {
    val dog = Animal("charlie", -1)
    dog.anotherYear()
    print(dog.getInformation())
}