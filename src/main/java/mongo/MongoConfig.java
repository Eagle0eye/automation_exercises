package database;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class MongoConfig {
   private static volatile MongoConfig instance;
    private static MongoDatabase mongoDatabase;

   private MongoConfig() {}

   public static MongoDatabase MongoDatabase() {
      if (instance == null) {
         synchronized (MongoConfig.class) {
            if (instance == null) {
               instance = new MongoConfig();
               instance.initializeDatabase();
            }
         }
      }
      return mongoDatabase;
   }

   private void initializeDatabase() {
      String host = "localhost";
      int port = 27017;
      String database = "automation";

      MongoClient mongoClient = MongoClients.create("mongodb://" + host + ":" + port);
      mongoDatabase = mongoClient.getDatabase(database);
   }
}
