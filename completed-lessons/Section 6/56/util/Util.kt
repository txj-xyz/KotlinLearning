package util

// make sure that the following 4 data objects are available at runtime
sealed interface NetworkStatus

//interface ChadStatus: NetworkStatus {
//    fun getStatus() { println("ChadStatus is enabled.") }
//}

data object Available: NetworkStatus
data object Unavailable: NetworkStatus
data object Limited: NetworkStatus
data object Unknown: NetworkStatus


class NetworkCheck {
    private lateinit var status: NetworkStatus
    fun isAvailable(): Boolean {
        return when(status) {
            is Available -> { true }
            is Unavailable -> { false }
            is Limited -> { false }
            is Unknown -> { false }
        }
    }
}