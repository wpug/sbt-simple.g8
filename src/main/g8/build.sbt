name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.12.4"

resolvers ++= Seq(
  "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"
)

libraryDependencies ++= {
  Seq(
    "org.scalatest"  %% "scalatest"  % "3.0.4"  % "test",
    "org.scalacheck" %% "scalacheck" % "1.13.4" % "test"
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
