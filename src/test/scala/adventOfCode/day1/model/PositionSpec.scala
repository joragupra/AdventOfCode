package adventOfCode.day1.model

import org.scalatest._
import adventOfCode.day1.commands._

class PositionSpec extends FlatSpec with Matchers {

  val nextMove = new Command(Right, 5)
  val position = Position(2, 3, North)

  "Moving 'R5' from position (2,3) facing North" should "end in position (7, 3)" in {
    position.turnAndMove(nextMove.t, nextMove.steps).last.xCoordinate should be(7)
    position.turnAndMove(nextMove.t, nextMove.steps).last.yCoordinate should be(3)
  }

  it should "end facing East" in {
    position.turnAndMove(nextMove.t, nextMove.steps).last.dir should be(East)
  }

  it should "produce five new positions" in {
    position.turnAndMove(nextMove.t, nextMove.steps).size should be(5)
  }

  "The initial position" should "be (0,0) facing North" in {
    InitialPosition.xCoordinate should be(0)
    InitialPosition.yCoordinate should be(0)
    InitialPosition.dir should be(North)
  }

}
