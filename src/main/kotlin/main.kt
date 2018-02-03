import org.voegtle.four.view.Board
import org.voegtle.four.view.State
import org.w3c.dom.HTMLDivElement
import kotlin.browser.document

fun main(args: Array<String>) {
  val playground = document.getElementById("playground") as HTMLDivElement
  val board = Board(6, 7)
  board.setState(0, 3, State.RED)
  board.setState(0, 4, State.RED)
  board.setState(0, 2, State.YELLOW)
  playground.append(board.html)
}