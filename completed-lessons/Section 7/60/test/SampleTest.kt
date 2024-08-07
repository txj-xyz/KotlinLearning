import org.junit.Test
import kotlin.test.*

class SampleTest {
    private val actualNumber = 30

    @Test
    fun testTheNumber() {
        assertEquals(
            expected = 30,
            actual = actualNumber,
            message = "Wrong number provided"
        )
    }

    @Test
    fun testTheNumberAssertTheError() {
        assertEquals(
            expected = 29,
            actual = actualNumber,
            message = "Wrong number provided"
        )
    }

    @Test
    // Can write an entire sentence explaining how our test will work with backticks
    fun `calculate, pass zero, assert an error`() {
       assertFails {
           calculate(number1 = 100, number2 = 0)
       }
    }

    // We are expecting the correct result with `assertIs<TypeReturn>(value)`
    @Test
    fun `calculate, pass correct value, assert a correct result`() {
        // <T> = the type we expect to return from `value`
        assertIs<Int>(value = calculate(number1 = 100, number2 = 10))
    }
}

fun calculate(number1: Int, number2: Int) = number1 / number2