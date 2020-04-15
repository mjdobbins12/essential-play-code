lazy val csv = project.in(file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.8"

libraryDependencies += "joda-time" % "joda-time" % "2.0"
