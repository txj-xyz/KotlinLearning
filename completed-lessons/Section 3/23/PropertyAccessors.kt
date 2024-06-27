/*
    Lesson 23: Property Accessors
        NOTES:
        - property accessors = getters and setters
        - Similar to fields in java
        - get() and set() = field operator with indent
        - `++var` = start from 1 and add 1
        - `var++` = start form 0 and add 1
        - `field` keyword means the getter/setter equals the above variable
        - `value` inside `set(value)` means the value we are trying to set on the `field`
        - `get() = age < 18` = boolean check returns true/false
        - `private set` = only change inside the class
        - `var age = 0`
                `private set` = set the property above only inside of the class
 */

fun main() {
    val person = Person()
    println(person.age)
//    println(person.age = 1)
    person.addAge(newAge = 10)
    println(person.age)
//    println(person.isMinor)
}

// Private setter property only inside the class
class Person {
    var age = 0
        private set

    fun addAge(newAge: Int) {
        age = newAge
    }
}


//class Person(val age: Int) {
//    val isMinor
//        get() = age < 18
//}

//class Person {
//    // this is redundant since its native
//    var age = 0
//        get() = field
//}

//class Person {
//    private var accesses = 0
//    val age: Int
//        get() = ++accesses
//}

//class Person {
//
//    // Getters and setters for age
//    var age = 0
//        get() {
//            return field
//        }
//        set(value) {
//            field = value
//        }
//}