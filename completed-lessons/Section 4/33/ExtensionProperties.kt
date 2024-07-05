/*
    Lesson 33: Extension Properties
        NOTES:
        - Requires a custom getter for extension properties
        - extension props are more preferred if simple
        - extension props should not be complex logic
*/

fun main() {
    val name = "Joey"
    println(name.longOrShort)

    println("Joey".quoted())

    val numbers = listOf(1,2,3,4,5)
    println(numbers.getFirstOrNull)

    val numbers2 = listOf<Int>()
    println(numbers2.getFirstOrNull)


    val listOfStrings = listOf("One", "Two")
    println(listOfStrings.getFirstOrNull)
}

// Declared extension property
val String.longOrShort: String
    get() = if(length > 10) "Long" else "Short"

// extension function
fun String.quoted() = "\"$this\""

// using generics of the class `List` we can make an extension property
// in this we are going to get the first element of the array/list and or print null

// Constructor
//   v
val <T> List<T>.getFirstOrNull: T?
    get() = if (this.isEmpty()) null else this[0]