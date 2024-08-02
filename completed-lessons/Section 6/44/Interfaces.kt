/*
    Lesson 44: Interfaces
        NOTES:
        - Describes how an object is formed similar to types
        - Describes what a class should do, but not how it should do it
        - generally not an implementation
        - can contain props or functions
        - abstract = declaration without implementation / body
        - Cannot contain a constructor
        - <interface Name>
        - When implementing an interface you must use the `override` keyword
        - `super` is the interface method or function
        - SAM = single abstract method
        - `fun interface` means we can only use SAM or a single function method or additional implementations
        - in a `fun interface` we can implement multiple functions but they must contain implementations
        - interface cannot hold a state until initialized
        - we do NOT need to override a function that contains the body inside an interface
        - you cannot implement a property inside an interface
        - names are unanimous as well
*/

fun main() {
    val dog = Dog("Red") // constructor based implementation override
    val cat = Cat() // body based override


    val male = Male()
    male.eyeColor()
    val male2 = Person { "red" }
}

// Class implementing Person interface with an override to the eyecolor (must respect the type)
class Male: Person {
    override fun eyeColor() = "Black"
}

// SAM or single abstract method implementation
fun interface Person {
    fun eyeColor(): String
    // must implement the function if we are in a SAM
    fun hairColor(): String = "Brown"
}


// constructor based override when dog is created
class Dog(override val color: String) : Animal {
    override val legs = 4
    override fun speak() = "Woof!"
}

class Cat: Animal {
    override val legs = 4
    override fun speak() = "Meow!"

    // Implements the walk function without an override of the original implement
//    override fun walk(): Int {
//        return super.walk()
//    }

    // Body based override instead of a constructor
    override val color: String = "Green"
}


interface Animal {
   val legs: Int
   val color: String
   // Implementation method
//   val color: String get() = "Black"

   fun speak(): String

   fun walk(): Int {
       var steps: Int = 0
       for (step in 0 .. 20 step 2) {
           steps += step
       }
       return steps
   }
}