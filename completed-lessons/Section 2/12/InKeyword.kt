/*
    Lesson 12: In Keyword
    NOTES:
        in = can be used `for(var `in` array){}`
        !in = opposite of in usage, so we can negative search
 */

fun main() {
//    val number = 40
//    println(number in 0..100)
//    println('t' in "Kotlin") // true
//    println('t' in "KoTlin") // false because its a different Char
    println(isDigit(ch = '0')) // true = yes its 0-9
    println(isDigit(ch = 'a')) // false = not a digit
    println(isNotDigit(ch = 'a')) // true = this is not a digit because its a letter byte
    println(isNotDigit(ch = '0')) // false = this is a digit so we return false because its the opposite
    println(isLowerCase(ch = 'a')) // this is a lower case so this is `true`
    println(isUpperCase(ch = 'A')) // this is an Upper case so this is also `true`
}


fun isDigit(ch: Char) = ch in '0'..'9' // '0' = Char
fun isNotDigit(ch: Char) = ch !in '0'..'9'
fun isLowerCase(ch: Char) = ch in 'a'..'z' // checking to see if we have lower case letters a-z
fun isUpperCase(ch: Char) = ch in 'A'..'Z' // checking to see if we have upper case letters A-Z
