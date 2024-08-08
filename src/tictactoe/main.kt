package tictactoe

import tictactoe.game.*
import kotlin.system.exitProcess

fun main() {
    val game = Game()
    game.createGame()
}

// Start with a Game instance, so we can make a List of Cells that are Empty value
// by default and
class Game {
    // This is our game board, it looks confusing, but we have made a 9 length
    // Mutable list that is only visible within this Game class itself.
    private val board = MutableList<Cell>(size = 9) { Cell.Empty }

    // The default status of the game is Idle form upon start of the main game program
    private var status: Status = Status.Idle

    // Set up a blank player var that we will assign later in the code
    private lateinit var player: Player

    /*
        This function will do the following:
            1. Update the Status (aka) our state to `Status.InPlay` from the default of Idle
            2. Print out the welcome starting message with instructions on how to play
            3. Grab our player name from the console and print out details about the computer and player
     */
    fun createGame() {
        status = Status.InPlay
        println("""
            +-------------------------------------+
            |         Tic-Tac-Toe Started         |
            |-------------------------------------|
            | Enter a number to place your marker |
            |          Valid numbers: 0-8         |
            +-------------------------------------+
        """.trimIndent())

        // After we start up the render of the board lets create a name
        setUserPlayer()

        // run a loop while the game is running
        while(status is Status.InPlay) {
            /*
                While the game is running we want to get a cell position status
                the `getCellStatus()` calls out setter for a marker, so we dont need to
                worry about the game state
             */
            getCellStatus()
        }
    }


    // Print out the player name and computer name and let the User know it's their move
    private fun setUserPlayer() {
        print("Choose your player name: ")
        val playerName = readlnOrNull()
        try {
            // Make sure that the player name is not null that we entered on the command line
            require(value = playerName != null)

            // Create a player class
            player = Player(name = playerName, marker = 'X')

            // After we have made the player we can now print some information about
            // the game, and the computer AI
            println("Welcome to Tic-Tac-Toe $playerName!, Your marker is: '${player.marker}'")
            println("""
                ---
                It's your move ${player.name}
            """.trimIndent())
            renderBoard()

        } catch (e: IllegalArgumentException) {
            println("Your player name is empty. Please enter a valid name!")
        }
    }

    // Print out the game board here in its current state
    private fun renderBoard() {
        println("+-----------+")
        // Print 3x3 grid with the placeholders
        for(i in board.indices) {
            print("| ${board[i].placeholder} ")
            if(i % 3 == 2) {
                println("|")
            } else {
                print("")
            }
        }
        println("+-----------+")
    }

    // Retrieves the status of a cell
    private fun getCellStatus() {
        val input = readlnOrNull()
        try {
            require(input != null)
            val position = input.toInt()
            require(position in 0..8)

            // Set the cell we got requested from the player
            setCellPosition(pos = position)
        } catch (e: IllegalArgumentException) {
            println("Invalid position, please choose a valid number (0-8)")
        } catch (e: NumberFormatException) {
            println("Input provided is not a number..")
        }
    }

    // here we can set a cell for the Player only
    private fun setCellPosition(pos: Int) {
        val cellPos = board[pos]
        // Since we use a sealed object state we can use that with the `is` keyword here
        if(cellPos is Cell.Empty) {
            // Set the new position state here, we do have access to the `.set` method which is helpful
            board.set(index = pos, element = Cell.Filled(player = player))

            // After the player moves, let the computer generate a move.
            checkWinCondition()
            computerRandomMove()
            checkWinCondition()

            // After we set the position lets show the player the board again
            renderBoard()
        } else {
            println("This Cell is taken, please choose another one.")
        }
    }

    private fun computerRandomMove() {
        try {
            val cellsOpen = mutableListOf<Int>()
            board.forEachIndexed { i, cell ->
                if(cell is Cell.Empty) { cellsOpen.add(element = i) }
            }

            if(cellsOpen.isNotEmpty()) {
                val cellRandom: Int = cellsOpen.random()
//                println("Cell Random: $cellRandom | Found ${cellsOpen.size} cells")
                board.set(index = cellRandom, element = Cell.Filled(player = Player()))
            }

        } catch(e: Throwable) {
            println("Error: ${e.message}")
        }
    }

    private fun checkWinCondition() {
        val winConditions = listOf(
            // Rows
            listOf(0, 1, 2),
            listOf(3, 4, 5),
            listOf(6, 7, 8),

            // Columns
            listOf(0, 3, 6),
            listOf(1, 4, 7),
            listOf(2, 5, 8),

            // Diagonals
            listOf(0, 4, 8),
            listOf(2, 4, 6)
        )

        val playerFilledCells = mutableListOf<Int>()
        val computerFilledCells = mutableListOf<Int>()

        board.forEachIndexed { i, cell ->
            if(cell.placeholder == 'X') {
                playerFilledCells.add(element = i)
            }
            if(cell.placeholder == 'O') {
                computerFilledCells.add(element = i)
            }
        }

//        println("Player Cells: $playerFilledCells")
//        println("Computer Cells: $computerFilledCells")

        run CombinationLoop@{
            winConditions.forEach { win ->
                if(playerFilledCells.containsAll(win)) {
                    gameWin()
                    return@CombinationLoop
                }

                if(computerFilledCells.containsAll(win)) {
                    gameLoss()
                    return@CombinationLoop
                }
            }

        }
        // Loop over everything on the board but we need to make sure the game is in motion
        if(board.none { cell -> cell is Cell.Empty } && status is Status.InPlay) {
            gameDraw()
        }

        if(status is Status.GameOver) {
            completeGame()
            resetGamePrompt()
        }
    }
    
    private fun gameWin() {
        status = Status.GameOver
        renderBoard()
        println("You WON ${player.name}, congratz!")
    }

    private fun gameLoss() {
        status = Status.GameOver
        renderBoard()
        println("Sorry ${player.name}, you LOST!")
    }

    private fun gameDraw() {
        status = Status.GameOver
        renderBoard()
        println("Nobody wins! It's a DRAW! :O")
    }

    private fun completeGame() {
        // We want to reset the game to an idle state now that the game is over
        status = Status.Idle
        // Replace all the game tiles with empty spaces
        board.replaceAll { Cell.Empty }
    }

    private fun resetGamePrompt() {
        print("Do you want to play again? (Y/N): ")
        val input = readlnOrNull()
        try {
            require(input != null)
            val uppercaseInput = input.uppercase()
            val yesInput = uppercaseInput.contains(other = "Y")
            val noInput = uppercaseInput.contains(other = "N")

            require(value = yesInput || noInput)

            if(yesInput) {
                createGame()
            } else if(noInput) {
                exitProcess(status = 0)
            }
        } catch (e: IllegalArgumentException) {
            println("Invalid option: Please enter a valid option! (Y/N)")
            // Reset the prompt again to wait for the proper input from the user
            resetGamePrompt()
        }
    }
}