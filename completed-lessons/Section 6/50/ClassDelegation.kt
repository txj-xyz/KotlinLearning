/*
    Lesson 50: Class Delegation
        NOTES:
        - Delegation pattern = Composition behind the scenes
        - Implement an interface by owning an object that implements that interface
        - `by` keyword = delegation pattern
        - mandatory that the delegated class and the `by` class is using the same interface.
        - Delegate and the class that performs the delegation should both implement the same interface
        - you cannot delegate two difference classes that implement the same interface
        - We can simulate multiple class inheritance with class delegation such as our freelancer 4 example
        - WHY IS THIS SO CONVOLUTED???
*/

fun main() {
    val freelancer = Freelancer()
    val freelancer2 = Freelancer2(programmer = KotlinProgrammer(amount = 100))
    val freelancer4 = Freelancer4()
    freelancer.work()
    freelancer.getPaid()

    freelancer2.work()
    freelancer2.getPaid()
}

interface Programmer {
    var working: Boolean
    fun work()
    fun getPaid()
}

interface Designer {
    var designing: Boolean
    fun design()
    fun getTheMoney()
}

class GraphicDesigner(private val amount: Int): Designer {
    override var designing = false

    override fun design() {
        println("Designing...")
        designing = true
    }

    override fun getTheMoney() {
        if (designing) {
            println("Getting paid for: $$amount!")
        } else {
            println("No money! You need to work first!")
        }
        designing = false
    }
}

class KotlinProgrammer(private val amount: Int): Programmer {
    override var working = false

    override fun work() {
        println("Programming with Kotlin...")
        working = true
    }

    override fun getPaid() {
        if (working) {
            println("Getting paid for: $$amount!")
        } else {
            println("No money! You need to work first!")
        }
        working = false
    }
}

class JavaProgrammer(private val amount: Int): Programmer {
    override var working = false

    override fun work() {
        println("Programming with Java...")
        working = true
    }

    override fun getPaid() {
        if (working) {
            println("Getting paid for: $$amount!")
        } else {
            println("No money! You need to work first!")
        }
        working = false
    }
}

// Now this class doesn't need to implement the interface or properties. as we are delegating an implementation
class Freelancer: Programmer by KotlinProgrammer(amount = 100)

// Class delegation by the variable we receive, this is handy if we need to cast in params
class Freelancer2(programmer: Programmer): Programmer by programmer {
        override fun getPaid() { println("You're not getting paid this month") }
}

// Supertype appears twice
// We cannot use the same interface on two different classes
//class Freelancer3:
//    Programmer by KotlinProgrammer(amount = 100),
//    Programmer by JavaProgrammer(amount = 150)


// We cannot implement two classes with the same properties, so we must rename them, now we do not get an error
class Freelancer4:
    Programmer by KotlinProgrammer(amount = 100),
    Designer by GraphicDesigner(amount = 150)