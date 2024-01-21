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

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    public static void topSortUtil(ArrayList<Edge> graph[], boolean visited[], int curr, Stack<Integer> stack) {
        visited[curr] = true;

        for(int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if(!visited[i]) {
                topSortUtil(graph, visited, e.dest,stack);
            }
        }

        stack.push(curr);
    }

    public static void topSort(ArrayList<Edge> graph[]) {
        boolean visited[] = new boolean[graph.length];
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<graph.length; i++) {
            if(!visited[i])
                topSortUtil(graph, visited, i, stack);
        }

        while(!stack.isEmpty()) {
            System.out.println(stack.pop() + " ");
        }
    }

    public static void main(String[] args) throws Exception {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);
        topSort(graph);
    }
}
