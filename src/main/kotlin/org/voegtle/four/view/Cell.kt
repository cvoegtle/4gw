package org.voegtle.four.view

import kotlinx.html.dom.create
import kotlinx.html.js.div
import org.w3c.dom.HTMLDivElement
import kotlin.browser.document

class Cell {
  val html: HTMLDivElement = document.create.div {}
  private val innerHtml: HTMLDivElement = document.create.div {}

  init {
    html.className = "box"
    html.append(innerHtml)
    clear()
  }

  fun clear() {
    innerHtml.className = "coin free"
  }

  fun red() {
    innerHtml.className = "coin red"
  }

  fun yellow() {
    innerHtml.className = "coin yellow"
  }

}