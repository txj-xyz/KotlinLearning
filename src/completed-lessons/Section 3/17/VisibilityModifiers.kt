/*
    Lesson 17: Visibility Modifiers
        NOTES:
        Only controls access for that particular definition
        Omitted by default
        Default is public
        Good idea to keep private classes and expose what you want
        - public
        - private: Cannot access from another file or outside the class
        - protected: Same as a private one diff, visible in subclasses
        - internal: Accessible only inside the module where its defined, somewhere between private and public since we
        are inside a module
 */

fun main() {
    val person = Person(name = "Joey")
    person.getTheName()
}



private class Person(private val name: String) {
    private val nickname = "Steven"

    fun getTheName() {
        println("Public: $name")
    }

    private fun getTheNickname() {
        println(nickname)
    }
}