import adventOfCode.day1.model._
import adventOfCode.day1.commands._
import io.Source._

val source = fromFile("/vagrant/AdventOfCode/resources/input.txt")
val inputs = try source.mkString finally source.close()

val commands = inputs.split(",").map(_.trim).map(CommandParser.parse)

val positions = CommandExecutor.execute(commands.toStream, List(InitialPosition))
print("Distance: " + TaxicabGeometry.distance(InitialPosition, positions.last) + "    ")

def firstDuplicate(positions: List[Position]): Option[Position] = positions match {
  case Nil => None
  case position::rest => if (rest.exists(p => p.xCoordinate == position.xCoordinate && p.yCoordinate == position.yCoordinate)) Some(position) else firstDuplicate(rest)
}

val duplicate = firstDuplicate(positions)
print(duplicate)
print("Distance from first duplicated position: " + TaxicabGeometry.distance(InitialPosition, duplicate.getOrElse(InitialPosition)) + "    ")