/*
    Lesson 36: Collection Operations
        NOTES:
        - Interact with collections in different ways
        - `MutableList/List(size = 10) { it }` = initialize a list of 10 numbers
        - <List>.drop()
*/

fun main() {
    // listOf = Immutable
    // mutableListOf = Mutable

    // Instantly create a list or mutable list
//    val list1 = List(size = 10) { it }
//    val list2 = MutableList(size = 10) { it }
//    println(list1)
//    println(list2)

    // iterate over the numbers starting after 5
    val numbersList = listOf(1,2,3,4,5,6,7,8,9,10)
//    println(numbersList.filter { number -> number > 5 })
//
//    // print only the matching predicate with access to the index
//    println(numbersList.filterIndexed { index, number ->
//        index == 0 // only print index 0
//    })
//
//    // print anything that doesn't match the predicate
//    println(numbersList.filterNot { number -> number == 1 })
//
//    // print anything that is not null with a filter
//    val numbersList2 = listOf(1, null, null ,4,5,6,7,8)
//    println(numbersList2.filterNotNull())
//
//    val numbersList3 = listOf(1,2,3,4,4,4,4,4,5,6,7,8,9,10)
//    // count how many times the number 4 is found in our list
//    println(numbersList3.count { number -> number == 4 })

    // locate the first matching element to the predicate
//    println(numbersList.find { number -> number == 5 })
//
//
//    println(numbersList.firstOrNull())
//    println(numbersList.lastOrNull())
//
//    println(numbersList.any { number ->
//        number == 1
//    })
//
//    println(numbersList.all { number ->
//        number > 11
//    })
//    // prints true if nothing in the number list is greater than 0
//    println(numbersList.none { number ->
//        number > 0
//    })

    // <List>.partition will split the list up into a <Pair> (two lists) based on the predicate if true for the first
    // the second variable is the results that are `false` on the predicate
//    val (match, noMatch) = numbersList.partition { number ->
//        number < 6 //number less than 6
//    }

//    println(match)
//    println(noMatch)

    // number sorting and operation methods
//    val randomNumbers = listOf(2,3,1,5,6,8,5,2,1,9,10)
//    println("sum: ${randomNumbers.sum()}")
//    println(randomNumbers.sorted())
//    println(randomNumbers.sortedDescending())


    // Create a list of Person<> with names and ages and we can use them in a List type
//    val personList = listOf(
//        Person(name = "Alice", age = 23),
//        Person(name = "Bob", age = 11),
//        Person(name = "Carol", age = 42),
//    )
    // sum up the person.age property in our list wiht our iterator
//    println(personList.sumOf { person ->
//        person.age
//    })
//
//    println(personList.sortedBy { person -> person.age })

    // grab the index number on the list
    println(numbersList.get(index = 5))

    // take the last n amount of numbers from a list
    println(numbersList.takeLast(n = 4))

    // REMOVE the first 4 elements out of this list and return them out in a new one
    println(numbersList.take(n = 3))

    // drop out the first 5 values and return the rest of them in a new list
    println(numbersList.drop(n = 4))

}

data class Person(
    val name: String,
    val age: Int
)