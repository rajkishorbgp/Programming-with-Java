
/*
*   @Max Length Chain of Pairs
*   -> You are given n pairs of numbers. In every pair, the first number is always smaller than
*      the second number.A pair {c, d)}an come after pair(a, b) if b<c.
*      Find the longest chain which can be formed from a given set of pairs.
*     
*      pairs = (5, 24), (39, 60), (5, 28), (27, 40), (50, 90)
*      ans = 3
*/

import java.util.Arrays;
import java.util.Comparator;

public class MaximumLengthChainOfPairs {

    public static void main(String[] args) {
        int pairs[][] = { { 5, 24 }, { 39, 6 }, { 5, 28 }, { 27, 4 }, { 50, 9 } };

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int ans = 1;
        int pairEnd = pairs[0][1];
        for (int i = 1; i < pairs.length; i++) {
            if (pairEnd < pairs[i][0]) {
                ans++;
                pairEnd = pairs[i][1];
            }
        }
        System.out.println("Max Length Chain of Pairs: " + ans);
    }
}

/*
 * Output:
 * Max Length Chain of Pairs: 3
 */
