package adventOfCode.day1.model

sealed trait Turn {}

case object Right extends Turn

case object Left extends Turn
