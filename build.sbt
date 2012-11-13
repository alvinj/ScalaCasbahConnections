organization := "com.alvinalexander"

name := "ScalatraCasbahMongo"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.9.1"

libraryDependencies ++= Seq(
  "ch.qos.logback" % "logback-classic" % "1.0.0" % "runtime",
  "com.mongodb.casbah" %% "casbah" % "2.1.5-1"
)

resolvers += "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"
