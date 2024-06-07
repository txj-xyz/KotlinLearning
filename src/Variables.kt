/*
    Lesson 4
    Variables
 */

// var = editable / mutable

// val = immutable / non-editable
// val = const in JS/TS
// val = easier to extend in other programs / classes use whenever possible

fun main() {
//    var first = 1
//    first = 2
//    val second = 2

    // This falls under standard synchronous code rules
    var a = 10
    a = 20
    val b = a
    println(a)
    println(b)
}