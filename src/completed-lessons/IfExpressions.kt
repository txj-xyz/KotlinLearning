/*
    Lesson 8
    If Expressions
    NOTES:
        || = OR
        && = AND
        if supports inline operations
        return if = lift out return statement of all redundant returns
 */

fun main() {
//    ageRestriction(age = 18)
    val result = checkNumberSign(number = -1)
    println(result)
}

fun ageRestriction(age: Int) {
    if (age < 18) println("Access Denied!")
    if (age >= 18) println("Access Approved!")
//    if (age > 18 || age == 18) println("Access Approved!")
//    if (age < 18) {
//        println("Access Denied!")
//    }
//    if (age > 18) {
//        println("Access Approved!")
//    }
}

fun checkNumberSign(number: Int): String {
    // remove the need to redundant return by lifting the `return` out of all the blocks
    return if(number > 0) {
        "positive"
    } else if (number < 0) {
        "negative"
    } else {
        "zero"
    }
}