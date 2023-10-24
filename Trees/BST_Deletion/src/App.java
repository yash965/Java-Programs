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

    public static Node delete(Node root, int data) {
        if(root.data > data) {
            root.left = delete(root.left, data);
            return root;
        }

        else if(root.data < data) {
            root.right = delete(root.right, data);
        }

        else {
            if(root.right == null && root.left == null) {
                return null;
            }

            if(root.left == null) {
                return root.right;
            }
            else if(root.right == null) {
                return root.left;
            }

            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }

        return root;
    }

    public static Node inorderSuccessor(Node root) {
        while(root.left != null) {
            root = root.left;
        }

        return root;
    }

    public static void inorder(Node root) {
        if(root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }


    public static void main(String[] args) throws Exception {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};

        Node root = null;
        for(int i=0; i<values.length; i++) {
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();

        delete(root, 4);

        inorder(root);

    }
}
