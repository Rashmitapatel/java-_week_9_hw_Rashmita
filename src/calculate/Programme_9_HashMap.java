package calculate;
/*Create a HashMap object called people that will store String keys and Integer
        values: And use for each loop to iterate the value from Map.*/
import java.util.HashMap;
import java.util.Map;

public class Programme_9_HashMap {
    public static void main(String[] args) {
        Map<String, Integer> people = new HashMap<>();
        people.put("John", 32);
        people.put("Mike", 28);
        people.put("Sarah", 25);

        for (Map.Entry<String, Integer> entry : people.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
