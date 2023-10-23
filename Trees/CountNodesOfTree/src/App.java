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

        public static int CountNodes (Node root) {
            if(root == null) {
                return 0;
            }

            int leftCount = CountNodes(root.left);
            int rightCount = CountNodes(root.right);
            return leftCount + rightCount +1;
        }

        public static int sumOfNodes (Node root) {
            if(root == null) {
                return 0;
            }

            int leftSum = sumOfNodes(root.left);
            int rightSum = sumOfNodes(root.right);
            return leftSum + rightSum + root.data;        
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
