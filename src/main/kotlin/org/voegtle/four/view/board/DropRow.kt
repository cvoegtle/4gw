package org.voegtle.four.view.board

import kotlinx.html.dom.create
import kotlinx.html.js.div
import org.voegtle.four.view.Style
import org.w3c.dom.HTMLDivElement
import kotlin.browser.document

class DropRow(size: Int, clickListener: (Int) -> Unit) {

  val html: HTMLDivElement = document.create.div(Style.ROW) {}
  private val buttons = ArrayList<DropButton>()

  init {
    for (i in 0 until size) {
      val button = DropButton(i, clickListener)
      html.append(button.html)
      buttons.add(button)
    }
  }

  fun setState(availableColumns: Array<Boolean>, state: State) {
    for (i in 0 until availableColumns.size) {
      buttons[i].setState( if (availableColumns[i]) state else State.NEUTRAL)
      buttons[i].setEnabled(availableColumns[i])
    }
  }

  fun setState(state: State) {
    buttons.forEach { it.setState(state); it.setEnabled(true) }
  }

}