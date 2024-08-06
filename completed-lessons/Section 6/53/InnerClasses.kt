/*
    Lesson 53: Inner Classes
        NOTES:
        - Like nested classes, but maintains a reference to the outer class
        - can get all private or public props from outer class
        - `inner class` means it will make a class that retains information to the parent class
        - this can be used inside the class to get the parent like `this@ParentClass.variablePrivate`
        - we can create an instance of an inner class and when you print it, you'll see both the parent$inner
            class referenced, so you can access both inner/outer
        - you can have multiple inner classes, so `open class Parent -> inner class Class1 -> inner class Class2`
*/

fun main() {
//    val hdd = Computer(model = "Dell").HardDrive(size = 100)
//    hdd.getComputerModel()
//    hdd.getInfo()
//    hdd.Storage().getInfo()

    val laptop = Laptop(model = "Acer", hddSize = 150, storageModel = "nVME")
    laptop.Storage().getInfo()
    laptop.Storage().Storage().getInfo()

    println(laptop.Storage())
}

open class Computer(private val model: String) {
    abstract inner class HardDrive(private val size: Int) {
        abstract val storageModel: String

        fun getComputerModel() {
            println(this@Computer.model)
        }

        fun getInfo() {
            println("Computer Model: $model, HDD Size: $size GB.")
        }

        inner class Storage(private val system: Int = 10) {
            fun getInfo() {
                println("Current capacity: ${this@HardDrive.size - system} GB")
            }
        }
    }
}

// Creating a class that inherits `Computer` and uses a reference to the second nested inner class inside of it
class Laptop(
    private val model: String,
    private val hddSize: Int,
    private val storageModel: String
): Computer(model = model) {
    // this inner class of `Storage` is inheriting an abstract inner class inside of `Computer`
    // This is  inheriting an inner class from a new outer class
    inner class Storage() : Computer.HardDrive(size = hddSize) {
        override val storageModel = this@Laptop.storageModel
    }
}

class TestClassInheritInner(private val com: Computer.HardDrive): Computer(model = "test") {
    fun printModel() {
        println()
    }
}