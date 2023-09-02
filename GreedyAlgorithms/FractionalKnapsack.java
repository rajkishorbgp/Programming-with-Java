/*
 *   @Fractional Knapsack
 *  -> Given the weights and value of N items, put these irems in a 
 *     knapsack of capacity W to get the maximum total value in the 
 *     knapsack.
 *   value = {60, 100, 120}
 *   weight = {10, 20, 30}
 *   ans = 240;
 *   W = 50
 */

import java.util.*;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int val[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int W = 50;

        double ratio[][] = new double[val.length][2];
        // 0th -> idx; 1st col -> ratio

        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double) weight[i];
        }

        // ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = W;
        int finalVal = 0;
        for (int i = val.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity >= weight[idx]) {
                finalVal += val[idx];
                capacity -= weight[idx];
            } else {
                // include fractional item
                finalVal += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println("Final Value: " + finalVal);
    }
}
/*
 * Output:
 * Final Value: 240
 */
