import adventOfCode.day2._

val actions = new adventOfCode.day2.Reader( "/vagrant/AdventOfCode/resources/day2_input.txt").read

var p = Pad(NormalButtonConfiguration.initialButton, List())

for (a <- actions) p = p.doAction(a)

p.pressedButtons.reverse

val actions2 = new adventOfCode.day2.Reader( "/vagrant/AdventOfCode/resources/day2b_input.txt").read

var p2 = Pad(WeirdButtonConfiguration.initialButton, List())

for (a <- actions) p2 = p2.doAction(a)

p2.pressedButtons.reverse