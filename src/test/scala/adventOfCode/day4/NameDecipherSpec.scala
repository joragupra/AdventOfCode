package adventOfCode.day4

import org.scalatest._

class NameDecipherSpec extends FlatSpec with Matchers {

  "The decrypted name of the room 'qzmt-zixmtkozy-ivhz-343'" should "be 'very encrypted name'" in {
    val room = Room("qzmt-zixmtkozy-ivhz", 343, "")

    new NameDecipher().decipherName(room) should be("very encrypted name")
  }
}
