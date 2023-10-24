public class App {

    static class Node {
        int data;
        Node left;
        Node right;

        Node (int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static Node insert(Node root, int data) {
        if(root == null) {
            root = new Node(data);
            return root;
        }

        if(root.data > data) {
            root.left = insert(root.left, data);
        }

        else {
            root.right = insert(root.right, data);
        }

        return root;
    }

    public static boolean search(Node root, int key) {
        if(root == null) {
            return false;
        }

        if(root.data > key) {
            return search(root.left, key);
        }

        else if(root.data == key) {
            return true;
        }

        else {
            return search(root.right, key);
        }
    }
    public static void main(String[] args) throws Exception {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};

        Node root = null;
        for(int i=0; i<values.length; i++) {
            root = insert(root, values[i]);
        }

        if(search(root, 5)){
            System.out.println("key found");
        }

        else {
            System.out.println("key not found");
        }

    }
}
