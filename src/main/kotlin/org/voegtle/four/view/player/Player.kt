package org.voegtle.four.view.player

import kotlinx.html.dom.create
import kotlinx.html.js.div
import kotlinx.html.js.input
import org.voegtle.four.view.Style
import org.voegtle.four.view.board.State
import kotlin.browser.document

class Player(state: State) {
  val html = document.create.div(Style.PLAYER) {}
  private val nameField = document.create.input {  }
  init {
    val color = PlayerColor(state)
    html.append(color.html)
    nameField.className = Style.PLAYER_NAME
    html.append(nameField)
  }
}