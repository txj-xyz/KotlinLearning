import kotlin.random.Random

/*
    Lesson 35: Lambdas
        NOTES:
        - Anonymous functions that can be treated as values
        - Pass to functions -> return them -> or use them as values
        - Function literals = param expressions
        - `(T) -> R` = lambda expression
        - `<Iterable>.map{number -> action()}` returns a new list with the transformed elements
        - Last expression inside the lambda body is the return value
        - You can call a lambda directly in a variable see line #20
        - Lambda expressions are declared directly inside curly brackets
        - Inside a lambda body brackets the last thing is the returned type
        - The last parameter in the function that is a lambda is called "Trailing lambda"
*/

fun main() {
//    val numbers = listOf(1,2,3)
//    // Lambda map function on each number of the `listOf()`
//    val quotedNumbers = numbers.map { number ->
//        "\"$number\""
//    }
////    val quotedNumbers = numbers.map(transform = { number ->
////        "\"$number\""
////    })
//    println(numbers) // `<List<Int>>
//    println(quotedNumbers) // <List<String>>
//
//    val quotedNumbers2 = numbers.joinToString { number ->
//        "\"$number\""
//    }
//    println(quotedNumbers2)
//
//    // Must specify lambda types explicitly
//    val quoted = { number: Int -> "\"$number\""}
//    val quotedNumbers3 = numbers.joinToString(transform = quoted)
//
//    // Unused lambda parameter
//    val quotedNumbers4 = numbers.mapIndexed { _, number ->
//        "$number"
//    }

    // raw define lambda
    button(onClick = {
        println("Clicked1")
    })

    //call button directly with a lambda body
    button { println("Clicked") }

    // since we are receiving an Int we need to return out a String
    button2 { random -> "Random Number: $random" }

}

// Creating our own function with a lambda (expression)
fun button(onClick: () -> Unit) {
    onClick()
}

// Lambda with receiving an Int and returning out a String
fun button2(onClick: (Int) -> String) {
    onClick(Random.nextInt(from = 0, until = 100))
}