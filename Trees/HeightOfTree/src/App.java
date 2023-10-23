public class App {

    static class Node {
        int data;
        Node left;
        Node right;
        Node (int d) {
            data = d;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree (int[] nodes) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);

            System.out.println(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        public static int HeightOfTree (Node root) {
            if(root == null) {
                return 0;
            }

            int leftHeight = HeightOfTree(root.left);
            int rightHeight = HeightOfTree(root.right);
            return Math.max(leftHeight, rightHeight) +1;
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
