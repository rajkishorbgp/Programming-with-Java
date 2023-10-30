/*
 *    Given a route containing 4 directions(E, W, N, S), 
 *    find the shortest path to reach destination.
 *    path -> (WNEENESENNN)
 */
public class FindShortestPath {
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        Double dest = getShortPath(path);
        System.out.println(dest);
    }

    private static Double getShortPath(String path) {
        int x=0;
        int y=0;
        for (int i = 0; i < path.length(); i++) {
            char ch = path.charAt(i);
            if (ch=='E') {
                x++;
            }
            if (ch=='W') {
                x--;
            }
            if (ch=='N') {
                y++;
            }
            if (ch=='S') {
                y--;
            }
        }
        int X = x*x;
        int Y = y*y;
        return Math.sqrt(X+Y);
    }
}

/*
 *  Output:
 *  5.0
 */