package casbahtests

import com.mongodb.casbah.Imports._

/**
 * A test class to understand Casbah database connections.
 * Look at open database connections with 'sudo lsof | grep mongod | grep TCP'
 */
object MainDriver extends App {

  // create a series of fake stocks so i can simultaneously look at the open
  // connections from the command line
  for (x <- 'a' to 'z') {
    println("debug: " + x)
    Stock.save(Stock(x.toString, x.toString))  // create a new stock and save it
    Thread.sleep(1000)
  }
  
  // give me time to check the database connections
  sleepAtTheEnd

  def sleepAtTheEnd {
    println("sleeping at the end")
    for (i <- 1 to 30) {
      println("  sleeping: " + i)
      Thread.sleep(1000)
    }
    println("game over")
  }
  
}

