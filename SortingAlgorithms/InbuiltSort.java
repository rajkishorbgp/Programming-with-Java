import java.util.Arrays;
import java.util.Collections;;

public class InbuiltSort {

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int array[] = { 1, 9, 8, 7, 5, 4, 3, 2, 0 };

        /*
         * [ import java.util.Arrays; ]
         * Arrays.sort(array); // 0(n logn) < 0(n^2)
         * printArray(array); // 0 1 2 3 4 5 7 8 9
         */

        Arrays.sort(array, 0, 5);
        printArray(array); // 1 5 7 8 9 4 3 2 0

        /*
         * Integer arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
         * Arrays.sort(arr, Collections.reverseOrder());
         * for (int i = 0; i < arr.length; i++) {
         * System.out.print(arr[i] + " // 9 8 7 6 5 4 3 2 1
         * }
         */

        Integer arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        Arrays.sort(arr, 0, 5, Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // 5 4 3 2 1 6 7 8
        }
    }
}

/*
 * Output:
 * 1 5 7 8 9 4 3 2 0
 * 5 4 3 2 1 6 7 8
 */