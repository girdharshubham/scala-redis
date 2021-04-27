package edu.self

import com.redis.RedisClient

object Main {
  def main(args: Array[String]): Unit = {
    val client = new RedisClient(host = "localhost", port = 6379)

    client
      .getConfig()
      .foreach(println)
  }
}
