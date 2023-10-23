import java.util.LinkedList;
import java.util.Queue;

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

        public static Node buildTree (int nodes[]) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        public static void LevelTranversal (Node rootNode) {
            if(rootNode == null) {
                return;
            }

            Queue<Node> queue = new LinkedList<>();
            queue.add(rootNode);
            queue.add(null);

            while(!queue.isEmpty()) {
                Node tempNode = queue.remove();

                if(tempNode == null) {
                    System.out.println();
                    
                    if(queue.isEmpty()){
                        break;
                    } 
                    else {
                        queue.add(null);
                    }
                }
                else {
                    System.out.print(tempNode.data + " ");

                    if(tempNode.left != null)
                        queue.add(tempNode.left);

                    if(tempNode.right != null)
                        queue.add(tempNode.right);
                    
                }

            }
        }
    }

    public static void main(String[] args) throws Exception {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        
        Node root = tree.buildTree(nodes);
        tree.LevelTranversal(root);

    }
}
