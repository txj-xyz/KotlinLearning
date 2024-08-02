/*
    Lesson 42: Local Functions
        NOTES:
        - Locally scoped
        - Same as regular functions
        - Defined within other functions only
        - local functions are considered closures, they can access anything in the surr
*/

fun main() {
//    start()
//    addQuotes()

    val list = listOf(1,2,3,4,5)

    // Create a lambda label for the function itself
    list.forEach customName@{
        // return only the foreach loop with `return@functionname`
        if(it == 3) { return@customName }
        println("Loop $it")
    }
    println("Completed")
}

// Add quotes to a string
fun addQuotes() {
    fun String.quoted(): String = "\"$this\""
    println("TXJ is cool".quoted())
}

// build out a string message and print the builder out
fun start() {
    val builder = StringBuilder()
    fun log(message: String) = builder.appendLine(message)
    log("Status.. OK")
    log("Wings.. OK")
    log("Engine.. Starting....")
    println(builder)
}