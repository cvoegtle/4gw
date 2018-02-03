import org.voegtle.four.view.board.Board
import org.voegtle.four.view.board.State
import org.voegtle.four.view.player.Player
import org.w3c.dom.HTMLDivElement
import kotlin.browser.document

fun main(args: Array<String>) {
  val players = document.getElementById("players") as HTMLDivElement
  val playerOne = Player(State.RED)
  val playerTwo = Player(State.YELLOW)
  players.append(playerOne.html)
  players.append(playerTwo.html)

  val playground = document.getElementById("playground") as HTMLDivElement
  val board = Board(6, 7)
  board.setState(0, 3, State.RED)
  board.setState(0, 4, State.RED)
  board.setState(0, 2, State.YELLOW)
  playground.append(board.html)
}