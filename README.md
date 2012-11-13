A project to test Casbah connections
====================================

This is a project to help me test Casbah connections and connection pools with MongoDB and Scala. It's configured as an SBT project.


Information
-----------

The project consists of the following simple classes and objects under the src/main/scala directory:

* MainDriver.scala - an object that starts the test
* Stock.scala - a class and its companion object that does the saving
* MongoFactory.scala - a central place where i keep the MongoDB information; get the MongoConnection and MongoCollection from here


