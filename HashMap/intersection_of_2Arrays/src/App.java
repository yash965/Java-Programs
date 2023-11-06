import java.util.HashSet;

public class App {

    public static int intersection(int[] arr1, int[] arr2) {
        HashSet<Integer> map = new HashSet<>();
        int num = 0;

        for(int i=0; i<arr1.length; i++) {
            map.add(arr1[i]);
        }

        for(int i=0; i<arr2.length; i++) {
            if(map.contains(arr2[i])) {
                map.remove(arr2[i]);
                num++;
            }
        }

        return num;
    }

    public static void main(String[] args) throws Exception {
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};

        int num = intersection(arr1, arr2);
        System.out.println(num);
    }
}
