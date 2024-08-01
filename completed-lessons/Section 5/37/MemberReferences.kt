/*
    Lesson 37: Member References
        NOTES:
        - member ref = functions / props / constructors that replace trival lambdas
        - helps clean up your code
        - member refs uses double quote syntax
        - Member Reference = `Class::Member`
        - Function top-level Reference = `::function`
*/

fun main() {
    val people = listOf(
        Person("Alice", age = 44, male = false),
        Person("Bob", 31, male = true),
        Person("Carol", 32, male = false),
        Person("Max", 44, male = true),
    )

    // Print all males
//    people.filter { person -> person.male }.forEach { println(it.name) }
    // Print all females
//    people.filter { person -> !person.male }.forEach { println(it.name) }

    // using member reference we can print the same male list but cleaner
//    people.filter(Person::male).forEach { println(it.name) }

    // using member references we can print the same female list as well with a new method
//    people.filterNot(Person::male).forEach { println(it.name) }

    // Sorting ascending by the age of people in the list
//    people.sortedBy(Person::age).forEach { println(it.name) }

//    println("----")

    // Sorting by decending the same as above but downwards
//    people.sortedByDescending(Person::age).forEach { println(it.name) }

    // call a function of the class or a function extension
//    println(people.any(Person::important))
//
//    // top level syntax since its a top level function not on the class extension
//    println(people.any(::important2))

    // make an animal list
    val names = listOf("Dog", "Cat")
    // map the variables with an index number (similar to foreach) and grab the animal top level class
    // gets the constructor reference automatically
    println(names.mapIndexed(::Animal))
    println(names.mapIndexed { index, name -> Animal(id = index, name = name)})
}

fun Person.important() = this.name.startsWith(prefix = "M") && this.age > 20

fun important2(person: Person) = person.name.startsWith(prefix = "M") && person.age < 20

data class Person(
    val name: String,
    val age: Int,
    val male: Boolean
)

data class Animal(
    val id: Int,
    val name: String
)