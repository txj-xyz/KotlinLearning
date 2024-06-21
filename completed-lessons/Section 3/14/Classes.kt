/*
    Lesson 14 Classes
        NOTES:
        - Object blueprints such as a Car and its details to make multiple
        - Must begin with a Letter uppercase
        - followed by a constructor keyword optionally for types
        - Blank classes reports `Class@memoryaddress`
        - Functions inside a class are `member functions`
        - Initialized class with a variable is an Object
 */

fun main() {
    val house = House() // object of a House class
    val house2 = House()
    println(house)
    println(house.enterTheHouse())
    println(house2)
}

class House {
    fun enterTheHouse() = "Entering the house..."
}