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
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        PushAtBottom(stack, 0);
        
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
