/*
    Lesson 38: Higher-Order Functions
        NOTES:
        - HOF = functions that accept other functions as an arg, or produce a function as a result
        - A lambda function can take multiple params, like (index, name) values passed into it, we can then use
            in the body of the function
        - We must return a type out of the lambda but params types are optional because it can be on many things
*/

fun main() {
    // number list
//    val numbers = listOf(1,2,3,4,5)
//    // predicate lamba variable, we are creating our own expression lambda
//    val moreThenTwo: (Int) -> Boolean = { it > 2 }
//
//    println(numbers.any(moreThenTwo))


    // Repeat() will repeat a number of times with access to a lambda function
    repeat(times = 5) { index ->
        println("$index")
    }
}