public class App {

    public static int Partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low-1;

        for(int j=0; j<high-1; j++) {
            if(pivot>arr[j]) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        arr[high] = arr[i];
        arr[i] = pivot;
        return i;

    }

    public static void QuickSort(int[] arr, int low, int high) {
        if(high > low){
            int pivot = Partition(arr, low, high);

            QuickSort(arr, low, pivot-1);
            QuickSort(arr, pivot+1, high);  
        }

    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
