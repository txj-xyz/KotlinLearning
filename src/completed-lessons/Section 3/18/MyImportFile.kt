// represents full import of `package.Class`
// Everything can be imported via `import package.*`
// You can rename an imported class/variable/functions via `as` keyword
// You will get an error if you are importing


import model.*
import model.calculateTheNumberFrom0To100 as randomNumber
//import model.Person
//import model.calculate
//import model.age

fun main() {
    val person = Person()
    val result = calculate()
    val myAge = age
    val result2 = randomNumber()
}

class Animal