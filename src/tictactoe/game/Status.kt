package tictactoe.game

// This is storage objects of the game state
// We are specifically saying that `Status.Idle` is the only `Status` class that can
// inherit from this. making it non extensible from the outside
sealed class Status {
    data object Idle: Status()
    data object InPlay: Status()
    data object GameOver: Status()
}