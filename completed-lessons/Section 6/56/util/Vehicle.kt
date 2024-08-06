package util

// provides an EXACT implementation that cannot be modified
sealed interface Vehicle {
    fun drive()
}

enum class CarType: Vehicle {
    AUDI {
        override fun drive() {
            println("Driving AUDI")
        }
    },
    SUV {
        override fun drive() {
            println("Driving SUV")
        }
    },
    TRUCK {
        override fun drive() {
           println("Driving TRUCK")
        }
    },
}

fun parseVehicle(vehicle: Vehicle) {
    when(vehicle) {
        CarType.AUDI -> { println("CarType AUDI") }
        CarType.SUV -> { println("CarType SUV") }
        CarType.TRUCK -> { println("CarType TRUCK") }
    }
}