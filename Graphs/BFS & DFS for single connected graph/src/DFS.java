import java.util.*;

public class DFS {
    public static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
        
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean visited[]) {
        if(visited[curr] == false) {
            System.out.print(curr + " ");
            visited[curr] = true;

            for(int i=0; i<graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                dfs(graph, e.dest, visited);
            }
        }
    }

    public static void main(String[] args) {
        int V = 7;

        // This declaration can be interpreted as, on the LHS multiple arraylist of edge type are
        // created and on the RHS it is stored in a simple arrayList.
        ArrayList<Edge> graph[] = new ArrayList[V]; 
        boolean visited[] = new boolean[V];

        createGraph(graph);

        Edge e = graph[0].get(0);

        dfs(graph, e.src, visited);
    }
}
