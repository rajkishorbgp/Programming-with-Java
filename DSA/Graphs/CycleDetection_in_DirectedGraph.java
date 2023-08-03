import java.util.ArrayList;

public class CycleDetection_in_DirectedGraph {
    static class Edge {
        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge> graph[] = new ArrayList[v];
        creatGraph(graph);
        System.out.println(isCycle(graph));
    }

    private static void creatGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // 0 Edge
        graph[0].add(new Edge(0, 2));

        // 1 Edge
        graph[1].add(new Edge(1, 0));

        // 2 Edge
        graph[2].add(new Edge(2, 3));

        // 3 Edge
        graph[3].add(new Edge(3, 0));
    }

    // graph2 -> false
    public static void creatGraph2(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // 0 Edge
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        // 1 Edge
        graph[1].add(new Edge(1, 3));

        // 2 Edge
        graph[2].add(new Edge(2, 3));
    }

    public static boolean isCycle(ArrayList<Edge>[] graph) {
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (isCycleUtil(graph, i, vis, stack)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isCycleUtil(ArrayList<Edge>[] graph, int curr, boolean[] vis,
            boolean[] stack) {
        vis[curr] = true;
        stack[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (stack[e.dest]) { // cycle
                return true;
            } else if (!vis[e.dest] && isCycleUtil(graph, e.dest, vis, stack)) {
                return true;
            }
        }

        stack[curr] = false;
        return false;
    }
}

/*
 * Output:
 * true
 */