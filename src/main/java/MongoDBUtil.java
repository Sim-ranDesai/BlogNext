import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class MongoDBUtil {

    private static final String connectionString = "mongodb+srv://blognest:blognest123@cluster0.xxexgvi.mongodb.net/?retryWrites=true&w=majority";
    private static final String databaseName = "BlogNext";

    private static MongoClient mongoClient;
    private static MongoDatabase database;

    static {
        mongoClient = MongoClients.create(connectionString);
        database = mongoClient.getDatabase(databaseName);
        System.out.println("Connected to MongoDB database: " + databaseName);
    }

    public static MongoDatabase getDatabase() {
        return database;
    }
}
