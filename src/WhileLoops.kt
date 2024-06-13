/*
    Lesson 10
    While loops
        NOTES: Should always return a true or a false in a `while()` similar to JS/TS `while -> expression is true -> do`
 */

//fun main() {
//    var number = 0
//    while (conditionExpressionBody(number = number)) {
//        println(number)
//        // number++ = add
//        // number-- = subtract
//        // number -= 10 = remove 10 from `number`
//        number += 10
//    }
//}


//fun conditionBlockBody(number: Int): Boolean {
//    return number <= 10
//}

// Alternative version of a `while()` except `do(){}while(){}` means it will at minimum execute one time
// FUN CHALLENGE ALSO I WIN SIT EASY KID LMAOOOOO
fun main() {
    val myWord = "Hello World"
    var i = 0
    do {
        println(myWord[i])
        i++
    } while (i < myWord.length)
}


//fun conditionExpressionBody(number: Int) = number <= 100
