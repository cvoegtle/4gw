package org.voegtle.four.game

import org.voegtle.four.view.board.State

class FourWins {
  private var board = Board(6, 7)
  var activeColor = State.RED

  fun drop(column: Int): Int {
    val row = board.drop(column, activeColor)
    invertActiveColor()
    return row
  }

  val availableColumns: Array<Boolean>
    get() = board.getAvailableColumns()

  private fun invertActiveColor() {
    activeColor = when (activeColor) {
      State.RED -> State.YELLOW
      else -> State.RED
    }
  }

  val rows: Int
    get() = board.rows

  val columns: Int
    get() = board.columns

  fun clear() {
    board = Board(rows, columns)
  }

}