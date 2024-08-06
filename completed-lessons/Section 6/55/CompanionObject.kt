/*
    Lesson 55: Companion Object
        NOTES:
        - We cannot access outer values from our companion object
        - `companion object` keyword
        - `this` inside a companion object is referenced to the companion object itself
        - a companion object allows privates to be seen inside its parent class but not outside of it
        - if you define a companion object we can now see everything inside the class we created it in
        - `companion object Name {}` allows you to rename the default from `Companion`
        - initialized when the class is Loaded
        - no matter how many instances we create of our class with a companion object we get shared memory for it
            meaning all instances created will have access to the same memory or values
        - You cannot see the class members inside the companion object because they could be different we only
            see the companion object itself and the functions / values inside it.
        - You CANNOT create multiple companion objects per class
        - Accessed via `Class.member()` or `Class.CompanionCustomName.member()`
        - When the class is not loaded we can see the companion object meaning we do not need to instantiate it
            in order to access the companion members
*/

fun main() {
//    val example = Example()
//    example.callMe()
//    println(example.result)
//    Example.result.callMe2()
    val number1 = Numbers()
    val number2 = Numbers()

    number1.increment()
    number2.increment()
    number1.increment()

    println(Numbers.number)

}

class Numbers {
    companion object {
        var number = 0
    }

    fun increment() {
        ++number
    }
}

class Example {
    fun callMe() = "Calling a function."
    val result = callMe2()
    companion object NestedCompanion {
        fun callMe2() = "Calling a function2."
        val result = this
        val testMember = callMe2()
    }
}