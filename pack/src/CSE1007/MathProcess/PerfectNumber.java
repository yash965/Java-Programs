package CSE1007.MathProcess;

public class PerfectNumber {
    int num;

    PerfectNumber (int n) {
        num = n;
    }

    boolean perfectNum (int n) {
        if(n==0) {
            return false;
        }

        int perNum=1;

        for(int i=1; i<n; i++) {
            if(n%i == 0)
                perNum = perNum*i;
        }

        if(perNum == n) {
            return true;
        } else {
            return false;
        }
    }
}
