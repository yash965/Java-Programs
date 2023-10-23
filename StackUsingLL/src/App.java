public class App {

    private static class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static class stack {
        public static Node head;        // static because I want only one head

        public void push (int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }

        }

        public int pop () {
            if (head == null) {
                System.out.println("stack is empty");
                return -1;
            }

            Node top = head;
            head = head.next;
            return top.data;
        }

        public int peek () {
            if (head == null) {
                System.out.println("stack is empty");
                return -1;
            }

            Node top = head;
            return top.data;
        }
    }


    public static void main(String[] args) throws Exception {
        stack s = new stack();
    }
}
