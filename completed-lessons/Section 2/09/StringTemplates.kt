/*
    Lesson 9
    String templates and Triple-quitted strings
        NOTES: Works the same way as TS/JS except without methods its just "$val"
 */

fun main(){
//    val number = 10
//    val favoriteNumber = "My favorite number is: ${number.toFloat()}" // 10.0 for float
    val about = """This is some really long sample text 
        |and its the same as a heredoc 
        |for BASH with just the >>> thingy the '|' char is for declaring a margin itself in these, 
        |that's the only difference """.trimMargin()
// String.trimMargin(marginPrefix = "#") # this is to redeclare the margin separator, similar to split
    println(about)
//    println(favoriteNumber)
}

//fun setAge(age: Int) {
//    println("${if (age < 18) "Minor" else "Adult"}")
//}