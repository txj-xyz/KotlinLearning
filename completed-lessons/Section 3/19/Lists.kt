import kotlin.random.Random

/*
    Lesson 19: Lists
        NOTES:
        - Ordered collection of items
        - Lists = Store multiple values of different datatypes
        - listOf<Type>()
        - lists are 0 indexed via [] operations
        - <List>.first() = first index
        - <List>.last() = last index
        - <List>.take(n = 3) = grab 3 numbers starting at 0 index
        - <MutableListOf>.toList() = convert a mutable list into an immutable list
        - <MutableListOf>.set(index = 0, element = 10) // change an index to a new number
        - a `List` cannot be treated as a mutable list unless you change its type later
        - listOf() is immutable if you append with += it makes a new list
            - Prefer to use `val` with these since they are not changing
        - mutableListOf() = mutable list even if using += operator will not make a new one
            - Prefer to use `var` since we are changing the list data
 */


fun main() {
    var myList = listOf(1,2,3) // Immutable list
    println(myList)
    myList += 4 // Instead of adding to the exiting list, this is making a new one
    println(myList)

    var myList3 = mutableListOf(1,2,3,4)
    val myList4 = myList3.toList()
    println(myList4)
    // Immutable list since `val`
//    val numbers = listOf(1, 2, 3, 4, 5)
//    val numbers2 = mutableListOf<Int>()
//
//    numbers2.addAll(listOf(1,2,3,4,5))
//    numbers2 += 6 // puzzle append operator
//    numbers2.add(element = 7) // add a single element to the list
//    numbers2.remove(element = 7)
//    println(numbers2)
//    numbers2.add(index = 0, element = 11)
//    println("Changed index 0 to 11: $numbers2")
//
//    val myNewList = createList()
//    println(myNewList)
//
//    println(numbers)
//    println(numbers[0])
//    println(numbers.first())
//    println(numbers.last())
//    println(numbers.take(n = 3))
//    println(countOccurrences(list = numbers, number = 2))
}

// Create a new list of random numbers 0-100
fun createList(): List<Int> {
    val numbers = mutableListOf<Int>()
    for(number in 0 until 10) {
        numbers.add(element = Random.nextInt(from = 1, until = 100))
    }
    return numbers
}

// Count the number of occurrences inside an Int list from some variables
fun countOccurrences(list: List<Int>, number: Int): Int {
    var occurrences = 0
    for (e in list) {
        if(number == e) {
            occurrences++
        }
    }
    return occurrences
}