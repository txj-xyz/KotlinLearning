/*
    Lesson 21: Sets
        NOTES:
        - Unordered collection of elements
        - Does not support duplicate elements
        - <Set>.contains() = Check if the set contains a number or something specific and print `true`
        - <Set>.containsAll(<Set>) = will check if all set elements match and if they do print `true`
        - 2 in mySet = check if the set contains 2 at all and print `true` if so.
        - `infix <Set>` keyword = call without using dotnotation and remove the listed items from the set that listed
        - `intersect <Set>` keyword = only keep the items listed in the `Set`
        - `union <Set>` keyword = Append items missing from the provided `Set` if existing then skip
        - <List>.toSet() = remove duplicates and convert to a Set
        - <List>.distinct() = only show unique items from the List (functions like a Set)
        - <Set>.toList() = convert the set into a list (bidirectional)
 */

fun main() {
    val mySet = setOf(1,2,2,3,3,4,6,4) // Duplicates will not be printed
    val mySet2 = mutableSetOf(1,2,2,3,3,4,6) // Mutable set
//    println(mySet)
//    println(mySet.contains(element = 2))
//    println(2 in mySet)
//    println(mySet.containsAll(elements = setOf(1,3,6)))
//    println(mySet subtract setOf(6,11))
//    println(mySet intersect setOf(6,11))
//    println(mySet union setOf(6,11))
    val myList = listOf(1,2,2,3,3,4,6,4) // Duplicates will not be printed
    mySet.toList()
    println(myList)
    println(myList.toSet())
    println(myList.distinct())
}