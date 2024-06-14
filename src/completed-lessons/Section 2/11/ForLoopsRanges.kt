/*
    Lesson 11 For Loops and Ranges
        NOTES:
            downTo = same as `..` downwards
            step = skip or provide iteration step numbers
            1..3 = 1 to 3
            listOf() = form an array of a type or inferred
            'a'..'z' = print all letters inbetween a-z and step through each one
 */

//fun main() {
//    val elements = listOf("My", "Variable", "List")
//    for (i in elements) {
//        println("Current element: $i")
//    }
//}

//fun main() {
//    val elements = listOf("My", "Variable", "List")
//    for (number in 1..3) {
//        println("Current number: $number")
//    }
//}

// until operator

//fun main() {
//    val range1 = 1..10
//    val range2 = 0 until 10 // `until` will only print up to the number you specify on the right side -1
//    println(range1)
//    println(range2)
//
//}

//fun main() {
//    showRange(range = 1..3) // print 1 2 3, only 1 iteration step in the numbers
//    showRange(range = 3 downTo 1) // print 3 2 1, only 1 iteration step in the numbers
//    showRange(range = 0..10 step 2) // print ever 2 numbers (step twice instead of once) // prints, 0 2 4 6 8 10
//    showRange(range = 9 downTo 0 step 3) // Step down each iteration 3 times, down to number 0 // prints, 9, 6, 3, 0
//}
//// IntProgression is the same as `until`
//fun showRange(range: IntProgression) {
//    for(number in range) {
//        print("Current number: $number ")
//    }
//    print(" // $range")
//    println()
//}

//fun main() {
//    for (letter in 'a'..'z'){
//        printn("Current letter: $letter")
//    }
//}

//fun main() {
//    val character: Char = 'a'
//    println(character + 25) // prints the 26th letter since a = 0 in a `Char`
//}

//fun main() {
//    for(character in "Jnskhm ") { // All of these letters are the letters before the word `Kotlin`
//        print(character + 1) // If we want to increase each letter + 1 to get the next `Char` then we Spell the word
//                             // out of `Jnskhm` and adding 1 to each is `Kotlin`
//    }
//}

fun main() {
    repeat(times = 3) { // Repeat this block 3 times
        println("Kotlin is the best")
    }
}