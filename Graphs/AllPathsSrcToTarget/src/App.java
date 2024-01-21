import java.util.*;

public class App {

    public static class Edge {
        int src;
        int dest;

        public Edge (int src, int dest) {
            this.src= src;
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

    public static void allPaths(ArrayList<Edge> graph[], boolean visited[], int curr, String path, int tar) {
        if(curr == tar) {
            System.out.println(path);
            return;
        }

        for(int i=0; i<graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);

                if(visited[e.dest] == false) {
                    visited[curr] = true;

                    // There's a reason to add the path in the parameter of recursive call.
                    allPaths(graph, visited, e.dest, path+e.dest, tar);
                    visited[curr] = false;
            }
        }
            
    }

    public static void main(String[] args) throws Exception {
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);

        boolean visited[] = new boolean[V];
        String path = "0";

        allPaths(graph, visited, 0, path, 5);
    }
}
