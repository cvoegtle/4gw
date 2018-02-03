package org.voegtle.four.view.board

import kotlinx.html.dom.create
import kotlinx.html.js.div
import kotlin.browser.document

class Board(rows: Int, columns: Int) {
  val html = document.create.div {}
  val rowList = ArrayList<Row>()

  init {
    html.className = "table"
    for (i in 1..rows) {
      val row = Row(columns)
      html.append(row.html)
      rowList.add(row)
    }
  }

  fun clear() {
    for (row in rowList) {
      row.clear()
    }
  }

  fun setState(row: Int, column: Int, state: State) {
    rowList[invert(row)].setState(column, state)
  }

  private fun invert(row: Int) = rowList.size - 1 - row
}