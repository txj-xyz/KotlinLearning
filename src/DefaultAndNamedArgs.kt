/*
    Lesson 7
    Default and Named Arguments
    NOTES:

 */

fun main() {
    // You can change the order of arguments
    // Generally good practice
    val result = sumOf2Numbers(b = 3)
    println(result)
}

// Default values for arguments
//fun sumOf2Numbers2(a: Int = 10, b: Int) = a + b
fun sumOf2Numbers(a: Int = 10, b: Int) = a + b
