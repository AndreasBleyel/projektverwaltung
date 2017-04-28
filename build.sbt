name := """play-java-seed"""
organization := "at.ac.fhkuf"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.8"

libraryDependencies += filters
libraryDependencies ++= Seq(
  "mysql" % "mysql-connector-java" % "5.1.18"
)