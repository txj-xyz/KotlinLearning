/*
    Lesson 32: Generics
        NOTES:
        - Generics make things reusable or "generic"
        - `Any` type = just like JS/TS, will now show values or anything at all and will allow generic operations
        - `fun <T> getName(name: T): T = name` generic function that returns the value of the function
        constructor, this also allows the type to be passed via the `name` param
*/

fun main() {
//    val car = Car(tires = Tires(size = 17))
//    val car2 = Car(tires = 17)
//    val car3 = Car(tires = "17")
//    println(car.getValues())
//    println(car2.getValues())
//    println(car3.getValues())
    val vehicle = Vehicle(value = Car())
    val car = vehicle.getValue()
    println(car.start())

    getName(name = "Joey")
    getName(name = Vehicle(value = 1))
}

// Generic function
fun <T> getName(name: T): T = name


//data class Tires(val size: Int)
//class Car(private val tires: Tires) {
//    fun getValues() = tires
//}

// Generic based class
//data class Tires(val size: Int)
//class Car<T>(private val tires: T) {
//    fun getValues(): T = tires
//}

//class Vehicle(private val value: Any) {
//    fun getValue() = value
//}

// Generic class again
class Vehicle<T>(private val value: T) {
    fun getValue(): T = value
}
class Car {
    fun start() = "Starting the engine"
}
