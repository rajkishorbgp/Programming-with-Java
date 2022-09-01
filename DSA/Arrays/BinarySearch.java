/*
 *          Binary Search
 *         Prerequisite - sorted arrays 
 */


public class BinarySearch {
    public static int binarySearch(int arr[], int key) {
        int start=0 , end=arr.length-1;
        while(start<=end){
            int mid = (start + end)/2;
            // comparisons
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                start=mid+1;
            } else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int array[]={2,4,6,8,10,12,14};
        int key=12;
        int index =binarySearch(array,key);

        if(index != -1){
            System.out.println("Element "+ key + " is " + index + " position");
        }else{
            System.out.println("Element "+ key + " is not found!");
        }
    }
}


/*
 *   Output:
 *   Element 12 is 5 position
 */
