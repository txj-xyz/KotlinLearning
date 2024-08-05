/*
    Lesson 47: Abstract Classes
        NOTES:
        - definition: One or more functions / prop need to be marked as `abstract` keyword
        - the class must be marked as abstract if a property or function
        - abstract classes are always `open` keyword
        - abstract functions only need the return type
        - interface cannot contain a state while a class abstract can
        - abstract can contain functions with implementations
        - class can implement more than one interface, but it cannot implement more than one abstract class
        - an interface cannot contain a property with a state
        - both interface and abstract classes can contain functions with implementations
        - only abstract classes can contain props with states
                                      interfaces cannot ^^^
        - we do not need to mark an `abstract class` as `open` because that is the default
        - we CAN implement a function inside an interface
*/

fun main() {

}

// abstract class with normal function inside of it that we allow people to inherit with `open`
abstract class Animal {
    abstract val name: String

    // We use this on our inherit
    protected var energy = 0
//    fun speak() = "Woof"

    // Implements a return type on the function of `speak()` explicitly and only
//    abstract fun speak(): String

    // This is a default of `Unit` or undefined/void
    abstract fun eat()

    // Allow the function to be inherited
    open fun speak() = "Woof"

}

class Dog() : Animal() {
    // Specify the implementation
    override val name = "Rex"

    override fun speak() = "Woof, Woof!"

    override fun eat() { energy += 1 }
}

// we are going
abstract class PersonA(private val name: String) {
    open fun printName() { println(name) }
}

// function implementation of the interface
interface PersonB {
    fun printName(name: String) { println(name) }
}

class Male: PersonA(name = "Joey"), PersonB {
    // we do not need to overwrite since we have implemented it

    override fun printName() {
        // we can only inherit one abstract class function otherwise we need to specify
        // but we can implement multiple interfaces we need to tell our super<> which type
        super<PersonA>.printName()
    }

    override fun printName(name: String) {

        super<PersonB>.printName(name)
    }
}