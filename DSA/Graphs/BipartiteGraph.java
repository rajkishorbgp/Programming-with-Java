/*
 *                                  @Bipartite Graph
 *     A Bipartite Graph is a graph whose vertices can be divided into two independent sets, U and V
 *     such that every edge (u, v) either connects a vertex form U to V or a Vertex from V to U. in 
 *     other worlds, for every edge(u,v), either u belongs to U and v, or u belongs to V and v to U.
 *     We can also say that there is no edge that connects vertices of same set.
 */

import java.util.*;
import java.util.LinkedList;

public class BipartiteGraph {
    static class Edge {
        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void bfs(ArrayList<Edge>[] graph) {
        boolean[] vis = new boolean[graph.length];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!vis[curr]) {
                System.out.print(curr + " ");
                vis[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }

        }
    }

    public static boolean isBipartite(ArrayList<Edge>[] graph) {
        int col[] = new int[graph.length];
        for (int i = 0; i < col.length; i++) {
            col[i] = -1; // no color
        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < graph.length; i++) {
            if (col[i] == -1) { // BFS
                q.add(i);
                col[i] = 0; // yellow
                while (!q.isEmpty()) {
                    int curr = q.remove();
                    for (int j = 0; j < graph[curr].size(); j++) {
                        Edge e = graph[curr].get(j);
                        if (col[e.dest] == -1) {
                            int nextCol = col[curr] == 0 ? 1 : 0;
                            col[e.dest] = nextCol;
                            q.add(e.dest);
                        } else if (col[curr] == col[e.dest]) {
                            return false; // NOT bipartite
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge>[] graph = new ArrayList[v];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // 0 Edge
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        // 1 Edge
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        // 2 Edge
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        // 3 Edge
        graph[3].add(new Edge(3, 1));
        // graph[3].add(new Edge(3, 4));

        // 4 Edge
        // graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 2));

        System.out.println(isBipartite(graph));

    }

}

/*
 * Output:
 * true
 */