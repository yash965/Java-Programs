package Producer_Consumer;
import java.util.Scanner;

class Q {
    String inp, term = "stop";
    boolean isSet = false;
    private boolean stopCondition = false;
    Scanner sc = new Scanner(System.in);

    public synchronized void getInput() {
        while (isSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.print("Enter a String: ");
        inp = sc.nextLine();
        isSet = true;
        notify();
    }

    public synchronized void ShowInput() {
        while (!isSet && !stopCondition) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (!stopCondition) {
            System.out.println(inp);
            isSet = false;
            notify();
        }
    }

    public synchronized void setStopCondition(boolean value) {
        stopCondition = value;
    }
}

class Teacher implements Runnable {
    Q q;

    Teacher (Q q) {
        this.q = q;
        Thread t1 = new Thread(this, "Teacher");
        t1.start();
    }

    public void run() {
        while(true) {
            q.getInput();
        }
    }
}

class Student implements Runnable {
    Q q;

    Student (Q q) {
        this.q = q;
        Thread t2 = new Thread(this, "Student");
        t2.start();
    }

    public void run() {
        while (true) {
            q.ShowInput();
            if(q.inp.equals("stop")) {
                q.setStopCondition(true);
                break;
            }
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        Q q = new Q();
        new Student(q);
        new Teacher(q);
    }
}
