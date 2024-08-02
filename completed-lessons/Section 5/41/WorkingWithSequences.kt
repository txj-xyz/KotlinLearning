/*
    Lesson 41: Working with Sequences
        NOTES:
        - you can only iterate over a sequence, but not index them
        - also known as a Stream() in other langs
        - eager is all elements evaluates
        - lazy evaluation is faster and vertical
        - a sequence will stop its iteration when it returns a match, such as a true statement
        - Lazy evaluation assumes that each item is computed on demand rather than up front on all elements
*/

fun main() {
    val list = listOf(1,2,3,4)
    println("--- list ---")
//    list.filter { it % 2 == 0 }.map { it * it }.any { it < 10 }

    // checks each element every time which is inefficient
    list
        .filter(Int::isEven)
        .map(Int::square)
        .any(Int::lessThanTen)

    println("---sequence---")
    list
        .asSequence()
        .filter(Int::isEven)
        .map(Int::square)
        .any(Int::lessThanTen)
    println()

}

fun Int.isEven(): Boolean {
    println("isEven()")
    return this % 2 == 0
}

fun Int.square(): Int {
    println("square()")
    return this * this
}

fun Int.lessThanTen(): Boolean {
    println("lessThanTen()")
    return this < 10
}