public class App {

    // Take code from Leetcode

     Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            next = null;
        }
    }

    void addFirst(String data) {
        if(head == null) {
            System.out.println("Empty list");
            return;
        }

        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

    void addLast(String data) {
        if(head == null) {
            System.out.println("Empty list");
            return;
        }

        Node temp = head, new_Node = new Node(data);
        new_Node.data = data;
        new_Node.next = null;

        while(temp.next != null) {
            temp = temp.next;
        }

        temp.next = new_Node;
    }

    Node DelNFromEnd(int n) {
        if(head == null) {
            System.out.println("Empty list");
            return null;
        } else if(head.next == null) {
            return null;
        }

        int s=0, iterTill;
        Node temp = head;
        while(temp != null) {
            s++;
            temp = temp.next;
        }

        if(s == n) {
            return head.next;
        }

        iterTill = s-n;
        temp = head;

        for(int i=0; i<iterTill; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        return head;
    }

    public static void main(String[] args) throws Exception {
        App a = new App();
    }
}
