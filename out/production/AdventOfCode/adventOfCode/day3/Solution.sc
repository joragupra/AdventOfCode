import adventOfCode.day3._

val t = Triangle(List(Side(5), Side(10), Side(25)))

t.isValid()

val reader = new HorizontalTriangleReader()

reader.read("/vagrant/AdventOfCode/resources/day3_input.txt").count(_.isValid())

val r = new VerticalTriangleReader

r.read("/vagrant/AdventOfCode/resources/day3_input.txt").count(_.isValid())
