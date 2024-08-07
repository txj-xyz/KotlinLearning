import main.PowerSwitch
import main.State
import org.junit.Test
import kotlin.test.*

class PowerSwitchTest {
    private val powerSwitch = PowerSwitch()

    @Test
    fun `assert initial power switch state to off`() {
        assertEquals(
            actual = powerSwitch.state,
            expected = State.Off
        )
    }

    @Test
    fun `initial state off, trigger power switch, assert state on`() {
        assertEquals(
            actual = powerSwitch.state,
            expected = State.Off,
        )
        powerSwitch.trigger()
        assertEquals(
            actual = powerSwitch.state,
            expected = State.On
        )
    }

    @Test
    fun `initial state off, trigger power switch two times, assert state off`() {
        assertEquals(
            actual = powerSwitch.state,
            expected = State.Off
        )
        powerSwitch.trigger()
        powerSwitch.trigger()
        assertEquals(
            actual = powerSwitch.state,
            expected = State.Off
        )
    }
}