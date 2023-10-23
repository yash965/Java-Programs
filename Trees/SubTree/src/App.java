public class App {

    static class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data = data;
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

    public static boolean isIdentical(Node root, Node subroot) {
        if(root == null && subroot == null) {
            return true;
        }

        if(root == null || subroot == null) {
            return false;
        }

        if(root.data == subroot.data)
            return isIdentical(root.left, subroot.left) && isIdentical(root.right, subroot.right);
    
        return false;
    }

    public static boolean subTree (Node root, Node subroot) {
        if(subroot == null) {
            return true;
        }

        if(root == null) {
            return false;
        }

        if(isIdentical(root, subroot)) {
            return true;
        }

        return subTree(root.left, subroot) || subTree(root.right, subroot);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
