public class App {

    public static void Divide(int[] arr, int si, int ei) {
        if(si>ei) {
            return;
        }

        int mid = si + (ei - si)/2;
        Divide(arr, si, mid);
        Divide(arr, mid+1, ei);
        Conquer(arr, si, ei, mid);
    }

    public static void Conquer(int[] arr, int si, int ei, int mid) {

        int[] merge = new int[arr.length];

        int x = 0;
        int idx1 = 0;
        int idx2 = mid+1;
        while(idx1<=mid && idx2<=arr.length-1) {
            if(arr[idx1]>=arr[idx2]) {
                merge[x++] = arr[idx1++];
            } else {
                merge[x++] = arr[idx2++];
            }
        }

        for(int i=idx1; i<=mid; i++) {
            merge[x] = arr[idx1];
        }

        for(int i=idx2; i<=arr.length-1; i++) {
            merge[x] = arr[idx2];
        }

        for(int i=0, j=si; i<merge.length; i++) {
            arr[i] = merge[i];
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
