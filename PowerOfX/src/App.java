public class App {

    public static int PowerNum(int x, int n){
       
        if(n == 1){
            return x;
        }

        return x * PowerNum(x, n-1);
    }

    public static void main(String[] args) throws Exception {
        System.out.println(PowerNum(5, 3)); 
    }
}
