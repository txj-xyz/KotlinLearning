/*
    Lesson 29: Destructing Declarations
        NOTES:
        - `Pair` = store 2 values
        -
        - `val (id, name) = <Pair>` = deconstruction declaration
        - `val (_, name) = <Class>` = deconstruction declaration but skipping the first param in the constructor
            must be in order sequentially
        - for((number, text) in mapOf()) = specifically deconstruct the map must be done in a for loop
*/

fun main() {
//    val pair = Pair(first = 1, second = "Joey")
//    println(pair.first)
//    println(pair.second)
//
//    val (id, name) = pair
//    println(id)
//    println(name)

//    val person = Person(name = "Joey", age = 37, address = "Sandy")
//    // Deconstructing `<Person>`
//    val (name, age, address) = person
//
//    val map = mapOf(1 to "One")
////    val (number, text) = map
//    for ((number, text) in map) {
//        println(number)
//        println(text)
//    }
//    Triple(first = 1, second = 2, third = 3)

}

data class Person(
    val name: String,
    val age: Int,
    val address: String
)