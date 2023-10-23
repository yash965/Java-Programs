public class App {
    Node head;

    class Node {
        int data;
        Node next;
    }

    void insert(int x) {
        Node newNode = new Node();
        newNode.data = x;
        newNode.next = null;

        if(head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    void ReverseALink() {
        if(head == null) {
            System.out.println("Empty linked list");
            return;
        }

        Node currNode, nextNode;
        currNode = head.next;
        nextNode = currNode;
        head.next = null;

        while(currNode != null) {
            nextNode = nextNode.next;
            currNode.next = head;

            head = currNode;
            currNode = nextNode;
        }
    }

    void Display() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        App a1 = new App();
        a1.insert(5);
        a1.insert(4);
        a1.insert(3);
        a1.insert(2);
        a1.insert(1);
        a1.Display();

        a1.ReverseALink();
        a1.Display();

    }

    
     
}
