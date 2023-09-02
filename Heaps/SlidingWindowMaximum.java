
/*
 *            problem: Sliding Window Maximum
 *   -> maximum of all subarrays of size k
 *      1,2,3,4,5,6,7,8,9,10
 *      k=3
 */
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.ArrayList;

public class SlidingWindowMaximum {

    static class pair implements Comparable<pair> {
        int value;
        int indx;

        pair(int value, int indx) {
            this.value = value;
            this.indx = indx;
        }

        @Override
        public int compareTo(pair win) {
            return this.value - win.value;
        }
    }

    public static void main(String[] args) {

        PriorityQueue<pair> pq = new PriorityQueue<>(Comparator.reverseOrder());
        ArrayList<Integer> ll = new ArrayList<>();

        int arr[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;
        int result[] = new int[arr.length - k + 1];

        // first window
        for (int i = 0; i < k; i++) {
            pq.add(new pair(arr[i], i));
        }
        result[0] = pq.peek().value;
        for (int i = k; i < arr.length; i++) {
            while (pq.size() > 0 && pq.peek().indx <= (i - k)) {
                pq.remove();
            }
            pq.add(new pair(arr[i], i));
            result[i - k + 1] = pq.remove().value;
        }

        // Print result
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

}

/*
 * Output:
 * 3 3 5 3 6 7
 */