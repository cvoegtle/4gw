package org.voegtle.four.view.board

import kotlinx.html.dom.create
import kotlinx.html.js.div
import org.voegtle.four.view.Style
import kotlin.browser.document

class BoardView(rows: Int, columns: Int, listener: (Int) -> Unit) {
  val html = document.create.div(Style.TABLE) {}
  private val dropRow = DropRow(columns, listener)
  private val rowList = ArrayList<Row>()

  init {
    html.append(dropRow.html)
    for (i in 1..rows) {
      val row = Row(columns)
      html.append(row.html)
      rowList.add(row)
    }
  }

  fun setActiveColor(availableColumns: Array<Boolean>, state: State) {
    dropRow.setState(availableColumns, state)
  }

  fun clear() {
    dropRow.setState(State.NEUTRAL)
    rowList.forEach { it.clear() }
  }

  fun setState(row: Int, column: Int, state: State) {
    rowList[invert(row)].setState(column, state)
  }

  private fun invert(row: Int) = rowList.size - 1 - row
}