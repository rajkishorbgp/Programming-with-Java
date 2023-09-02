import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueue_PQ {
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>(); // 1 3 4 5 9

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(1); // 0(log n)
        pq.add(5);
        pq.add(3);
        pq.add(9);
        pq.add(4);

        while (!pq.isEmpty()) {
            System.out.print(pq.peek() + " "); // 0(1) //9 5 4 3 1s
            pq.remove(); // 0(log n)
        }
    }
}

/*
 * Output:
 * 9 5 4 3 1
 */