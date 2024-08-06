import objectImport.increment2

/*
    Lesson 54: Object
        NOTES:
        - (def): Object keyword defines something that looks similar to a class
        - cannot create an instance of an `object` because there is only one
        - represents a `singleton`
        - singleton = allowed to only have a single of that object
        - Once we define an `object Name` its instantiated
        - Defines structure + instantiates at the same time
        - Constructors are not allowed on `object`
        - Shared between all code in our project once created. (see ObjectImport)
        - `private object` does not expose the object to all your project code
        - We can inherit on objects
        - Objects cannot be placed inside functions, but they can be nested inside other objects or classes
            as long as the classes are not nested
        - a single instance of an object is called a `Singleton`
        - we cannot specify a parameter list because the object keyword is instantiated on the spot
        - you cannot make an `object Name` inside a function because they are global scope / package scope
*/

fun main() {
//    Singleton.printName()
    increment()
    increment2() // this is our package being imported accessing the object Counter below
    println(Counter.currentCount())
    // use the overridden function we have specified
    John.getToWork()
    Person(name = "Johnny").printName()
}

open class Person(private val name: String) {
    open fun printName() {
        println("My name is $name")
    }
}

// Layout for the John class with an available function to implement
interface Worker {
    fun getToWork()
}

// John object is inheriting the data of Person, where we have written out its functionality
// this means we can access this data anywhere and we have specifies that we also want to follow `Worker` interface
// implementation
object John: Person(name = "Joey"), Worker {
    override fun printName() { println("I am worker $this") }
    override fun getToWork() {
        println("I am now getting to work")
    }
}

// when we define this its initialized by default
object Singleton {
    fun printName() {
        println("Hi, my name is Joey. :)")
    }
}

object Counter {
    private var count = 0
    fun currentCount() = count
    // `++var` is increment in KT
    fun increment() { ++count }
}

fun increment() {
    Counter.increment()
}


// Nested object example since we can have two objects nesting
object OuterObject {
    object NestedObject {
        val name: String = this.toString()
    }
}

class OuterClass {
    object NestedObject {
        // Other ref to another object and its same name of nested object and its value
        fun printName() { println(OuterObject.NestedObject.name) }
    }
}

// ----

// You cannot make an object inside a function because it is instantiated globally
//fun myTestFunction() {
//    object Testing
//}