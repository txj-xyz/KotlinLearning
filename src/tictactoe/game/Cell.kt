package tictactoe.game

sealed class Cell(val placeholder: Char) {
    // This sealed class represents a Cell that has a specific value when inherited.
    // We can define that this type of cell is the only thing allowed for `Cell.Empty`
    data object Empty: Cell(placeholder = '_')
    data class Filled(val player: Player): Cell(placeholder = player.marker)
}