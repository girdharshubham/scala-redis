import Dependencies._

name := "scala-redis"

scalaVersion := "2.12.13"

val root = (project in file("."))
  .aggregate(impl)

lazy val impl = (project in file("impl"))
  .settings(
    libraryDependencies ++= Seq(
      redisClient
    )
  )