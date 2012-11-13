package casbahtests

import com.mongodb.casbah.Imports._

/**
 * A test class to understand Casbah database connections.
 * Look at open database connections with 'sudo lsof | grep mongod | grep TCP'
 */
object MainDriver extends App {
  
  // create some fake stocks
  for (x <- 'a' to 'z') {
    println("debug: " + x) 
    val s = Stock(x.toString, x.toString)
    Stock.save(s)
    Thread.sleep(1000)
  }
  
  // give me time to check the database connections
  println("sleeping at the end")
  Thread.sleep(30*1000)
  println("game over")

}

