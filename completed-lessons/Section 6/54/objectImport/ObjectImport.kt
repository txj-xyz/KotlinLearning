// Matches the folder name to the packageName
package objectImport

// We import our `object Singleton` here from our other file
import Counter

fun main() {
    increment2()
}

fun increment2() {
    Counter.increment()
}