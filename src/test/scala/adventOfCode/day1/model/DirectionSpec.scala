package adventOfCode.day1.model

import org.scalatest._

class DirectionSpec extends FlatSpec with Matchers {

  "The name of the NORTH Direction" should  "be 'North'" in {
    North.name should be ("North")
  }

  it should "have the EAST Direction on the right" in {
    North.onRight should be(East)
  }

  it should "have the WEST Direction on the right" in {
    North.onLeft should be(West)
  }

  "The name of the SOUTH Direction" should  " be 'South' " in {
    South.name should be ("South")
  }

  it should "have the WEST Direction on the right" in {
    South.onRight should be(West)
  }

  it should "have the EAST Direction on the right" in {
    South.onLeft should be(East)
  }

  "The name of the EAST Direction" should  " be 'East' " in {
    East.name should be ("East")
  }

  it should "have the SOUTH Direction on the right" in {
    East.onRight should be(South)
  }

  it should "have the NORTH Direction on the right" in {
    East.onLeft should be(North)
  }

  "The name of the WEST Direction" should  " be 'West' " in {
    West.name should be ("West")
  }

  it should "have the NORTH Direction on the right" in {
    West.onRight should be(North)
  }

  it should "have the SOUTH Direction on the right" in {
    West.onLeft should be(South)
  }

}
