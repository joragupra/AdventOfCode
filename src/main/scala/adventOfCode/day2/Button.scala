package adventOfCode.day2

trait PadConfiguration {
  val initialButton: Button
}

trait Button {
  val text: String
  val left: Button
  val right: Button
  val up: Button
  val down: Button
}

object NormalButtonConfiguration extends PadConfiguration {
  override val initialButton: Button = Five

  case object One extends Button {
    override val text: String = "1"
    override val left: Button = One
    override val right: Button = Two
    override val up: Button = One
    override val down: Button = Four
  }

  case object Two extends Button {
    override val text: String = "2"
    override val left: Button = One
    override val right: Button = Three
    override val up: Button = Two
    override val down: Button = Five
  }

  case object Three extends Button {
    override val text: String = "3"
    override val left: Button = Two
    override val right: Button = Three
    override val up: Button = Three
    override val down: Button = Six
  }

  case object Four extends Button {
    override val text: String = "4"
    override val left: Button = Four
    override val right: Button = Five
    override val up: Button = One
    override val down: Button = Seven
  }

  case object Five extends Button {
    override val text: String = "5"
    override val left: Button = Four
    override val right: Button = Six
    override val up: Button = Two
    override val down: Button = Eight
  }

  case object Six extends Button {
    override val text: String = "6"
    override val left: Button = Five
    override val right: Button = Six
    override val up: Button = Three
    override val down: Button = Nine
  }

  case object Seven extends Button {
    override val text: String = "7"
    override val left: Button = Seven
    override val right: Button = Eight
    override val up: Button = Four
    override val down: Button = Seven
  }

  case object Eight extends Button {
    override val text: String = "8"
    override val left: Button = Seven
    override val right: Button = Nine
    override val up: Button = Five
    override val down: Button = Eight
  }

  case object Nine extends Button {
    override val text: String = "9"
    override val left: Button = Eight
    override val right: Button = Nine
    override val up: Button = Six
    override val down: Button = Nine
  }
}

object WeirdButtonConfiguration extends PadConfiguration {
  override val initialButton: Button = Five

  case object One extends Button {
    override val text: String = "1"
    override val left: Button = One
    override val right: Button = One
    override val up: Button = One
    override val down: Button = Three
  }

  case object Two extends Button {
    override val text: String = "2"
    override val left: Button = Two
    override val right: Button = Three
    override val up: Button = Two
    override val down: Button = Six
  }

  case object Three extends Button {
    override val text: String = "3"
    override val left: Button = Two
    override val right: Button = Four
    override val up: Button = One
    override val down: Button = Seven
  }

  case object Four extends Button {
    override val text: String = "4"
    override val left: Button = Three
    override val right: Button = Four
    override val up: Button = Four
    override val down: Button = Eight
  }

  case object Five extends Button {
    override val text: String = "5"
    override val left: Button = Five
    override val right: Button = Six
    override val up: Button = Five
    override val down: Button = Five
  }

  case object Six extends Button {
    override val text: String = "6"
    override val left: Button = Five
    override val right: Button = Seven
    override val up: Button = Two
    override val down: Button = A
  }

  case object Seven extends Button {
    override val text: String = "7"
    override val left: Button = Six
    override val right: Button = Eight
    override val up: Button = Three
    override val down: Button = B
  }

  case object Eight extends Button {
    override val text: String = "8"
    override val left: Button = Seven
    override val right: Button = Nine
    override val up: Button = Four
    override val down: Button = C
  }

  case object Nine extends Button {
    override val text: String = "9"
    override val left: Button = Eight
    override val right: Button = Nine
    override val up: Button = Nine
    override val down: Button = Nine
  }

  case object A extends Button {
    override val text: String = "A"
    override val left: Button = A
    override val right: Button = B
    override val up: Button = Six
    override val down: Button = A
  }

  case object B extends Button {
    override val text: String = "B"
    override val left: Button = A
    override val right: Button = C
    override val up: Button = Seven
    override val down: Button = D
  }

  case object C extends Button {
    override val text: String = "C"
    override val left: Button = B
    override val right: Button = C
    override val up: Button = Eight
    override val down: Button = C
  }

  case object D extends Button {
    override val text: String = "D"
    override val left: Button = D
    override val right: Button = D
    override val up: Button = B
    override val down: Button = D
  }

}
