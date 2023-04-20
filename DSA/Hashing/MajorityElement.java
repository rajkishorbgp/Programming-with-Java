/*
 *    Given an integer array of size n, find all elements that appear more than[n/3] times. 
 */

import java.util.HashMap;

public class MajorityElement {

    public static void main(String[] args) {
        // int arr[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 }; [output: 1]
        int arr[] = { 1, 2 };
        HashMap<Integer, Integer> hm = new HashMap<>();

        // for (int i = 0; i < arr.length; i++) {
        // if (hm.containsKey(arr[i])) {
        // hm.put(arr[i], hm.get(arr[i]) + 1);
        // } else {
        // hm.put(arr[i], 1);
        // }
        // }

        // Sortcut
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }

        // Set<Integer> keys = hm.keySet();

        // sortcut
        for (int key : hm.keySet()) {
            if (hm.get(key) > arr.length / 3) {
                System.out.println(key);
            }
        }
    }
}

/*
 * Output:
 * 1
 * 2
 */
