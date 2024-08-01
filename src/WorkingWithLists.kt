/*
    Lesson 39: Working with Lists
        NOTES:
        - will return a list of <Pair> built from the elements of` this` and the param is the data inside
*/

fun main() {
//    val first = listOf("a", "b", "c", "d")
//    val second = listOf(1,2,3,4)

//    println(first.zip(second))
//    println(first.zip(0..10))
//    println((10..100).zip(second))
    val ids = listOf(10, 11, 12)
    val names = listOf("Bob", "Jill", "Jim")
    val result = ids.zip(names) { id, name ->
        Person(id = id, name = name)
    }
    println(result)
}

data class Person(
    val id: Int,
    val name: String
)