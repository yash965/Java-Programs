public class App {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static Node BuildTree(Node root, int data) {
        if(root == null) {
            root = new Node(data);
            return root;
        }

        if(root.data > data) {
            root.left = BuildTree(root.left, data);
        }
        else {
            root.right = BuildTree(root.right, data);
        }

        return root;
    }

    static void Inorder(Node root) {
        if(root == null) {
            return;
        }

        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    public static void main(String[] args) throws Exception {
        int arr[] = {5,1,3,4,2,7};

        Node root = null;

        for(int i=0; i<arr.length; i++) {
            root = BuildTree(root, arr[i]);
        }

        Inorder(root);
    }
}
