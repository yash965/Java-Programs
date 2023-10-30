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

        public int hashFunction(K key) {
            int bi = key.hashCode();

            return Math.abs(bi) % N;
        }

        public int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];

            for(int i=0; i<ll.size(); i++) {
                if(ll.get(i).key == key) {
                    return i;
                }
            }

            return -1;
        }

        public void put(K key, V value) {
            int bi = hashFunction(key);     //bucket index
            int di = searchInLL(key, bi);       //data index

            if(di == -1) {
                buckets[bi].add(new Node(key, value));
                n++;
            }
            else {
                Node node = buckets[bi].get(di);
                node.value = value;
            }

            //Lambda function for rehashing here
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if(di == -1) {
                return false;
            }
            else {
                return true;
            }

        }

        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if(di == -1) {
                return null;
            }
            else {
                Node node = buckets[bi].remove(di);
                n--;

                return node.value;
            }
        }

        public V get(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if(di == -1) {
                return null;
            } else {
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();

            for(int i=0; i<buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for(int j=0; j< ll.size(); j++) {
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }

            return keys;
        }

        public boolean isEmpty() {
            return n == 0;
        }

    }


}
 