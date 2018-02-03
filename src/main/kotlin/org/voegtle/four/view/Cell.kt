package org.voegtle.four.view

import kotlinx.html.dom.create
import kotlinx.html.js.div
import org.w3c.dom.HTMLDivElement
import kotlin.browser.document

class Cell {
  val html: HTMLDivElement = document.create.div {}
  private val innerHtml: HTMLDivElement = document.create.div {}

  private val CLASS_BASE = "coin"
  private val CLASS_NEUTRAL = "free"
  private val CLASS_RED = "red"
  private val CLASS_YELLOW = "yellow"

  init {
    html.className = "box"
    html.append(innerHtml)
    clear()
  }

  fun clear() {
    innerHtml.className = getClassname(State.NEUTRAL)
  }

  private fun getClassname(state: State): String = CLASS_BASE + " " + when(state) {
    State.NEUTRAL -> CLASS_NEUTRAL
    State.RED -> CLASS_RED
    State.YELLOW -> CLASS_YELLOW
  }

  fun state(state: State) {
    innerHtml.className = getClassname(state)
  }

}