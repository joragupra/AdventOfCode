package adventOfCode.day1.commands

import adventOfCode.day1.model.Position

object CommandExecutor {

  def execute(commands: Stream[Command], history: List[Position]): List[Position] = commands match {
    case command#::rest => execute(rest, history:::history.last.turnAndMove(command.t, command.steps))
    case _ => history
  }

}
