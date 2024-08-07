package main

sealed class State {
    data object On: State()
    data object Off: State()
}

class PowerSwitch {
    var state: State = State.Off
        private set

    fun trigger() {
        state = when(state) {
            is State.On -> State.Off
            is State.Off -> State.On
        }
    }
}