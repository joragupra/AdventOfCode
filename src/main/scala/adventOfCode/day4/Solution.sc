import adventOfCode.day4._

val reader = RoomReader( "/vagrant/AdventOfCode/resources/day4_input.txt")

val rooms = reader.read

print("Number of real rooms: " + rooms.filter(_.isReal()).map(_.sector).sum)

val dec = new NameDecipher
rooms.filter(r => dec.decipherName(r).contains("northpole object storage")).foreach(r => println(dec.decipherName(r) + " is in sector " + r.sector))
