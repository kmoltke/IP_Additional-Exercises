import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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

    public void updateDino(String name, int weight) {
        if (db.containsKey(name)) {
            db.put(name, weight);
            System.out.println(name + " updated. Weight: " + weight + "kg");
        } else {
            System.out.println(name + " cannot be updated. It is not in the database!");
        }
    }

    public void removeDino(String name) {
        String msg = db.remove(name) == null ? name + " cannot be removed. It is not in the database!" : name + " removed";
        System.out.println(msg);
    }

    public int getWeight(String name) {
        if (db.containsKey(name)) {
            return db.get(name);
        } else {
            System.out.println(name + " cannot be found in the database!");
            return 0;
        }
    }

    public Set<String> getDinoNames() {
        return db.keySet();
    }

    /**
     * @source https://stackoverflow.com/questions/5911174/finding-key-associated-with-max-value-in-a-java-map
     */
    public String getHeaviest() {
        // int max = db.entrySet().stream()
        //             .map(d -> d.getValue())
        //             .max(Integer::compare).get();
        String output = db.isEmpty() ? "" : db.entrySet().stream()
                                                .max((d1, d2) -> Integer.compare(d1.getValue(), d2.getValue()))
                                                .get()
                                                .getKey();
        return output;
    }

    public static void main(String[] args) {
        DinoDatabase ddb = new DinoDatabase();
        ddb.addDino("testDino1", 25);
        ddb.addDino("testDino2", 0);
        ddb.addDino("testDino3", 50);
        ddb.addDino("testDino4", 4);
        System.out.println(ddb.getHeaviest());
    }
}