package adventOfCode.day1.commands

import adventOfCode.day1.model.{Left, Right, Turn}

class Command(val t: Turn, val steps: Int) {

  override def toString: String = "Turn " + t + " and move " + steps

}

object CommandParser {

  def parse(s:String): Command = {
    if (s startsWith "R") new Command(Right, s.substring(1).toInt)
    else if (s startsWith "L") new Command(Left, s.substring(1).toInt)
    else null
  }

}