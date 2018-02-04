package org.voegtle.four.view.board

import kotlinx.html.dom.create
import kotlinx.html.js.button
import org.voegtle.four.view.Style
import org.voegtle.four.view.player.PlayerColor
import kotlin.browser.document
import kotlin.dom.clear

class DropButton {
  val html = document.create.button {}

  init {
    html.className = Style.DROP_BUTTON
    setState(State.NEUTRAL)
  }

  fun setState(state: State) {
    html.clear()
    html.append(PlayerColor(state).html)
  }

}