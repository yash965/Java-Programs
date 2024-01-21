import java.util.*;

public class App {

    static class Edge {
        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 0));

        graph[3].add(new Edge(3, 2));
    }

    public static boolean dfs(ArrayList<Edge> graph[], boolean visited[], int curr, boolean rec[]) {
        visited[curr] = true;
        rec[curr] = true;

        for(int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if(rec[e.dest]) {
                return true;
            } else if(!visited[e.dest]) {
                if(dfs(graph, visited, e.dest, rec)) {
                    return true;
                }
            }
        }

        rec[curr] = false;
        return false;
    }

    public static void main(String[] args) throws Exception {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        boolean visited[] = new boolean[V];
        boolean rec[] = new boolean[V];
        boolean ans;

        createGraph(graph);
        
        for(int i=0; i<V; i++) {
            if(!visited[i]) {
                ans = dfs(graph, visited, i, rec);
                if(ans) {
                    System.out.println(ans);
                    break;
                }
            }
        }

    }
}
