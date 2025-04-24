import com.mongodb.client.*;
import org.bson.Document;

import java.util.Map;

public class ReadLocatorExample {
    public static void main(String[] args) {
        try (MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017")) {
            MongoDatabase db = mongoClient.getDatabase("your_database");
            MongoCollection<Document> collection = db.getCollection("your_collection");

            Document doc = collection.find(new Document("page", "LoginPage")).first();

            if (doc != null && doc.containsKey("locators")) {
                Document locators = (Document) doc.get("locators");

                for (Map.Entry<String, Object> entry : locators.entrySet()) {
                    String fieldName = entry.getKey(); // e.g., "username"
                    Document locator = (Document) entry.getValue(); // {type: ..., value: ...}

                    String type = locator.getString("type");
                    String value = locator.getString("value");

                    System.out.println("Field: " + fieldName);
                    System.out.println("  Type : " + type);
                    System.out.println("  Value: " + value);
                }
            } else {
                System.out.println("No 'locators' field found.");
            }
        }
    }
}
