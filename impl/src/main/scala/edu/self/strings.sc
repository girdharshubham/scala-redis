import com.redis._
import edu.self.Connection._

/**
 * SET name shubham
 * */
client
  .set("name", "shubham")

/**
 * GET name
 * */
client
  .get("name")

client
  .set("loginCount", "1")

client
  .incr("loginCount")

client
  .incr("counter")