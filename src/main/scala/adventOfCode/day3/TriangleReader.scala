package adventOfCode.day3
import scala.io.Source

trait TriangleReader {

  def read(inputFile: String): List[Triangle]

}

class AbstractTriangleReader {

  def readFile(inputFile: String): List[List[Int]] = (for(line <- Source.fromFile(inputFile).getLines()) yield readLine(line)).toList

  private def readLine(line: String): List[Int] = {
    line.trim.split("  ").map(_.trim).filter(!_.isEmpty).map(_.toInt).toList
  }

}


class HorizontalTriangleReader extends AbstractTriangleReader {

  def read(inputFile: String): List[Triangle] = {
    readFile(inputFile).map(l => Triangle(List(Side(l(0)), Side(l(1)), Side(l(2)))))
  }

}

class VerticalTriangleReader extends AbstractTriangleReader {

  def read(inputFile: String): List[Triangle] = {
    buildTriangles(readFile(inputFile).flatten)
  }

  private def buildTriangles(l: List[Int]): List[Triangle] = l match {
    case Nil => List()
    case a::b::c::rest => Triangle(List(Side(a), Side(b), Side(c)))::buildTriangles(rest)
  }

  override def readFile(inputFile: String): List[List[Int]] = super.readFile(inputFile).transpose

}