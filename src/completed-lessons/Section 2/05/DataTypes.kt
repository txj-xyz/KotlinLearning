/*
    Lesson 5
    Data Types

    Types can be inferred from the compiler if omitted
    If you want to change a type you must either infer it or statically type it.
 */

fun main() {

    // type inference
    //    val number = 5 // Int
    //    val doubleNumber = 4.99 // Double
    //    val letter = 'A' // Char
    //    val boolean = true // Boolean
    //    val text = "Some random text" // String

    // Number Data Types:
    // byte, short, int, long
    // float, double
    // Largest data type for number is LONG
    // Smallest data type for number is BYTE

    // If you are using type inference then you cannot reassign the type later even using VAR or VAL
    val number = 5 // Int
    val doubleNumber = 4.99 // Double (15 chars on decimal)
    val floatNumber = 4.99f // Float  (6-7 digits on decimal)
    val letter = 'A' // Char
    val boolean = true // Boolean
    val text = "Some random text" // String
    var textParse = "5"
    val numberFromString = Integer.parseInt(textParse)
    print(numberFromString) // Int (from string)
    val example = 1 + 1.5 // Inferred as Double
    val example2 = "Number" + 5 // Inferred as String
//    val example2Error = 5 + 'a' // Cannot be combined
    print(example2)
}

