/*
    Lesson 6
    Functions
    NOTES:
    Unit = void (nothing in TS/JS)
    fun nameOfFunction(variable: Type): ReturnType {}
    Live Templates:
        fun0 = function with 0 params
        fun1 = function with 1 params
        fun2 = function with 2 params
        TAB to skip through the fills
 */

fun main() {
    //     result1 = Unit return, aka Void / Nothing
    val result = sumOfTwoNumbers2(3, 7)
    println(result)
}


fun sumOfTwoNumbers() {
    println(2 + 2)
}

// Block body function with parameters
// NOTE: MUST CONTAIN ALL TYPES INCLUDING A RETURN
fun sumOfTwoNumbers(a: Int, b: Int): Int {
    // (this is a block body function)
    // return println() { DOESN'T WORK BECAUSE PRINTLN IS VOID OR UNIT }
    return a + b
}

// Expression body function (= syntax)
fun sumOfTwoNumbers2(a: Int, b: Int) = a + b