package adventOfCode.day2

trait Action

case object PressButton extends Action

trait Move extends Action

case object Up extends Move

case object Down extends Move

case object Right extends Move

case object Left extends Move