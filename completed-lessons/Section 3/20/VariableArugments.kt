/*
    Lesson 20: Varargs
        Notes:
        - End of params in function
        - Only one param in a function
        - This is essentially allowing only 1 argument that is a `number`
        - `vararg` turns into an Array = mutable
        - `intArrayOf()` = Array of <Int> types
        - `arrayOf() = special low level support, compatibility with Java
        - `List` when needing simple sequences
        - val arrayList = intArrayOf(1,2,3); `*arrayList` is the spread operator
 */

fun main() {
    val myArray = intArrayOf(6, 8, 10) // Type: IntArray
    println(sum(1, 3, 5, 3)) // sum all numbers = 12
    println(sum(numbers = intArrayOf(1, 3, 5, 3, *myArray)))
}

//
fun sum(vararg numbers: Int): Int {
    var total = 0
    for (n in numbers) {
        total += n // add to `totals` forever in our array
    }
    return total
}