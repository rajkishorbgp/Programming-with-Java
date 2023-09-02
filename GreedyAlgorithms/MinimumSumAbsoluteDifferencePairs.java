/*
 *   @Min Absolute Difference Pairs
 *   Given two arrays A and B of equal length n. pair each element of array A to an element in array B, 
 *   such that sum S of absolute differences of all the pairs is minimum.
 *   A= [1, 2, 3]
 *   B= [2, 1, 3]
 * 
 *   ans = 0
 */

import java.util.*;

public class MinimumSumAbsoluteDifferencePairs {
    public static void main(String[] args) {
        int a[] = { 1, 4, 7, 8 };
        int b[] = { 2, 3, 6, 5 };
        Arrays.sort(a);
        Arrays.sort(b);
        int minDiff = 0;
        for (int i = 0; i < a.length; i++) {
            minDiff += Math.abs(a[i] - b[i]);
        }
        System.out.println("Min absolute diff of pairs= " + minDiff);
    }
}

/*
 * Output:
 * Min absolute diff of pairs= 6
 */