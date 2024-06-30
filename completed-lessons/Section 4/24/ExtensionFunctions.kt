/*
    Lesson 24: Extension Functions
        NOTES:
        - Will allow you to add member functions to an existing class
        even though you do not own that `class`
        - Only public variables are accessible for extension functions
        - cannot access private variables from constructor
        - To make extensions of default builtin or classes
        - `this` will access the incoming receiver object
        - meant to extend a function
 */

fun main() {
//    val name = "Joey"
//    println(name.h1())

    val person = Person(name = "Joey", age = 29, address = "Sandy Utah")
    println(person.info())
    println(person.addressInfo())
}

//fun String.h1(): String {
//    //`this` is the `String.` since we are accessing a string
//    // just like TS/JS
//    return "<h1>$this</h1>"
//}

class Person(
    private val name: String,
    private val age: Int,
    val address: String
) {
    fun info() = "My name is $name, and I'm $age years old!"
}

// Accepts `this.address` as well since it's in the class
// as public var constructor
fun Person.addressInfo(): String = "Come visit me in $address"