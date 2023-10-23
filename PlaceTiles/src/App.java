public class App {

    public static int PlaceTiles(int n, int m) {
        
        if(m==n) {
            return 2;
        }

        if(n<m) {
            return 1;
        }

        // For Horizontal tiles
        int Horizontal = PlaceTiles(n-1, m);

        // For Vertical tiles
        int Vertical = PlaceTiles(n-m, m);

        return Horizontal + Vertical;
    }

    public static void main(String[] args) {
        System.out.println(PlaceTiles(4, 2));
        
    }
}
