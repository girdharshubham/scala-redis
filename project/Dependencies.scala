import sbt._

object Dependencies {
  lazy val RedisClientVersion = "3.30"
  val redisClient = "net.debasishg" %% "redisclient" % RedisClientVersion
}
