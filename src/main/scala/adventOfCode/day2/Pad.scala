package adventOfCode.day2

case class Pad(currentPosition: Button, pressedButtons: List[PressedButton]) {

  def doAction(action: Action): Pad = action match {
    case PressButton => new Pad(currentPosition, PressedButton(currentPosition)::pressedButtons)
    case Up => new Pad(currentPosition.up, pressedButtons)
    case Down => new Pad(currentPosition.down, pressedButtons)
    case Left => new Pad(currentPosition.left, pressedButtons)
    case Right => new Pad(currentPosition.right, pressedButtons)
  }

}

