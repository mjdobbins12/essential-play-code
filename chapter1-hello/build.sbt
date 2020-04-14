lazy val app = project.in(file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.6" % "test",
  "org.scalatestplus" %% "play" % "1.2.0" % "test"
)

libraryDependencies += "com.typesafe.play" % "play" % "2.7.4"
libraryDependencies += "com.typesafe.play" % "play-test" % "2.7.4"