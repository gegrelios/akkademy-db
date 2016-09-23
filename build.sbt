name := """akkademy-db"""

version := "1.0"

scalaVersion := "2.11.7"
// Uncomment to use Akka
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.11"

// Add akka testkit framework
libraryDependencies += "com.typesafe.akka" %% "akka-testkit" % "2.3.6" % "test"

// Change this to another test framework if you prefer
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"


