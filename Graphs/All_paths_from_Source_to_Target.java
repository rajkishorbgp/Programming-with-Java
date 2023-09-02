import java.util.ArrayList;

public class All_paths_from_Source_to_Target {
    static class Edge {
        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void creatGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        // 0 Edge
        graph[0].add(new Edge(0, 3));

        // 2 Edge
        graph[2].add(new Edge(2, 3));

        // 3 Edge
        graph[3].add(new Edge(3, 1));

        // 4 Edge
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        // 5 Edge
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    public static void dfs(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                dfsUtil(graph, i, vis);
            }
        }
    }

    public static void dfsUtil(ArrayList<Edge> graph[], int curr, boolean vis[]) {
        System.out.print(curr + " ");
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                dfsUtil(graph, e.dest, vis);
            }
        }

    }

    public static void printAllPath(ArrayList<Edge> graph[], int src, int dist, String path) {
        if (src == dist) {
            System.out.println(path + dist);
        }
        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            printAllPath(graph, e.dest, dist, path + src + " ");
        }
    }

    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge>[] graph = new ArrayList[v];
        creatGraph(graph);
        int s = 5;
        int d = 1;
        printAllPath(graph, s, d, "");
    }
}

/*
 * Output:
 * 5 0 3 1
 * 5 2 3 1
 */