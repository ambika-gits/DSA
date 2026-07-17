import java.util.HashMap;

public class HashMapBasics {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Apple", 100);
        map.put("Banana", 50);
        map.put("Mango", 80);

        System.out.println("Price of Apple: " + map.get("Apple"));

        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}