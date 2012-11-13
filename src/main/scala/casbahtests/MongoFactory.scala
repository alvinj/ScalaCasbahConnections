package casbahtests

import com.mongodb.casbah.MongoCollection
import com.mongodb.casbah.MongoConnection

object MongoFactory {

  private val SERVER = "localhost"
  private val PORT   = 27017
  private val DATABASE = "finance"
  private val COLLECTION = "stocks"

  def connection = MongoConnection(SERVER) 
  def collection(conn: MongoConnection) = conn(DATABASE)(COLLECTION)

}