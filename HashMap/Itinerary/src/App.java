import java.util.HashMap;

public class App {

    public static String getStart(HashMap<String, String> tick) {
        HashMap<String, String> revMap = new HashMap<>();

        for(String key : tick.keySet()) {
            revMap.put(tick.get(key), key);     // Reversing a HashMap
        }

        for(String key : tick.keySet()) {
            if(!revMap.containsKey(key)) {
                return key;
            }
        }

        return null;
    }

    public static void main(String[] args) throws Exception {
        HashMap<String, String> map = new HashMap<>();

        map.put("Chennai", "Bengaluru");
        map.put("Mumbai", "Delhi");
        map.put("Goa", "Chennai");
        map.put("Delhi", "Goa");

        String start = getStart(map);
        
        while(map.containsKey(start)) {
            System.out.print(start + "->");
            start = map.get(start);
        }
        System.out.println(start);
    }
}
