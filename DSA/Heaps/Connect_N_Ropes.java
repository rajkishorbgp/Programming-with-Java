
/*
 *   Given are N ropes of different lengths, the task is to connect there ropes into 
 *   one rope with minimum cost, such that the cost to connect two ropes is equal to
 *   the sum of their lengths.
 */
import java.util.PriorityQueue;

public class Connect_N_Ropes {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int ropes[] = { 4, 3, 2, 6 };
        for (int i = 0; i < ropes.length; i++) {
            pq.add(ropes[i]);
        }
        int cost = 0;
        while (pq.size() > 1) {
            int num1 = pq.remove();
            int num2 = pq.remove();
            cost += num1 + num2;
            pq.add(num1 + num2);
        }
        System.out.println("Minimum cost: " + cost);
    }
}

/*
 * Output:
 * Minimum cost: 29
 */
