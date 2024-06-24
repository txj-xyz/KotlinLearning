/*
    Lesson 15: Class Properties
        NOTES:
        - Properties maintain a state in a Class
        - Each object has its own storage for properties (memory)
        - Properties inside of a class are `var` or `val`
 */

fun main() {
//    val person1 = Person()
//    println(person1.personAge) // default of 0
//    person1.setAge(age = 14) // now we are changing the class variable of `personAge`
//    println(person1.personAge) // now updated to 14
//
//    // Separate object storage
//    val person2 = Person()
//    println(person2.personAge) // default of 0
//    person2.setAge(age = 24) // now we are changing the class variable of `personAge`
//    println(person2.personAge) // now updated to 24

    // Here we are pointing `person2` is the same person1 since we are pointing person2 to the first init
    val person1 = Person()
    val person2 = person1
    println(person1.personAge)
    println(person2.personAge)
    person1.setAge(age = 30)
    println(person1.personAge)
    println(person2.personAge)
    println(person1)
    println(person2)
}

class Person {
    var personAge = 0

    fun setAge(age: Int) {
        personAge = age
    }
}