import com.mongodb.client.model.Indexes;
import core.framework.mongo.MongoMigration;
import org.bson.Document;

/**
 * @author Cheffey
 */
public class Main {
    public static void main(String[] args) {
        var migration = new MongoMigration("sys.properties", "sys.mongo.adminURI");
        migration.migrate(mongo -> {
            System.out.println(mongo.runCommand(new Document()
                .append("setParameter", 1)
                .append("notablescan", 1)
                .append("help", 1)
            ));
        });
        migration = new MongoMigration("sys.properties");
        migration.migrate(mongo -> {
            mongo.createIndex("fulfillments", Indexes.ascending("order_id"));
        });
    }
}
