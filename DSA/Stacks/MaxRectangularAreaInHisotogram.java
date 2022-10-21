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
        while (!s.isEmpty()) {
            s.pop();
        }

        // next smalles Left
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

        // arr = height * width;
        // width = next small right - next small left -1;
        int maxArea = Integer.MIN_VALUE;
        int area[] = new int[height.length];
        for (int i = 0; i < nsr.length; i++) {
            area[i] = height[i] * (nsr[i] - nsl[i] - 1);
            if (maxArea < area[i]) {
                maxArea = area[i];
            }
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