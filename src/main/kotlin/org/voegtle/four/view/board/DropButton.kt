package org.voegtle.four.view.board

import kotlinx.html.dom.create
import kotlinx.html.js.button
import kotlinx.html.js.onClickFunction
import org.voegtle.four.view.Style
import org.voegtle.four.view.player.PlayerColor
import kotlin.browser.document
import kotlin.dom.clear

class DropButton(val column: Int, val listener: (Int) -> Unit) {
  val html = document.create.button { onClickFunction = { _ -> listener.invoke(column)} }

  init {
    html.className = Style.DROP_BUTTON
    setState(State.NEUTRAL)
  }

  fun setState(state: State) {
    html.clear()
    html.append(PlayerColor(state).html)
  }

}