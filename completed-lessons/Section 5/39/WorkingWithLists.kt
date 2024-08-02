/*
    Lesson 39: Working with Lists
        NOTES:
        - will return a list of <Pair> built from the elements of `this` and the param is the data inside
        - <List>.zip(<List2>) = will zip the two lists into a single <List>
            This also accepts a lambda as a param like `<List>.zip(<List2>) { index, value -> DataClass(index, value) }
*/

fun main() {
//    val first = listOf("a", "b", "c", "d")
//    val second = listOf(1,2,3,4)

//    println(first.zip(second))
//    println(first.zip(0..10))
//    println((10..100).zip(second))

    // Create a list of combined values with a transformer lambda
//    val ids = listOf(10, 11, 12)
//    val names = listOf("Bob", "Jill", "Jim")
//    val result = ids.zip(names) { id, name ->
//        Person(id = id, name = name)
//    }
//    println(result)

    // This creates a new map `{1=One, 2=Two, 3=Three, 4=Four}` and sets up a flatten to list
    // converts the number Map<> into a list with a method
    val numbersMap = mapOf(1 to "One", 2 to "Two", 3 to "Three", 4 to "Four")
//    println(numbersMap)
//    println(numbersMap.toList())

    // returns a pair of lists
    val (numbers, text) = numbersMap.toList().unzip()
//    val (numbers, text) = numbersMap.toList().unzip()
//    println(numbers)
//    println(text)

    // nested `<List>` that will un-flatten if we call `<List<List>>.flatten()` on it
    val list = listOf(
        listOf(1,2),
        listOf(4,5),
        listOf(6,7),
    )
    println(list)
    // returns a single list of all lists from a given collection
    println(list.flatten())
}

data class Person(
    val id: Int,
    val name: String
)