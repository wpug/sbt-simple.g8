name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.11.8"

resolvers ++= Seq(
  "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"
)

libraryDependencies ++= {
  Seq(
    "org.scalatest"  %% "scalatest"  % "3.0.0"  % "test",
    "org.scalacheck" %% "scalacheck" % "1.13.2" % "test"
  )
}

scalacOptions ++= Seq(
    "-deprecation",
    "-encoding", "UTF-8",
    "-feature",
    "-language:implicitConversions",
    "-unchecked",
    "-Xfatal-warnings",
    "-Xlint",
    "-Yinline-warnings",
    "-Ywarn-dead-code",
    "-Xfuture")

initialCommands := "import $organization$.$name;format="lower,word"$._"
