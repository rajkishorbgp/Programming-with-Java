/*
 *                    Cycle Detection
 * 
 *  
 *           (1)----(0)-----(3)
 *              \    |       |
 *                \  |       |
 *                  (2)     (4)
 */

import java.util.*;
import java.util.LinkedList;

public class CycleDetection {
    static class Edge {
        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        // 0 Edge
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 3));

        // 1 Edge
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        // 2 Edge
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        // 3 Edge
        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        // 4 Edge
        graph[4].add(new Edge(4, 3));

    }

    public static boolean detectCycle(ArrayList<Edge>[] graph) {
        boolean vis[] = new boolean[graph.length];
        for (int i = 0; i < vis.length; i++) {
            if (!vis[i]) {
                if (detectCycleUtil(graph, vis, i, -1)) {
                    return true;
                }
            }

        }
        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean vis[], int curr, int par) {
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            // case: 3
            if (!vis[e.dest]) {
                if (detectCycleUtil(graph, vis, e.dest, curr)) {
                    return true;
                }
            }
            // case: 1
            else if (vis[e.dest] && e.dest != par) {
                return true;
            }
            // case: 2 -> do nothiing -> continue
        }
        return false;
    }

    public static void bfs(ArrayList<Edge>[] graph) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[graph.length];
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

    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        // bfs(graph);
        System.out.println(detectCycle(graph));
    }
}

/*
 * Output:
 * True
 */