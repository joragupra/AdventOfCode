package adventOfCode.day1.model

import Math.abs

object TaxicabGeometry {

  def distance(p1: Position, p2: Position): Int =  abs(p1.xCoordinate - p2.xCoordinate) + abs(p1.yCoordinate - p2.yCoordinate)

}
