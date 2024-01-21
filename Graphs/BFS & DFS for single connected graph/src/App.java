import java.util.*;

// This is the code of graph for undirected and unweighted graph.

public class App {
    public static class Edge {
        int src;
        int dest;

        public Edge (int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));
    }

    public static void BFS(ArrayList<Edge> graph[], boolean visited[], int start) {
        Queue<Integer> q = new LinkedList<>();

        q.add(start);   // We add the first node in the queue manually.

        while(!q.isEmpty()) {
            int curr = q.remove();

            if(visited[curr] == false) {    //checking if the node is already visited or not.
                System.out.println(curr + " ");
                visited[curr] = true;

                // Put all the neighbours of the current node in the queue.
                for(int i=0; i<graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);

                    q.add(e.dest);
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);

        boolean visited[] = new boolean[graph.length];  // Boolean array contains all index as false;
        for(int i=0; i<graph.length; i++) {     // For broken graphs
            if(visited[i] == false)
                BFS(graph, visited, i);
        }
        
    }
}
