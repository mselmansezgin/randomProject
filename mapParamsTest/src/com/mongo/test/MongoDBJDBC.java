package com.mongo.test;

import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.WriteConcern;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.DBCursor;

import com.mongodb.ServerAddress;
import java.util.Arrays;

public class MongoDBJDBC {

   public static void main( String args[] ) {
	
      try{
		
         // To connect to mongodb server
         MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
			
         // Now connect to your databases
         DB db = mongoClient.getDB( "test" );
         System.out.println("Connect to database successfully");
         char[] pass = new char[4];
         
         pass = "root".toCharArray();
         
         boolean auth = db.authenticate("root", pass);
         
         System.out.println("Authentication: "+auth);
         
         DBCollection coll = db.createCollection("mycol1",null);
         
         
         BasicDBObject doc = new BasicDBObject("title", "MongoDB").
                 append("description", "database").
                 append("likes", 100).
                 append("url", "http://www.tutorialspoint.com/mongodb/").
                 append("by", "tutorials point");
         
         
         
         
         
         System.out.println("Collection created successfully"+coll.find());
         coll.insert(doc);
         
         BasicDBObject doc2 = new BasicDBObject("Randomize", "MongoDB").
                 append("month", "Ocak").
                 append("year", 2017).
                 append("hour", 12).
                 append("minute", 60);        
         
         System.out.println("Collection created successfully"+coll.find());
         coll.insert(doc2);
         
         BasicDBObject doc3 = new BasicDBObject("Perspektif", "MongoDB").
                 append("Ruhsat", "Keyfi Davranış");        
         
         System.out.println("Collection created successfully"+coll.find());
         coll.insert(doc3);
         System.out.println("Document inserted successfully");
			
      }catch(Exception e){
         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      }
   }
}
