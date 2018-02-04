package org.voegtle.four.view.board

import kotlinx.html.dom.create
import kotlinx.html.js.div
import org.voegtle.four.view.Style
import org.voegtle.four.view.combine
import org.w3c.dom.HTMLDivElement
import kotlin.browser.document

class Cell {
  val html: HTMLDivElement = document.create.div(Style.BOX) {}
  private val innerHtml: HTMLDivElement = document.create.div {}

  init {
    html.append(innerHtml)
    clear()
  }

  fun clear() {
    innerHtml.className = getClassname(State.NEUTRAL)
  }

  private fun getClassname(state: State) = combine(Style.COIN, Style.colorStyle(state))

  fun state(state: State) {
    innerHtml.className = getClassname(state)
  }

}