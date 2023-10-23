package CSE1007.MathProcess;

public class FibonacciSeries {
    int num;

    FibonacciSeries (int n) {
        num = n;
    }

    void fiboSeries (int n) {
        if(n == 1){
            System.out.println(0);
            return;
        }
        else if(n==2) {
            System.out.println(0 + " " + 1);
            return;
        }

        int a=0, b=1;
        System.out.println(a + " " + b + " ");

        for(int i=3; i<n; i++) {
            a = b;
            b = a+b;
            System.out.println(b + " ");
        }

    }
}