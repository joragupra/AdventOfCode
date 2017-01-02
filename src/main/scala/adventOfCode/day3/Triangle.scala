package adventOfCode.day3

case class Triangle(sides: List[Side]) {

  def isValid(): Boolean = sides.forall(side => (sides diff List(side)).map(_.length).sum > side.length)

}

case class Side(length: Int)
