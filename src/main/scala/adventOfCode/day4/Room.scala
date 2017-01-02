package adventOfCode.day4

import scala.collection.immutable.ListMap

case class Room(name: String, sector: Int, checksum: String) {

  def isReal(): Boolean = {
    ListMap()
    (charRepetitions(name.toList, Map()) - ('-')).toSeq.sortBy(_._1).reverse
    val mostRepeated: List[Char] = (charRepetitions(name.toList, Map()) - ('-')).toSeq.sortWith(byRepetitionsAndAlphabeticalOrder).toList.map(_._1)
    checksum.toList.zipWithIndex.forall(p => mostRepeated(p._2) == p._1)
  }

  def byRepetitionsAndAlphabeticalOrder(t1: (Char, Int), t2: (Char, Int)): Boolean = t1._2 > t2._2 || (t1._2 == t2._2 && t1._1 < t2._1)

  private def charRepetitions(chars: List[Char], acc: Map[Char, Int]): Map[Char, Int] = chars match {
    case Nil => acc
    case c::rest => charRepetitions(rest, acc + (c -> (acc.getOrElse(c, 0) + 1)))
  }

}
