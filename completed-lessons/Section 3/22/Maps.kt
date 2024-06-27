/*
    Lesson 22: Maps
        NOTES:
        - Map = Collection of K:V pairs each key is unique and 1 value
        - Values can be attached to multiple keys (same as typescript)
        - Accessed via the key name
        - <Map>.get("Key") = get the value
        - <Map>.get("BrokenKey") = null
        - <Map>.keys = get all keys `type <Set>`
        - <Map>.values = get all values `type <Collection>`
        - Collection type = can contain dupes
        - <Map>.getOrDefault(get = , default = ) = grab a key and its value or if not found then print the default var
        - <Map>.associateBy({ it.PROPERTY }, { it.PROPERTY2 }) = Return a `Map` containing the values we are looking
        for inside the `({})` operation, this will try to find those props and create a Map from it.
        If there are dupes then they are removed
        {EXAMPLE OUTPUT = '{Monkey=2, Tiger=4, Whale=6}'}
        - 'it' = iterator pointer inside the map loop associateBy
        -
*/

fun main() {
    // Map<String,String>()
    val animals = mapOf(
        "Monkey" to "brown",
        "Tiger" to "orange",
        "Whale" to "blue"
    )

//    println(animals["Monkey"])
//    println(animals["Dog"])
//
//    val keys = animals.keys
//    val values = animals.values
//    println(keys)
//    println(values)

    // print each k:v
//    for (entry in animals) {
//        println(entry.key)
//        println(entry.value)
//    }

    // another way to print K:V
//    for((key, value) in animals) {
//        println(key)
//        println(value)
//    }

    // Another 3rd way to print K:V
//    animals.forEach { key, value ->
//        println(key)
//        println(value)
//    }

//    println(animals.getOrDefault(key = "Monkey", defaultValue = "Black"))
//    println(animals.getOrDefault(key = "Dog", defaultValue = "Black")) // Dog doesnt exist so print "Black"

    // Filter out elements that are not of length 4
//    val filteredMap = animals.filter {
//        it.value.length > 4
//    }
//
//    println(filteredMap)

//    val animalList = listOf("Monkey", "Tiger", "Whale")
//    println(animalList.associateBy { it })

    val monkey = Animal(name = "Monkey", age = 2)
    val tiger = Animal(name = "Tiger", age = 4)
    val whale = Animal(name = "Whale", age = 6)
    val animalList = listOf(monkey, tiger, whale)

    val animalMap = animalList.associateBy({ it}, { it.age })
    println(animalMap)
}

class Animal(
    val name: String,
    val age: Int
)