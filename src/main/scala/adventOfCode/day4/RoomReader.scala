package adventOfCode.day4

import scala.io.Source

case class RoomReader(inputFile: String) {

  def read: List[Room] = {
    ((for(line <- Source.fromFile(inputFile).getLines()) yield parse(line)).flatten.toList)
  }

  val stringBeforeMinusAndNumbers = ".*(?=-\\d+)".r
  val numbersBetweenMinusAndSquareBracket = "(?<=-)\\d+(?=\\[)".r
  val stringBetweenSquareBrackets = "(?<=\\[).*(?=\\])".r

  def parse(s: String): Option[Room] =
    for (
      name <- (stringBeforeMinusAndNumbers findFirstIn s);
      sector <- (numbersBetweenMinusAndSquareBracket findFirstIn s).map(_.toInt);
      checksum <- (stringBetweenSquareBrackets findFirstIn s)
    ) yield Room(name, sector, checksum)

}
