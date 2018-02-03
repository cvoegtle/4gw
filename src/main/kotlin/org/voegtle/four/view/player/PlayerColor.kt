package org.voegtle.four.view.player

import kotlinx.html.dom.create
import kotlinx.html.js.div
import org.voegtle.four.view.Style
import org.voegtle.four.view.board.State
import org.voegtle.four.view.combine
import kotlin.browser.document

class PlayerColor(state: State) {
  val html = document.create.div {}

  init {
    html.className = Style.PLAYER_BOX

    val colorDiv = document.create.div {}
    colorDiv.className = combine(Style.PLAYER_COIN, Style.colorStyle(state))
    html.append(colorDiv)
  }
}