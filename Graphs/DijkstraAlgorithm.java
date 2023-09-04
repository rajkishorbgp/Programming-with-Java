/*
 *                 @Dijkstra's Algorithm
 *   Shortest path from the source to all vertices (weighted graph)
 */

import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijkstraAlgorithm {
    static class Edge{
        int src;
        int dest;
        int wt;
        Edge(int src, int dest, int wt){
            this.src=src;
            this.dest=dest;
            this.wt=wt;
        }
    }

    public static void createGraph(ArrayList<Edge>[]graph){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        // 0 Edge
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        //1 Edge
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 7));

        //2 Edge
        graph[2].add(new Edge(2, 4, 3));

        //3 Edge
        graph[3].add(new Edge(3, 5, 1));

        //4 Edge
        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }
    
    static class Pair implements Comparable<Pair>{
        int n;
        int path;
        Pair(int n, int path){
            this.n=n;
            this.path=path;
        }

        @Override
        public int compareTo(Pair p2){
            return this.path - p2.path; 
        }
    }

    public static void Dijkstra(ArrayList<Edge> graph[], int src){
        int dist[] = new int[graph.length]; 
        for (int i = 0; i < dist.length; i++) {
            if(i!=src){
                dist[i] = Integer.MAX_VALUE;
            }
        }


        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));

        //loop
        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (!vis[curr.n]) {
                vis[curr.n] = true;
                //neighbours
                for (int i = 0; i < graph[curr.n].size(); i++) {
                    Edge e = graph[curr.n].get(i);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;

                    if (dist[u]+wt <dist[v]) {
                        dist[v] = dist[u] + wt;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }
        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i]+" ");
        }
    }

    public static void main(String[] args) {
        int v=6;
        ArrayList<Edge> []graph = new ArrayList[v];
        createGraph(graph);
        Dijkstra(graph, 0);
    }
}


/*
 *   Output:
 *   0 2 3 8 6 9
 */