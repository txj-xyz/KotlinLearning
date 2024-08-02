/*
    Lesson 40: Working with Maps
        NOTES:
        - Maps are contained Pair<T, V>
        - groupBy =  group members of a list into a map, where the keys are values from the list entry (keyselector)
        - associateWith = group members of a list into a map, where the keys are values from the list entry (valueselector)
            - the member reference in the param is the key of the pair
        - associateBy -= used as a key instead of a value for its reference (member)
        - Map = key,value = pair / transformation of data as well
        -
*/

fun main() {
    val names = listOf("Alice", "Bob", "Bill", "Marry", "John")
    val ages = listOf(21,15,25,25,42)
    val people = names.zip(ages) { name, age -> Person(name, age) }

//    println(people)

//    val map: Map<Int, List<Person>> = people.groupBy(Person::age)
//    println(map)

// print an entry in the map by its key
//    println(map[15])
//    val map2: Map<Person, String> = people.associateWith(Person::name)
//    println(map2)

    // function returns a Map of the associated by the index of the keyselector
    val map3: Map<String, Person> = people.associateBy(Person::name)
    println(map3)

    // get all the values / keys from a map
//    println(map3.keys)
//    println(map3.values)

    // get a specific value if its not found then run the callback
//    println(map3.getOrElse("Alice123") { "Not found" })

    // get the real value that exists
//    println(map3.getOrElse("Alice") { "Not found" })

    // get a key form our map or put it inside of it, and return out the new value we added
//    println(map3.toMutableMap().getOrPut("Alice123") { Person(name = "Alice123", age = 30) })

    // filter all keys in our map for the start of "A"
//    println(map3.filterKeys { it.startsWith("A") })

    // convert a map into a list of strings, we can transform that here
    val result: List<String> = map3.map { (_, value) ->
        "\"${value.name}=${value.age}\""
    }
    println(result)

}

data class Person(
    val name: String,
    val age: Int
)