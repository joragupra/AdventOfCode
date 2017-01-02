package adventOfCode.day4

class NameDecipher {

  def decipherName(r: Room): String = shiftRight(r.name.toList, r.sector).mkString.trim

  private def shiftRight(s: List[Char], pos: Int): List[Char] = s match {
    case Nil => List(0)
    case c::rest => shiftRight(c, pos)::shiftRight(rest, pos)
  }

  private val alphabet: List[Char] = "abcdefghijklmnopqrstuvwxyz".toList

  private def shiftRight(c: Char, pos: Int): Char = {
    c match {
      case minusChar: Char if c.equals('-') => ' '
      case char: Char => {
        val foundAt = alphabet.zipWithIndex.find(letterWithPos => letterWithPos._1 == c).get._2
        alphabet((foundAt + pos) % alphabet.size)
      }
    }/*
    if (c.equals('-')) ' '
    else {
      val foundAt = alphabet.zipWithIndex.find(letterWithPos => letterWithPos._1 == c).get._2
      alphabet((foundAt + pos) % alphabet.size)
    }*/
  }

}
