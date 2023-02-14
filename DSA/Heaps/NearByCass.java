import java.util.PriorityQueue;

/*
 *    We are given N points in a 2D plane which are locations of N cars. if we are locations of n cars.
 *    if we are at the origin, print the nearest K cars.
 *    C0(3,3) , C1(5,-1) , C2(-2,4)
 */

public class NearByCass {
    static class Point implements Comparable<Point> {
        int x;
        int y;
        int distSq;
        int index;

        public Point(int x, int y, int distSq, int index) {
            this.x = x;
            this.y = y;
            this.distSq = distSq;
            this.index = index;
        }

        @Override
        public int compareTo(Point p2) {
            return this.distSq - p2.distSq;
        }
    }

    public static void main(String[] args) {
        int pts[][] = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
        int k = 2;

        PriorityQueue<Point> pq = new PriorityQueue<>();
        for (int i = 0; i < pts.length; i++) {
            int distSq = pts[i][0] * pts[i][0] + pts[i][1] * pts[i][1];
            pq.add(new Point(pts[i][0], pts[i][1], distSq, i));
        }

        for (int i = 0; i < pts.length; i++) {
            System.out.println("C" + pq.remove().index);
        }
    }
}

/*
 * Output:
 * C0
 * C2
 * C1
 */