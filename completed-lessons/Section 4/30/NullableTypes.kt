/*
    Lesson 30: Nullable Types
        NOTES:
        - Java by default is nullable types
        - `val kotlin: String? = "test"` = `null | String` type
        - Java would produce a nullpointerexception
        -
*/

fun main() {
    val map = mapOf(1 to "One")
    val result = map[2] // typeof `String?`
    println(result)

    val regularString = "abc"
//    val text: String = null

    val nullableString: String? = "test possible null"
//    val text2: String? = regularString
//    val text3: String = text2 // not allowed because `text2` is nullable String
    println(nullableString)

    if(nullableString != null) {
        println(nullableString.length)
    }
    val person = Person(age = 29, name = "Joey")
    val nullablePerson: Person? = null
}


data class Person(
    val age: Int,
    val name: String
)