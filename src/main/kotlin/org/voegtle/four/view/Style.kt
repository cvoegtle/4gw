package org.voegtle.four.view

import org.voegtle.four.view.board.State

object Style {
  val COIN = "coin"
  val BOX = "box"

  val PLAYER = "player"
  val PLAYER_BOX = "player-box"
  val PLAYER_COIN = "player-coin"
  val PLAYER_NAME = "player-name"

  val NEUTRAL = "free"
  val RED = "red"
  val YELLOW = "yellow"
  fun colorStyle(state: State) = when(state) {
    State.NEUTRAL -> Style.NEUTRAL
    State.RED -> Style.RED
    State.YELLOW -> Style.YELLOW
  }
}

fun combine(vararg styles: String): String {
  var combinedStyle = ""
  for (s in styles) {
    combinedStyle += s + " "
  }
  return combinedStyle
}