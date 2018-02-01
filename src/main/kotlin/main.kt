import org.voegtle.four.view.Board
import org.voegtle.four.view.Cell
import org.voegtle.four.view.Row
import org.w3c.dom.HTMLDivElement
import kotlin.browser.document

fun main(args: Array<String>) {
  val playground = document.getElementById("playground") as HTMLDivElement
  val board = Board(6,7)
  playground.append(board.html)
}