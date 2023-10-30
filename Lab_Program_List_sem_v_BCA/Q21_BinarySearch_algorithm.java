/*
 *                       @Program: 21
 *     	Write a java program to implement binary search algorithm.
 * 
 */

public class Q21_BinarySearch_algorithm {
    public static int binarySearch(int arr[], int key, int st, int ed){
        if (st > ed) {
            return -1;
        }
        
        int mid = st + (ed - st) / 2;
        
        if (arr[mid] == key) {
            return mid;
        }
        
        if (arr[mid] > key) {
            return binarySearch(arr, key, st, mid - 1);
        } else {
            return binarySearch(arr, key, mid + 1, ed);
        }
    }
    
    public static void main(String[] args) {
        int array[] ={2,4,5,6,7,8,9,10};
        int key = 9;
        int index = binarySearch(array, key, 0, array.length - 1);
        
        if(index != -1){
            System.out.println("Element "+ key + " is at " + index + " position");
        } else {
            System.out.println("Element "+ key + " is not found!");
        }  
    }
}
/*
 *  Output:
 *  Element 9 is at 6 position
 */