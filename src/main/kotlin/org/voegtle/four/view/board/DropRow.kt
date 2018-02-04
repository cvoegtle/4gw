package org.voegtle.four.view.board

import kotlinx.html.dom.create
import kotlinx.html.js.div
import org.voegtle.four.view.Style
import org.w3c.dom.HTMLDivElement
import kotlin.browser.document

class DropRow(size: Int) {
  val html: HTMLDivElement = document.create.div(Style.ROW) {}
  private val buttons = ArrayList<DropButton>()

  init {
    for (i in 1..size) {
      val button = DropButton()
      html.append(button.html)
      buttons.add(button)
    }
  }

  fun setState(state: State) {
    buttons.forEach { it.setState(state) }
  }

}