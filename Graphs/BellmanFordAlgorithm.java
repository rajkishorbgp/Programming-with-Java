/*
 *                       @Bellman Ford Algorithm
 *      Shortest path from the sources to all vertices(negative edges)
 */

import java.util.ArrayList;

public class BellmanFordAlgorithm {
    static class  Edge{
        int src;
        int dest;
        int wt;
        Edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void createGraph(ArrayList<Edge>[]graph){
        for (int i = 0; i < graph.length; i++) {
            graph[i]= new ArrayList<>();
        }
        //0 Edge
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));
        //1 Edge
        graph[1].add(new Edge(1, 2, -4));
        //2 Edge
        graph[2].add(new Edge(2, 3, 2));
        //3 Edge
        graph[3].add(new Edge(3, 4, 4));
        //4 Edge
        graph[4].add(new Edge(4, 1, -1));
    }

    
    public static void bellmanFord(ArrayList<Edge>graph[], int src){
        int dist[] = new int[graph.length];
        for (int i = 0; i < dist.length; i++) {
            if (i!=src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        int V = graph.length;
        for (int i = 0; i < V-1; i++) {
            for (int j = 0; j < graph.length; j++) {
                for (int k = 0; k < graph[j].size(); k++) {
                    Edge e = graph[j].get(k);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;
                    if (dist[u]!= Integer.MAX_VALUE &&dist[u]+wt < dist[v]) {
                        dist[v] = dist[u]+wt;
                    }
                    
                }       
            }
        }
        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i]+ " ");
        }
    }


    

    public static void createGraph2(ArrayList<Edge>graph){
        graph.add(new Edge(0, 1, 2));
        graph.add(new Edge(0, 2, 4));
        graph.add(new Edge(1, 2, -4));
        graph.add(new Edge(2, 3, 2));
        graph.add(new Edge(3, 4, 4));
        graph.add(new Edge(4, 1, -1));
    }

    public static void bellmanFord2(ArrayList<Edge>graph, int src, int V){
        int dist[] = new int[V];
        for (int i = 0; i < dist.length; i++) {
            if (i!=src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }
        for (int i = 0; i < V-1; i++) {
            for (int k = 0; k < graph.size(); k++) {
                Edge e = graph.get(k);
                int u = e.src;
                int v = e.dest;
                int wt = e.wt;
                if (dist[u]!= Integer.MAX_VALUE &&dist[u]+wt < dist[v]) {
                    dist[v] = dist[u]+wt;
                }
                
            }       
        }
        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i]+ " ");
        }
    }

    public static void main(String[] args) {
        int v=5;
        // ArrayList<Edge> []graph = new ArrayList[v];

        ArrayList<Edge> graph2 = new ArrayList<>();

        // createGraph(graph);
        createGraph2(graph2);
        bellmanFord2(graph2, 0, v);
    }
}

/*
 *  Output:
 *  0 2 -2 0 4 
 */