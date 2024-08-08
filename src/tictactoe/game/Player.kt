package tictactoe.game

// Define a Player object structure, so we have a name and a specified marker for that user.
// in this class we are defaulting to a computer when constructed, we can override these when
// we create an instance of `Player()`
data class Player(
    val name: String = "Computer",
    val marker: Char = 'O'
)

