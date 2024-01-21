import java.util.Scanner;

public class ProducerConsumer {
    public static void main(String[] args) {
        Q q = new Q();
        new Student(q);
        new Teacher(q);
    }
}


class Q {
    String name;
    Scanner sc = new Scanner(System.in);
    boolean isSet = false;
    boolean stopRequested = false;

    synchronized void showInput() {
        while(!isSet && !stopRequested) {
            try{
                wait();
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
            
        }
        if(!stopRequested) {
            System.out.println("String: " + name);
            isSet = false;
            notify();
        }
    }

    synchronized void getInput() {
        while(isSet || stopRequested) {
            try{
                wait();
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.print("Enter string: ");
        name = sc.nextLine();

        if(name.equalsIgnoreCase("stop")) {
            stopRequested = true;
        } else {
            isSet = true;
            notify();
        }
    }
}

class Teacher implements Runnable {
    Q q;

    Teacher(Q q) {
        this.q = q;
        Thread t1 = new Thread(this, "Teacher");
        t1.start();
    }

    public void run() {
        while (!q.stopRequested) {
            q.getInput();
        } 
    }
}

class Student implements Runnable{
    Q q;

    Student(Q q) {
        this.q = q;
        Thread t2 = new Thread(this, "Student");
        t2.start();
    }

    public void run() {
        while (!q.stopRequested) {
            q.showInput();
        } 
    }
}

