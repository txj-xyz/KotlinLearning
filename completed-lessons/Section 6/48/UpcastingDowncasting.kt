/*
    Lesson 48: Upcasting & Downcasting
        NOTES:
        - Inheritance: Upcasting is creating an object from a child class of a parent type
        - Upcasts are always safe, because the parent class is the only one that we are seeing after the cast (e.g Animal)
        - Downcasting happens at runtime
        - RTTI = Run-time Type Identification (Downcasting the improper type)
        - Smart cast = Automatic downcast
        - Creating an object from a child class and storing that object we created into a variable in the parent
        is called "Upcasting", this means that from the parent class we've made something the parent can track.

        - When "upcasting" we directly loose information about the child because if we do
            `Animal -> Dog: Animal -> func` = lost info on `func` because all it sees is "Animal"

        - Discovering the type of an upcast in reverse is Downcasting smartly (see funcs)
*/

fun main() {
    val dog = Dog(name = "Rex")
    val cat = Cat(name = "Max")
    val dog2 = Dog(name = "Bell")

//    getAnimal(animal = dog) // We are upcasting `Dog` into a type of `Animal` here (upcasting)
//    getAnimal(animal = cat)
//    getAnimal2(animal = dog)
//    getAnimal3(animal = cat)
//    getAnimal4(animal = dog)
//    getAnimal5(animal = cat)

    // create a list of animals
    val animals = listOf(dog, cat, dog2)

    // find the first element of the match
//    val result = animals.find { it is Dog } as? Dog
//    println(result?.name)

    // Return all instances of the type generic specified
    val result = animals.filterIsInstance<Dog>()
    result.forEach { println(it.name) }
}

// Accepts all child classes or anything that implements `Animal` interface
// Since we accept interface `Animal` we can access its properties or overrides
// NOTE: since we directly implement `Animal` interface these are treated as Parent classes, this is an upcast
fun getAnimal(animal: Animal) {
    // Parent interface function of `Animal`
    animal.eat()
}

// Downcast and check the type in an `if()` block
fun getAnimal2(animal: Animal) {
    // Smartcast / Downcast because we now know the type
    // Automatic downcast
    if(animal is Dog) {
        animal.fetchABall()
    }
}

// Downcast with `when() {}` safer but need to check all our cases
fun getAnimal3(animal: Animal) {
    // Check both in a when case to do both actions better
    // Smart casting to Classes
    when(animal) {
        is Dog -> { animal.fetchABall() }
        is Cat -> { animal.scratch() }
    }
}


// Downcast and typecast into another type, in this case if we pass a `Cat` they are not the same Type
// so we get RTTI
fun getAnimal4(animal: Animal) {
    // Typecasting from received Animal
    // unsafe cast
    val dog = animal as Dog
    dog.fetchABall()
}

// Safe nullable
fun getAnimal5(animal: Animal) {
    // Typecasting from received Animal
    // nullable safe call
    val dog = animal as? Dog
    dog?.fetchABall()
}

// Define our Animal functions we can use to either override or implement directly, but returns Unit if not
// overridden by a class implementation
interface Animal {
    fun eat()
    fun run()
}

class Dog(val name: String) : Animal {
    // override our valid `eat()` function and give that to the child class of `Dog`
    override fun eat() {
        println("${this::class.qualifiedName} is eating...")
    }

    override fun run() {
        println("${this::class.qualifiedName} is running...")
    }

    fun fetchABall() {
        println("Fetching a ball..")
    }
}

class Cat(val name: String) : Animal {
    override fun eat() {
        println("${this::class.qualifiedName} is eating...")
    }

    override fun run() {
        println("${this::class.qualifiedName} is running...")
    }

    fun scratch() {
        println("Scratching a post..")
    }
}
