public class App {

    public static boolean SortArray(int arr[], int n) {

        if(n == arr.length-1) {
            return true;
        }

        if(arr[n] < arr[n+1]) {
            return SortArray(arr, n+1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) throws Exception {
        int arr[] = {1,2,3,6,5};
        System.out.println(SortArray(arr, 0));
    }
}
