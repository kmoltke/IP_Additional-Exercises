import java.util.HashMap;
import java.util.Map;

/**
 * DinoDatabase
 */
public class DinoDatabase {
    private Map<String, Integer> db;

    public DinoDatabase() {
        db = new HashMap<>();
    }

    public int size() {
        return db.size();
    }

    public void addDino(String name, int weight) {
        if (db.containsKey(name)) {
            System.out.println(name + " cannot be added. It is already in the database!");
        } else {
            db.put(name, weight);
            System.out.println(name + " added. Weight: " + weight + "kg");
        }
    }
    
}