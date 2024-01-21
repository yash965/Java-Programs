package Producer_Consumer;
import java.util.Scanner;

class Q {
    String inp;
    boolean isSet = false;
    Scanner sc = new Scanner(System.in);

    public synchronized void getInput() {
        while (isSet) {
            try {
                wait();
            } catch (Exception e) {}
        }

        System.out.print("Enter a String: ");
        String input = sc.next();

        this.inp = input;
        isSet = true;
        notify();
    }

    public synchronized void ShowInput() {
        while (!isSet) {
            try {
                wait();
            } catch (Exception e) {}
        }
        System.out.println(inp);
        isSet = false;
        notify();
    }
}

class Teacher implements Runnable {
    Q q;

    Teacher (Q q) {
        this.q = q;
        Thread t = new Thread(this, "Teacher");
        t.start();
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
        Thread t = new Thread(this, "Student");
        t.start();
    }

    public void run() {
        while (true) {
            q.ShowInput();
        }
    }
}

public class App {
    public static void main(String[] args) {
        Q q = new Q();
        new Student(q);
        new Teacher(q);
    }
}
