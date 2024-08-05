/*
    Lesson 46: Inheritance
        NOTES:
        - inheritance: is a mechanism for creating a new class by reusing and modifying an existing class
        - similar to implementing an interface
        ` Class: Inherit`
        - Parent class for inherit must include `open <Class>`
        - Classes are not inheritable by default
        - Classes are `Any` by default and have `equals, toString, hashCode`
        - `final` keyword means you cannot inherit from that class anymore its done
        - `protected` cannot access outside the class and its subclasses
            for variables we must use an override to get to them in a func
            extension functions cannot access protected keywords
        - `private` cannot access outside the class itself
            extension functions cannot access private keyword
        - if we have a function on the Parent class then we can access the function across all inherited
        - if your function does not include the `open fun` keywords then you cannot override them

*/

fun main() {
    val dog = Dog(dogName = "Rex")
    val lion = Lion(lionName = "Max")
//    dog.eat()
//    dog.printEnergy()
//
//    lion.eat()
//    lion.printEnergy()
}

//open class Parent
//class Child: Parent()


open class Animal(val name: String) {

    // ON construction print a message
    init {
        println("Animal is initializing")
    }

    // if we add `open` we can see this in our inherited classes
    open var color = "Black"

    // We cannot see this in our inherited classes
    protected var energy = 0

    fun printEnergy() {
        println("Current $name energy: $energy")
    }

    open fun eat() {
        energy += 1
    }

    open fun run() {
        energy -= 1
    }
}

// We inherit an Animal and override its eat and run functions with our own values
class Dog(dogName: String): Animal(name = dogName) {

    init {
        println("Dog is initializing")
    }

    override fun eat() {
        energy += 5
    }

    override fun run() {
        energy -= 5
    }
}

// Double inherit
open class Cat(catName: String): Animal(name = catName) {

    init {
        println("Cat is initializing")
    }

    open var claws = "Sharp"

    override fun eat() {
        energy += 5
    }

    override fun run() {
        energy -= 5
    }
}

// overriding the energy same as Dog
class Lion(lionName: String): Cat(catName = lionName) {

    init {
        println("Lion is initializing")
    }

    override fun eat() {
        energy += 10
    }

    override fun run() {
        energy -= 10
    }
}

// Extension function added to the Animal Parent inherit class
fun Animal.updateColor(color: String) {
    this.color = color
}