/*
    Lesson 16: Class Constructor
        NOTES:
        - Ommited by default
        - Constructors are used for passing information to the class on construct
        - Not exposed by default through a variable (private)
        - Functions in a class cannot access constructor params unless added in the constructor `val` or `var`
        - Ctrl + 0 = open up the override members window to override a function
        - override keyword = replace default logic
        - super = parent class (coming soon)
        - How do we call a class parameter when it contains var/val keyword?
            - via Class properties
        - You cannot change a function definition when overriding it
 */

fun main() {
    val person = Person(name = "Stefan")
    println(person.toString())
}

// Param with default value
class Person(val name: String) {
    // Overriding the default functionality of `toString()`
    override fun toString(): String {
        return name
    }

    fun getName() {
        println(name)
    }
}