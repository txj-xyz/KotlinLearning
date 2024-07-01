import kotlin.random.Random

/*
    Lesson 26: `when` Expression
        NOTES:
        - Advanced form of the `switch` case statement, compares against a selection of possibilities
        - More elegant way to switch case, can be used in for loops as well
        - When nothing is caught by the `when` block then we need to have a fallthrough `else` (optional)
 */

fun main() {
    // Grab a random number from 1-5
//    when(Random.nextInt(from = 1, until = 5)) {
//        1 -> {
//            println("One")
//        }
//        2 -> {
//            println("Two")
//        }
//        3 -> {
//            println("Three")
//        }
//    }

    // return based when block
//    val result = when(Random.nextInt(from = 1, until = 5)) {
//        1 -> {
//            1
//        }
//        2 -> {
//            2
//        }
//        3 -> {
//            3
//        }
//        else -> {
//            null
//        }
//    }
//    println(result)


    // Check if the class returned is of a certain object
//    when(getPerson()) {
//        is Person.Male -> {
//            println("Male")
//        }
//        is Person.Female -> {
//            println("Female")
//        }
//    }
    val number = listOf(1,2,3,4,5)
    for(n in number) {
        when(n) {
//            1 -> {
//                break
//            }
            2 -> {
                continue
            }
            3 -> {
                println("Three")
            }
            4 -> {
                println("Four")
            }
            5 -> {
                println("Five")
            }
        }
    }
}

fun getPerson(): Person {
    return if(Random.nextInt(from = 0, until = 3) == 1) Person.Male else Person.Female
}

sealed class Person {
    object Male: Person()
    object Female: Person()
}