/*
 *   @Next Greater Element
 *      -> The next greater element of same element X in an array is the first greater
 *         element that is to the right of x in the same array.  
 */

import java.util.Stack;

public class NextGreaterElementCode {

    public static void main(String[] args) {

        int arr[] = { 6, 8, 0, 1, 3 };
        int n = arr.length;
        int nextGreater[] = new int[n];
        Stack<Integer> s = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!s.empty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[s.peek()];
            }
            s.push(i);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(nextGreater[i] + " ");
        }
        System.out.println();
    }
}

/*
 * Output:
 * 8 -1 1 3 -1
 */
