val scalatic = "org.scalactic" %% "scalactic" % "3.0.1"
val scalatest = "org.scalatest" %% "scalatest" % "3.0.1" % "test"

lazy val root = (project in file(".")).
  settings(
    name := "AdventOfCode",
    version := "1.0",
    scalaVersion := "2.10.4",
    libraryDependencies += scalatest
  )