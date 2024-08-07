import java.io.File

/*
    Lesson 59: Check Instructions
        NOTES:
        - Is to confirm that certain constraints are satisfy
        - used for function arguments and results (similar to assert())
        - typically throw exception when failed
        - () -> Any = lambda {}
        - `init { require(value = Boolean) {"Return String"} }` builtin function to assert what we want to require
            out of the class
        - require() without the lambda is just a message called `Failed Requirement`
        - check function used for post condition or not sure what we want to provide
            throws IllegalStateException to make sure our returned state is what we desire
        - require() = throws an IllegalArgumentException if the condition is false
        - check() =  throws an IllegalStateException if the condition is false because do not have the right state
            Both of `require()` and `check()` have messages that can be passed
*/

fun main() {
//    val person = Person(name = "12345678912331231231231231231231321", age = 29)
//    println(multiplyWithTen(number = 10))
    writeToFile()
}

// our check() returns false so we throw the lambda instead of continuing with `IllegalStateException`
fun writeToFile() {
    val myFile = File("MyFile.txt")
//    check(value = myFile.exists())
    check(value = myFile.exists()) {
        "${myFile.name} does not exist."
    }
    myFile.writeText(text = "Everything is okay")
}

// Expecting a non-null number returned, we are checking with `requireNotNull`
fun multiplyWithTen(number: Int?): Int {
    requireNotNull(value = number) {
        "We need a non null number"
    }
    return number * 10
}

// We are requiring a specific set of argument checks using the init {} when constructed and a `require` to check
// our condition we provide from the params, in this case its less than 20 chars for a name it must return true
data class Person(
    val name: String,
    val age: Int
) {
    init {
        require(value = name.length < 20)
//        {
//            "Your name is too long."
//        }
    }
}