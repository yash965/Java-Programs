import java.util.Stack;

public class App {

    public static void PushAtBottom (Stack<Integer> s, int data) {
        if(s.isEmpty()) {
            s.push(data);
            return;
        }

        int m = s.pop();
        PushAtBottom(s, data);
        s.push(m);
    }

    public static void Reverse (Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }

        int m = s.pop();
        Reverse(s);
        PushAtBottom(s, m);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        Reverse(stack);
        
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}