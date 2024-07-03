/*
    Lesson 28: Data Classes
        NOTES:
        - Primary goal of a data class is to hold data (lol?)
        - `data class` = behind the scenes
        - Primary constructor of a `data class` needs to have at least one param
        - must have `val` in the constructor
        - `<data Class>.copy(param = new)` = copy the data class and modify age
        -
*/

fun main() {

    // This code will return true because the property constructor is not including `age` so they are the same
//    val person = Person(name = "Joey")
//    val person2 = Person(name = "Joey")
//    person.age = 20
//    person2.age = 30
//    println(person.equals(person2))
    val person = Person(name = "Joey", age = 29)

    // print out each of the params in the function using `component()` bytecode function
    val (name, age) = person
    println(name)
    println(age)

}

data class Person(
    val name: String,
    val age: Int
)

//data class Person(
//    val name: String,
//) {
//    var age: Int = 0
//}