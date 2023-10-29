import java.util.ArrayList;
import java.util.HashMap;

public class App {

    public static void majorityElement(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++) {

            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else {
                map.put(arr[i], 1);
            }
        }

        for(int key : map.keySet()) {
            if(map.get(key) > arr.length/3) {
                System.out.println(key);
            }
        }

    }

    public static void main(String[] args) throws Exception {
        int arr[] = {1, 2};

        majorityElement(arr);
    }
}
