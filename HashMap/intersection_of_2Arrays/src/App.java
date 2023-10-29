import java.util.HashMap;

public class App {

    public static int intersection(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr1.length; i++) {
            if(!map.containsKey(arr1[i])) {
                map.put(arr1[i], 1);
            }
        }

        for(int i=0; i<arr2.length; i++) {
            if(map.contains(arr2[i])) {
                map.remove(arr2[i]);
            }
            else {
                map.add(arr2[i]);
            }
        }

        return map.size();
    }

    public static void main(String[] args) throws Exception {
        
    }
}
