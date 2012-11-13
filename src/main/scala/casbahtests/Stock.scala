package casbahtests

import com.mongodb.casbah.Imports._

/**
 * A class to represent a stock on the stock market, such as
 * Stock("Google", "GOOG") or Stock("Apple", "AAPL").
 */
case class Stock(var name: String, var symbol: String) 

/**
 * In keeping with the Play Framework approach, this is basically
 * a DAO. 
 */
object Stock {
  
  def save(stock: Stock) {
    val mongoDbObject = buildMongoDbObjectFromStock(stock)
    MongoFactory.collection(MongoFactory.connection).save(mongoDbObject)
  }
  
  /**
   * Convert the Stock object into a BSON format that MongoDb can store.
   */
  def buildMongoDbObjectFromStock(stock: Stock): MongoDBObject = {
    val builder = MongoDBObject.newBuilder
    builder += "name" -> stock.name
    builder += "symbol" -> stock.symbol
    builder.result
  }
}

