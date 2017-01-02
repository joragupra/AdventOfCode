package adventOfCode.day2
import scala.io.Source

case class Reader(inputFile: String) {

  def read: List[Action] = {
    (for(line <- Source.fromFile(inputFile).getLines()) yield readLine(line.toList, List())).flatten.toList
  }

  private def readLine(line: List[Char], actions: List[Action]): List[Action] = line match {
    case Nil => (PressButton::actions).reverse
    case a::rest => readLine(rest, parse(a)::actions)
  }

  private def parse(action: Char): Action = if (action.equals('U')) Up
  else if (action.equals('D')) Down else if (action.equals('L')) Left else if (action.equals('R')) Right else PressButton

}
