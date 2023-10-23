import java.util.Stack;

public class App {

    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    public static void add (int data) {
        while(!s1.isEmpty()) {
            s2.add(s1.pop());
        }

        s1.push(data);

        while(!s2.isEmpty()) {
            s1.add(s2.pop());
        }
    }

    public static int remove () {
        return s1.pop();
    }

    public static int peek () {
        return s1.peek();
    }

    public static void main(String[] args) throws Exception {
        add(1);
        add(2);
        add(3);
        add(4);

        while(!s1.isEmpty()) {
            System.out.println(peek()); 
            remove();
        }

    }
}
