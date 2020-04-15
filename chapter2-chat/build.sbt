lazy val chat2 = project.in(file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.webjars"       %  "bootstrap" % "3.0.2",
  "org.scalatestplus" %% "play"      % "1.4.0-M3"  % "test"
)
