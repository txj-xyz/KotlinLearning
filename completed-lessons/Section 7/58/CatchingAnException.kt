/*
    Lesson 58: Catching an Exception
        NOTES:
        - Compile time Error = shown at compile time
        - Runtime error      = show up when you start executing
        - Exception =
            1. Error reporting
            2. Recovery
            3. Resource cleanup
        - Can inherit an Exception class or its subtypes or from a throwable class
        - `catch(e: ExceptionTypeHere)` = keyword for catching exceptions same as TS/JS Async, except we can chain `catch(){}`
        - `Throwable` is the base class for all Exceptions so we can use that in a `catch(){}`
        - `try{}catch(){}finally{}` = finally will always trigger so we can do resource cleanup all the time
*/

fun main() {
//    errorCode()
//    function3()
    function4()
}

// ----
fun function1() {
    throw InvalidNumberException(description = "Random number error")
//    throw CustomException(description = "Some Random Error.")
}

fun function2() {
    function1()
}

fun function3() {
    function2()
}
// ----

// Catch the exception type with a `try{}catch(){}` with its exception message
fun function4() {
    try {
        function1()
        // If we use `Throwable` catch this means that ALL exceptions extend this so we can see anything
    } catch(e: Throwable) {
        println("Exception caught: ${e.message}")
    } finally {
        println("Cleanup")
    }
//    catch(e: InvalidNumberException) {
//        println("Exception caught: ${e.message}")
//    }
}

fun errorCode() {
    throw InvalidNumberException(description = "Please enter the valid number")
}

class InvalidNumberException(
    description: String
): Exception(description)

open class CustomException(
    description: String
): Throwable(description)

// We can chain inherit from our custom Exception handling here since we have marked it `open class`
class InheritCustomException(description: String): CustomException(description) {

}