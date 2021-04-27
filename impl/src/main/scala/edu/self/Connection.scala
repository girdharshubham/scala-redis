package edu.self

import com.redis.RedisClient

object Connection {
  val client = new RedisClient("localhost", 6379)
}
