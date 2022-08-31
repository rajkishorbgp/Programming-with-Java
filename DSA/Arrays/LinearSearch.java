/*
 *        Linear Search
 *    -> Find the index of element in a given array.      
 */

import java.util.*;

import javax.lang.model.element.Element;

public class LinearSearch {

    public static int arraySearch(int array[], int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many elements do you want to enter in the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the " + n + "th elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element you want to search: ");
        int key = sc.nextInt();
        int index = arraySearch(arr, key);

        if (index == -1) {
            System.out.println("Element " + key + " is not found!");
        } else {
            System.out.println("Element " + key + " is index " + index);
        }
    }
}

/*
 *    Output:
 *    How many elements do you want to enter in the array: 15
 *    Enter the 15th elements: 2 7 4 2 7 9 12 1 514 21 16 8 9 15 6
 *    Enter the element you want to search: 8
 *    Element 8 is index 11
 */