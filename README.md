A project to test Casbah connections
====================================

This is a project to help me test Casbah connections and connection pools with MongoDB and Scala. It's configured as an SBT project.

I was having a problem where Casbah appeared to be leaking connections, as shown with this command from the command line:

    sudo lsof | grep mongod | grep TCP

However, the latest code fixed that problem, and now only one connection is used at a time (as the current code is single-threaded).


Information
-----------

The project consists of the following simple classes and objects under the src/main/scala directory:

* MainDriver.scala - an object that starts the test
* Stock.scala - a class and its companion object that does the saving
* MongoFactory.scala - a central place where i keep the MongoDB information; get the MongoConnection and MongoCollection from here

Per the docs (http://api.mongodb.org/scala/casbah/current/index.html) I'm using Casbah 2.1.5, with Scala 2.9.1.

Contact
-------

If you have any questions, you can reach me at http://alvinalexander.com

Alvin Alexander

