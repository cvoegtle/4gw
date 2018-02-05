package org.voegtle.four.game

import org.voegtle.four.view.board.State

class Board(val rows: Int, val columns: Int) {
  val board = Array(rows, { _ -> Array(columns, { _ -> State.NEUTRAL }) })

  fun drop(column: Int, state: State): Int {
    val rowIndex = board.indexOfFirst { it[column] == State.NEUTRAL }
    board[rowIndex][column] = state
    return rowIndex
  }

  fun getAvailableColumns(): Array<Boolean> {
    val lastRow = board[rows-1]
    return Array(columns, { i -> lastRow[i] == State.NEUTRAL})
  }
}