package adventOfCode.day1.model

case class Position(xCoordinate: Int, yCoordinate: Int, dir: Direction) {

  def turnAndMove(t: Turn, steps: Int): List[Position] = Position(xCoordinate, yCoordinate, dir.change(t)).move(steps)

  private def move(steps: Int): List[Position] = this match {
    case Position(_, _, North) => (for (i <- 1 to steps) yield Position(xCoordinate, yCoordinate + i, North)).toList
    case Position(_, _, South) => (for (i <- 1 to steps) yield Position(xCoordinate, yCoordinate - i, South)).toList
    case Position(_, _, East) => (for (i <- 1 to steps) yield Position(xCoordinate + i, yCoordinate, East)).toList
    case Position(_, _, West) => (for (i <- 1 to steps) yield Position(xCoordinate - i, yCoordinate, West)).toList
  }

  override def toString: String = "Coordinates(" + xCoordinate + ", " + yCoordinate + "). Direction: " + dir.name

}

object InitialPosition extends Position(0, 0, North)
