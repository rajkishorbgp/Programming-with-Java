/*
 *    @Max Area in Histogram
 *     -> Given an array of integers heights representing the histogram`s bar height where the 
 *        width of each bar is 1, return the area of the largest rectangle in the histogram.
 * 
 *         heights= [2, 1, 5, 6, 2, 3]
 */

import java.util.Stack;

public class MaxRectangularAreaInHisotogram {

    public static int areaRectangle(int height[]) {

        int nsl[] = new int[height.length];
        int nsr[] = new int[height.length];
        Stack<Integer> s = new Stack<>();

        // next smalles Right
        for (int i = height.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && height[s.peek()] >= height[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = 6;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // next smalles Left
        s = new Stack<>();
        for (int i = 0; i < nsr.length; i++) {
            while (!s.isEmpty() && height[s.peek()] >= height[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        int maxArea = Integer.MIN_VALUE;
        for (int i = 0; i < nsr.length; i++) {

            // width = (next small right) - (next small left)-1;
            int width = nsr[i] - nsl[i] - 1;

            // arr = height * width;
            int currArea = height[i] * width;

            maxArea = Math.max(maxArea, currArea);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int height[] = { 2, 1, 5, 6, 2, 3 };
        System.out.println("Area of the largest rectangle in the histogram = " + areaRectangle(height));
    }
}

/*
 * Output:
 * Area of the largest rectangle in the histogram = 10
 */