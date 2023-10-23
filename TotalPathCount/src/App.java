public class App {

    public static int count = 0;

    public static void PathCount(int i, int j, int m, int n) {

        if(m-1==i && n-1==j) {
            count++;
            return;
        }
        
        if(m-1 != i) {
            PathCount(i+1, j, m, n);
        }

        if(n-1 != j) {
            PathCount(i, j+1, m, n);
        }

    }

    public static void main(String[] args) throws Exception {
        int m = 4, n = 4;
        PathCount(0, 0, m, n);
        System.out.println(count);
    }
}
