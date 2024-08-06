/*
    Lesson 52: Nested Classes
        NOTES:
        - Nested classes is a simple class in the namespace of the outer class
        - the outer class owns the nested class
        - we cannot downcast to a private class in a nest
        - enum classes cannot be nested within functions, cannot inherit from other classes as well
        - enum classes cannot inherit classes
        - Referenced by the following `OuterClass.NestedClass()`
        - Local classes are classes that are defined within a function
            They are not reachable outside of the function
        - Local enum classes are not allowed, this is an `enum class` inside a function, as nesting is not allowed
            we cannot do this
*/

// We can import our nested class as `Plane` as well and get access to it once we instantiate `Airport`
//import Airport.Plane


fun main() {
    val airport = Airport(code = "ENG")
//    val plane = Airport.Plane() // out nested class access is here
//    val plane = Plane()
//    plane.contact(airport = airport) // we can access our nested class here and print what we passed to the parent


//    val result = airport.privatePlane2()
//    result

//    val result = myFunction()
//    result.programmer

    // Implement an enum class
    val myTicket = Ticket(name = "Joey", seat = Ticket.Seat.Premium)
    myTicket.printSeat()
    myTicket.upgrade()
    myTicket.printSeat()


}

// Outer class (object model)
class Airport(private val code: String) {
    private val myPlane = 123

    // Nested class owned by the Airport class (parent/outer)
    open class Plane {
        fun contact(airport: Airport) {
            println(airport.code)
        }
    }

    // We cannot call this class outside `Airport` class itself
    private class PrivatePlane: Plane() {
        fun secretCode() {
            println("Secret Code!")
        }
        fun printPrivatePlane() {
            // We cannot access the in-class `myPlane` variable because its a private marked value
//            println("My private plane number is: ${Airport.myPlane}")
        }
    }


    fun privatePlane(): Plane = PrivatePlane()
    // Only reachable inside the parent class
    private fun privatePlane2(privatePlane: PrivatePlane) {
        privatePlane.secretCode()
    }

    // This is exposing a private in-class type, so we need to specify our open type instead of `Plane()`
//     fun privatePlane(): PrivatePlane = PrivatePlane()


    // Access to Plane() is inside of the nested class without an `import Airport.Plane` since we are inside here.
//    class Example {
//        val airport = Airport("ENG2")
//        val plane = Plane()
//    }
}

// This implements a "local class" that can only be seen within the function
fun myFunction() {
    open class Programmer
    class Kotlin: Programmer()
    val programmer: Programmer = Kotlin()
}

interface Person {
    val height: Height
    data class Height(val cm: Int)
}

class John(height: Int): Person {
    // Using an override for the interface class
    override val height = Person.Height(cm = height)
}


class Ticket(
    private val name: String,
    private var seat: Seat
) {
    enum class Seat {
        Eco,
        Premium,
        Business,
        First
    }
    fun upgrade() {
        // seat.ordinal = the index position of the enum for the seat values
        seat = Seat.values()[seat.ordinal + 1]
    }
    fun printSeat() {
        println("Hi $name! Your current seat is: $seat")
    }
}

// Enum classes cannot inherit classes
//open class Example0
//enum class Example: Example0()