/*
    Lesson 45: Secondary Constructors
        NOTES:
        - Secondary Constructors: cannot directly contain the code you want to execute
        - `init {}` during object creation is initialized
        - constructor params in order to access outside the `init{}` we need a `val` keyword
        - also known as `overloaded constructor` with additional information
        - we need to use additional params that do not match the initial signature
        - `constructor(overrides params): this(default constructor param)` is an override and is dynamically matched
        - you cannot use `var/val` on a secondary constructor
        - a constructor is a combination of the param list and the init block
        - constructor = param list and init block
        - the alternative for a secondary constructor is the default arguments, we can update them instead
            of using another constructor
        - you must call the primary constructor when decalring a secondary constructor
*/

fun main() {
    val person = Person(name = "Joey")
    val person2 = Person(name = "Peter", age = 25) // dynamically matches the primary constructor
    val person3 = Person(name = "Peter", age = 25, isMale = false) // dynamically matches the secondary constructor
}

class Person(
    val name: String,
//    val age: Int = 0,
//    val isMale: Boolean = false
) {
    // triggered at creation
    init {
        println("Hey $name, I'm currently initializing...")
    }

    // second fired init
    init {
        println("Executing after the first init block")
    }

    constructor(name: String, age: Int): this(name = "Joey2") {
        println("Secondary constructor #1")
    }

    constructor(name: String, age: Int, isMale: Boolean): this(name = "Joey3") {
        println("Secondary constructor #2")
    }

    // access constructor param
//    fun printName() {
//        println("My name is: $name")
//    }
}