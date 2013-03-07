package casbahtests

import com.mongodb.casbah.MongoConnection

object MongoFactory {

  private val SERVER = "localhost"
  private val PORT   = 27017
  private val DATABASE = "finance"
  private val COLLECTION = "stocks"

  val connection = MongoConnection(SERVER)
  val collection = connection(DATABASE)(COLLECTION)

// this is part of what i was doing wrong before; to get a handle to a collection,
// i was passing a connection into getCollection
//  val getConnection = MongoConnection(SERVER) 
//  def getCollection(conn: MongoConnection) = conn(DATABASE)(COLLECTION)

}
