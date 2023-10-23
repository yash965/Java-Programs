public class App {

    static class Node {
        int data;
        Node right;
        Node left;

        Node (int d) {
            data = d;
            this.right = null;
            this.left = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree (int nodes[]) {
            idx++;

            if(nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);    //root
            newNode.left = buildTree(nodes);        //left
            newNode.right = buildTree(nodes); 
            return newNode;
        }


        // preorder
        public static void preOrderTraversal (Node rootNode) {
            if(rootNode == null)
                return;

            System.out.println(rootNode.data);
            preOrderTraversal(rootNode.left);
            preOrderTraversal(rootNode.right);
        }

        // Inorder
        public static void InorderTraversal(Node rootNode) {
            if(rootNode == null) {
                return;
            }

            InorderTraversal(rootNode.left);
            System.out.println(rootNode.data);
            InorderTraversal(rootNode.right);
        }

        // PostOrder
        public static void PostOrder (Node rootNode) {
            if(rootNode == null) {
                return;
            }

            PostOrder(rootNode.left);
            PostOrder(rootNode.right);
            System.out.println(rootNode.data);
        }
    }

    public static void main(String[] args) throws Exception {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        tree.PostOrder(root);
    }
}
