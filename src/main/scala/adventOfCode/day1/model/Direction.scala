package adventOfCode.day1.model

sealed trait Direction {

  def onRight: Direction
  def onLeft: Direction
  def name: String

  def change(t: Turn) = t match {
    case Right => onRight
    case Left => onLeft
  }

}

case object North extends Direction {
  override def name: String = "North"

  override def onRight: Direction = East

  override def onLeft: Direction = West
}

case object South extends Direction {
  override def name: String = "South"

  override def onRight: Direction = West

  override def onLeft: Direction = East
}

case object East extends Direction {
  override def name: String = "East"

  override def onRight: Direction = South

  override def onLeft: Direction = North
}

case object West extends Direction {
  override def name: String = "West"

  override def onRight: Direction = North

  override def onLeft: Direction = South
}
