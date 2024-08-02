/*
    Lesson 43: Folding Lists
        NOTES:
        - <List>.fold(startingNumber = 0) { accumulatedSum, numberInList -> ... }
        - Fold function will keep adding the numbers together in the list, for example just like Excel
        - Essentially we are doing math operations on each one of the numbers in our list
        - Accumulates values starting with the initialValue
        - The logic is for functional based coding
*/

fun main() {
    val list = listOf(1, 10, 100, 1000)
    // Starting from the left of the list, we sum numbers together
//    val result = list.fold(initial = 0) { sum, number ->
//        println("Initial: $sum, Number: $number")
//        sum + number
//    }
//
//    // Instead of starting left -> right, we are now doing right -> left
//    val result2 = list.foldRight(initial = 0) { sum, number ->
//        println("Initial: $sum, Number: $number")
//        sum + number
//    }

//    // Using reduce we can do similar operations
//    val result3 = list.reduce { sum, number -> sum + number }
//    println(result3)
//    println("Final result: $result")
//    println("Final result2: $result2")
//    foldReplica()


    // `runningFold` will return out a list of numbers we started with on each fold operation
    val result4 = list.runningFold(initial = 1) { sum, number ->
        println("Initial: $sum, Number: $number")
        sum + number
    }
    println(result4)
}

// Custom logic, that replicates the `fold()` function we wrote above
fun foldReplica() {
    val list = listOf(1,10,100,1000)
    var accumulator = 0
    val operation = { sum: Int, number: Int -> sum + number }
    for (number in list) {
        accumulator = operation(accumulator, number)
    }
    print(accumulator)
}