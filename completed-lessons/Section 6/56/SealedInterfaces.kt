
import util.parseVehicle
import util.CarType

/*
    Lesson 56: Sealed Interfaces
        NOTES:
        - (def) restricts which classes or interfaces can implement it by allowing only implementations defined
            in the package or file
        - Provides type safety
        - Prevent external classes implementing them
        - Prevent subclasses that violate the design of the interface
        - `data object` = replaces `object` keyword and adds, `toString()` for readability
        - We can use these to prevent implementation outside the file or package we are importing
        - It's NOT a benefit of using `sealed interface` because we still can have a lot of subclasses
        - you CANNOT extend a sealed interface, this is not allowed because it's sealed, and we are outside the file
            it was declared in, meaning we can only do that inside the package itself
        - YOU CAN EXTEND A `sealed interface` IN A DIFFERENT FILE AS LONG AS ITS IN THE SAME PACKAGE

*/

// We are attempting to extend a sealed class outside the `util` package / file
//interface Network: NetworkStatus

// IF THE TOP OF THE FILE CONTAINS THE PACKAGE `NetworkStatus` IS LOCATED IN THEN WE CAN EXTEND THIS
//interface ChadStatus: NetworkStatus {
//    fun getStatus() { println("ChadStatus is enabled.") }
//}

fun main() {
    parseVehicle(vehicle = CarType.AUDI)
}