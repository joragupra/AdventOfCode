package adventOfCode.day4

import org.scalatest._

class RoomReaderSpec extends FlatSpec with Matchers {
//fubrjhqlf-edvnhw-dftxlvlwlrq-803[wjvzd]

  "'fubrjhqlf-edvnhw-dftxlvlwlrq-803[wjvzd]'" should "convert to a Room with name 'fubrjhqlf-edvnhw-dftxlvlwlrq'" in {
    val reader: RoomReader = RoomReader("")

    reader.parse("fubrjhqlf-edvnhw-dftxlvlwlrq-803[wjvzd]").get.name should be("fubrjhqlf-edvnhw-dftxlvlwlrq")
  }

  it should "convert to a Room in sector 803" in {
    val reader: RoomReader = RoomReader("")

    reader.parse("fubrjhqlf-edvnhw-dftxlvlwlrq-803[wjvzd]").get.sector should be(803)
  }

  it should "convert to a Room with checksum 'wjvzd'" in {
    val reader: RoomReader = RoomReader("")

    reader.parse("fubrjhqlf-edvnhw-dftxlvlwlrq-803[wjvzd]").get.checksum should be("wjvzd")
  }
}
