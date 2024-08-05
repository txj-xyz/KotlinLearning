/*
    Lesson 49: Composition
        NOTES:
        - Composition is used with inheritance
        - def: Composition is known as a Class referencing instances of other objects we have instantiated
        - Use inheritance when you know exactly what's going to happen
        - Use Composition when you don't exactly know what is going to happen
*/

fun main() {
    val dog = Dog()
    val cleaningRobot = CleaningRobot()
    val cleaningRobotDog = CleaningRobotDog(dog = dog, cleaningRobot = cleaningRobot)
//    cleaningRobotDog.clean()
}

interface Animal {
    fun eat()
    fun run()
}

interface Robot {
    fun move()
}

open class Dog: Animal {
    override fun eat() {}
    override fun run() {}
    open fun bark() {}
}

class Cat: Animal {
    override fun eat() {}
    override fun run() {}
    fun hiss() {}
}

open class CleaningRobot: Robot {
    override fun move() {}
    open fun clean() {}
}

class ServiceRobot: Robot {
    override fun move() {}
    fun repair() {}
}

// Can implement multiple interfaces, but not two classes
//class CleaningRobotDog: Animal, Robot, Dog(), CleaningRobot() {
//    override fun bark() { super.bark() }
//    override fun eat() {}
//    override fun move() {}
//    override fun run() {}
//}


// we can optionally put them in our class params
class CleaningRobotDog(private val dog: Dog, private val cleaningRobot: CleaningRobot) {
    // Instead we can initialize these here, and now we can use them in a composition
//    private val dog = Dog()
//    private val cleaningRobot = CleaningRobot()

    fun run() {
        dog.run()
    }

    fun move() {
        cleaningRobot.move()
    }

    fun bark() {
        dog.bark()
    }

    fun clean() {
        cleaningRobot.clean()
    }
}


//class Parent {
//    fun getFood() {
//        println("Getting some food.")
//    }
//}
//
//// How a composition works and looks defined here
//// this is multiple classes inside of it as we have created the parent inside of this
//// nobody but this class can see it since its private
//class Child {
//    private val parent = Parent()
//    val getFood = parent.getFood()
//}

// Define a parent class we can use
class Parent {
    fun getFood() {
        println("Getting some food.")
    }
}

// Pass in a private param as a class so we can get access to it.
class Child(private val parent: Parent) {
    fun getFood() {
        parent.getFood()
    }
}