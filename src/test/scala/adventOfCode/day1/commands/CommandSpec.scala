package adventOfCode.day1.commands

import adventOfCode.day1.model._
import org.scalatest._

class CommandSpec extends FlatSpec with Matchers {

  "'R10'" should "be parsed to Turn RIGHT" in {
    CommandParser.parse("R10").t should be(Right)
  }

  it should "be parsed to take 10 steps" in {
    CommandParser.parse("R10").steps should be(10)
  }

  "'L20'" should "be parsed to Turn LEFT" in {
    CommandParser.parse("L20").t should be(Left)
  }

  it should "be parsed to take 10 steps" in {
    CommandParser.parse("L20").steps should be(20)
  }

}
