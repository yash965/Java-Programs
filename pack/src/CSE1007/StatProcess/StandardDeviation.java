package CSE1007.StatProcess;
import java.util.Scanner;

public class StandardDeviation {
    int n;
    int num[];

    StandardDeviation (int n, int num[]) {
        this.n = n;
        num = new int[n];
    }

    void getInput (int n, int num[]) {
        System.out.println("Enter " + n + "numbers");
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<n; i++) {
            num[i] = sc.nextInt();
        }
    }

    float stdDev (int n, int num[]) {
        int sum = 0;
        for(int i=0; i<n; i++) {
            sum = sum + num[i];
        }
        int mean = sum/n;

        for(int i=0; i<n; i++) {
            sum += (mean - num[i]);
        }

        int std = sum/n;
        return std;
    }
}

