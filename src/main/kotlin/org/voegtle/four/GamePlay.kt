package org.voegtle.four

import org.voegtle.four.game.FourWins
import org.voegtle.four.view.board.BoardView
import org.voegtle.four.view.board.State
import org.voegtle.four.view.player.Player
import org.w3c.dom.HTMLDivElement
import kotlin.browser.document

class GamePlay {
  val game = FourWins()
  val board = BoardView(game.rows, game.columns, { column -> handleDrop(column)})

  init {
    val players = document.getElementById("players") as HTMLDivElement
    val playerOne = Player(State.RED)
    val playerTwo = Player(State.YELLOW)
    players.append(playerOne.html)
    players.append(playerTwo.html)

    val playground = document.getElementById("playground") as HTMLDivElement
    playground.append(board.html)
  }

  private fun handleDrop(column: Int) {
    val activeColor = game.activeColor
    val row = game.drop(column)
    board.setState(row, column, activeColor)
    board.setActiveColor(game.availableColumns, game.activeColor)
  }

  fun play() {
    game.clear()
    board.clear()
    board.setActiveColor(game.availableColumns, game.activeColor)
  }
}