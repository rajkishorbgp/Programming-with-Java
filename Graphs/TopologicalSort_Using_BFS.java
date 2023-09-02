/*
 *                  @Topological Sorting using BFS.
 *     Directed Acyclic Graph(DAG) is a directed graph with no cycles.
 *     Topological sorting is used only for DAGs (not for non-DAGs)
 *     It is a linear order of vertices such that every directed edge u -> v,
 *     the vertex u comes before c in the order.
 * 
 */

import java.util.*;

public class TopologicalSort_Using_BFS {
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
        // 2 Edge
        graph[2].add(new Edge(2, 3));

        // 3 Edge
        graph[3].add(new Edge(3, 1));

        // 4 Edge
        graph[4].add(new Edge(4, 0));

        // 5 Edge
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    public static void calcIndeg(ArrayList<Edge> graph[], int indeg[]) {
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                indeg[e.dest]++;
            }
        }
    }

    public static void topSort(ArrayList<Edge> graph[]) {
        int indeg[] = new int[graph.length];
        calcIndeg(graph, indeg);
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < indeg.length; i++) {
            if (indeg[i] == 0) {
                q.add(i);
            }
        }

        // bfs
        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + " ");
            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                indeg[e.dest]--;
                if (indeg[e.dest] == 0) {
                    q.add(e.dest);
                }
            }
        }
    }

    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        topSort(graph);
    }
}

/*
 * Output:
 * 4 5 0 2 3 1
 */