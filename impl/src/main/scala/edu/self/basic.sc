import com.redis.RedisClient
import edu.self.Connection._

/**
 * CONFIG GET *
 * */
//    client
//      .getConfig()
//      .foreach(println)

/**
 * SET furniture:couch:color tan
 * */
client.set("furniture:couch:color", "tan")

/**
 * Keys *
 * */
client.keys("*")
  .foreach(println)

/**
 * GET furniture*
 * */
client.get("furniture:couch:color")
  .foreach(println)