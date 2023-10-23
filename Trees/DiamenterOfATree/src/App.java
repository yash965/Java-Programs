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
    }

        static class NodeInfo {
            int diam;
            int ht;

            NodeInfo (int diam, int ht) {
                this.diam = diam;
                this.ht = ht;
            }
        }
        

        public static NodeInfo diameter (Node root) {
            if(root == null) {
                return new NodeInfo(0, 0);
            }

            NodeInfo leftTI = diameter(root.left);
            NodeInfo rightTI = diameter(root.right);

            int myHeight = Math.max(leftTI.ht, rightTI.ht) +1;

            int diam1 = leftTI.ht + rightTI.ht + 1;
            int diam2 = leftTI.diam;
            int diam3 = rightTI.diam;
            
            int myDiam = Math.max(diam1, Math.max(diam2, diam3));

            return new NodeInfo(myDiam, myHeight);
        }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node rootNode = tree.buildTree(nodes);

        System.out.println();
        System.out.println(diameter(rootNode).diam);
    }
}