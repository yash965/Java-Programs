package CSE1007.StatProcess;
import java.util.Scanner;

public class Mean {
    int n;
    int num[];

    Mean (int n, int num[]) {
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

    int findMean (int num[], int n) {
        int mean = 0;
        for(int i=0; i<n; i++) {
            mean = mean + num[i];
        }
        mean = mean/n;
        return mean;
    }
}
