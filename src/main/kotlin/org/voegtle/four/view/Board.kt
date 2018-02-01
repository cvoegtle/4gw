package org.voegtle.four.view

import kotlinx.html.dom.create
import kotlinx.html.js.div
import kotlin.browser.document

class Board(val rows: Int, val columns: Int) {
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
}