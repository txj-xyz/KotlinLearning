/*
    Lesson 25: Overloading
        NOTES:
        - `Overload` refers to the name of the function
        - Overload = modify the function of the same name
        with a different signature
        - Compares signatures they cannot be the same
        - Parameter list must be unique
        - Cannot overload a function based on the return type
        - FUNCTION SIGNATURE CONTAINS:
            "FUNCTION NAME, PARAM LIST, RETURN TYPE"
 */

fun main() {

}

// Example of a basic overload
//fun person(name: String) {}
//fun person(name: String, age: Int) {}

// Another example of overloading
//fun person(name: String) {}
//fun person(name: Char) {}


class Person{
    fun getName(name: String) = name
}
// This doesn't work because the member of the class
// Already has this functionality
//fun Person.getName(name: String) = name