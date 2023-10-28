import java.util.*;

public class App {
    
    static class HashMap<K,V> {
        private class Node {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // number of Nodes
        private int N; // number of buckets
        private LinkedList<Node> buckets[];


        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];

            for(int i=0; i<4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }
    }


}
