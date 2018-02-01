package org.voegtle.four.view

import kotlinx.html.dom.create
import kotlinx.html.js.div
import org.w3c.dom.HTMLDivElement
import kotlin.browser.document

class Row(val size: Int) {
  val html: HTMLDivElement = document.create.div {}
  val cells = ArrayList<Cell>()
  init {
    html.className = "row"
    for (i in 1..size) {
      val cell = Cell()
      cells.add(cell)
      html.append(cell.html)
    }
  }
}