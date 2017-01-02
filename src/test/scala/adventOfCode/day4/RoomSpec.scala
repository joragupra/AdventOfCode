package adventOfCode.day4

import org.scalatest._

class RoomSpec extends FlatSpec with Matchers {

  "aaaaa-bbb-z-y-x-123[abxyz]" should "be a real Room" in {
    val room = Room("aaaaa-bbb-z-y-x", 123, "abxyz")

    room.isReal should be(true)
  }

  "a-b-c-d-e-f-g-h-987[abcde]" should "be a real Room" in {
    val room = Room("a-b-c-d-e-f-g-h", 987, "abcde")

    room.isReal should be(true)
  }

  "not-a-real-room-404[oarel]" should "be a real Room" in {
    val room = Room("not-a-real-room", 404, "oarel")

    room.isReal should be(true)
  }

  "totally-real-room-200[decoy]" should "not be a real Room" in {
    val room = Room("totally-real-room", 200, "decoy")

    room.isReal should be(false)
  }

}
