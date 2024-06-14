/*
    Lesson 13: Expressions and statements
    NOTES:
        expression = doesnt change the state of something
            - always produces a result
        statements = changes the state of something as declared
            - does not produce a result
            - has an effect on something but doesnt produce
            - variable or property assignment is a statement
        for() = statement meaning we can evaluate something
        Unit = void
 */

fun main() {
    for (i in 1..10) {

    }
    val result = unitFun() // this is an expression

    var number = 10
    number = 100 // both of these is not an expression, this is a statement
}



// expression body = functions
fun bigger(a: Int, b: Int) = if (a > b) a else b

fun unitFun() = Unit // same as below
fun unitFun2() {} // will return a Unit, do not need to return explicitly