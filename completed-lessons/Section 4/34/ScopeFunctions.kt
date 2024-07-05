/*
    Lesson 34: Scope functions
        NOTES:
        - `let/with/apply/also` = scope based functions
        - `let` = onyl fire if recieved is not null
        - `run` = execute a block of code on an object and return it, you can modify things from this as well
        -
*/

fun main() {
    // Check if something is not null
//    val name: String? = "Joey"
//    val length = name?.let {
//        println("Name is not null")
//        it.length
//    } ?: 0
//    println("Length: $length")
//
//    // Modify something on the class we have constructed
//    val person = Person(name = "Joey", age = 29)
//    val result = person.run {
//        age += 35
//        "Name: $name - Age: $age"
//    }
//    println(result)
//
//    // does the same thing as above modifies properties
//    val person2 = Person(name = "Joey", age = 29)
//    val result2 = with(person2) {
//        age += 35
//
//    }
//    println(result2)

//    // configure and object and return out the object after changes
//    val person3 = Person(name = "Joey", age = 29)
//    val result3 = person3.apply {
//        age = 40
//        name = "Marry"
//    }
//    println(result3)

    // Do multiple functionalities on the variable, we can call functions or methods
    val numbers = mutableListOf(1,2,3,4)
    val sum = numbers
        .also { println("Original List: $it") }
        .sum()
    println(sum)
}

data class Person(var name: String, var age: Int)