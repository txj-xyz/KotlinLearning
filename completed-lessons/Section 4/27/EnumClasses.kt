/*
    Lesson 27: Enum classes
        NOTES:
        - `enum` = collection of names
        - Hold fixed values to represent some kind of state
        - can have properties / interfaces
        - `enum class Priority{ value1, value2, value3 }` proper way of declaring a class
        - can have a constructor
        - represents a 0,1,2,3 values
        - `value1()` = constructor of the enum allows to set variable meanings
        - enum property constructors are case-sensitive
        - enum class = special type
        - `<enum class>.valueOf(value = "ENUM")` = print the requested string value of an enum, returns the `enum` type
 */

fun main() {
    val priority = Priority.LOW
//    println(priority)
//    println(priority.color)

//    val priority2 = Priority.valueOf(value = "LOW")
//    println(priority2)
//    for(pri in Priority.values()) {
//        println(pri.color)
//    }
    println(priority.number)
}

//enum class Priority {
//    LOW, MEDIUM, HIGH
//}

// dynamic enum with a number accessor that will get the enum and assign a number to each
enum class Priority(val color: String) {
    LOW(color = "Green"),
    MEDIUM(color = "Orange"),
    HIGH(color = "Red");

    val number: Int
        get() = when(this) {
            LOW -> 1
            MEDIUM -> 2
            HIGH -> 3
        }
}
