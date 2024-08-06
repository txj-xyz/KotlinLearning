
/*
    Lesson 51: Sealed Classes
        NOTES:
        - (def) Sealed Classes represent a restricted class hierarchy all direct subclasses are known at compile time.
        - for every class we inherit on our sealed class then we need to add our checks for them because our compiler
            knows how many of them we are using, if checking them then this takes time off logic for if checking
            across multiple files
        - we cannot create an instance out of them, so we cannot implement abstract values in our sealed class
        - Abstract values are types but no implementations, to show the full logic in a type based form
        - sealed classes are meant to be inherited, not instantiated, so this means we can only inherit them
*/

fun main() {
    // You cannot instantiate this sealed class, because its meant to be inherited by another class
//    val myCar = Vehicle()
}

// with this the compiler knows we have an XYZ amount of child classes, instead of an unknown length
sealed class Vehicle


data class Car(
    val manufacturer: String,
    val model: String
): Vehicle()


data class Bicycle(
    val manufacturer: String
): Vehicle()

data class ATV(
    val manufacturer: String
): Vehicle()

fun getVehicle(vehicle: Vehicle) =
    when(vehicle) {
        is Car -> "${vehicle.manufacturer} - ${vehicle.model}"
        is Bicycle -> vehicle.manufacturer
        is ATV -> vehicle.manufacturer
        // Not needed with a sealed class
//        else -> "Unknown Vehicle!"
    }


sealed class Animal {
    abstract val isMale: Boolean
    val legs: Int = 4
    abstract fun speak(): String
    fun eat() = "Eating!"
}