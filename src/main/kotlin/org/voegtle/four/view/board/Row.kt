package org.voegtle.four.view.board

import kotlinx.html.dom.create
import kotlinx.html.js.div
import org.voegtle.four.view.Style
import org.w3c.dom.HTMLDivElement
import kotlin.browser.document

class Row(size: Int) {
  val html: HTMLDivElement = document.create.div(Style.ROW) {}
  val cells = ArrayList<Cell>()
  init {
    for (i in 0..size-1) {
      val cell = Cell()
      cells.add(cell)
      html.append(cell.html)
    }
  }

  fun clear() {
    cells.forEach { it.clear() }
  }

  fun setState(column: Int, state: State) {
    cells[column].state(state)
  }
}