lazy val lights = project.in(file("."))

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  json,
  "org.scalatestplus" %% "play" % "1.4.0-M3"  % "test"
)
