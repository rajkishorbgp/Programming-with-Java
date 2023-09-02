/*
 *         Search in Rotated Sorted Array
 * 
 *   input->  sorted, rotated array with distinct number (in ascending order) it is rotated at a pivot point.
 *            Find the index of given element.
 */

public class SearchInRotatedSortedArray {

    public static int searchArray(int arr[] , int tar , int si , int ei) {
        if (si>ei) {
            return -1;
        }
        // kaam
        int mid = si+(ei-si)/2;
        // case found 
        if (arr[mid]==tar) {
            return mid;
        }
        // mid on L1
        if(arr[si]<=arr[mid]){
            //case a: L1 left
            if(arr[si]<=tar&&tar<=arr[mid]){
                return searchArray(arr,tar,si,mid-1);
            }else{
                // case b: right
                return searchArray(arr,tar,mid+1,ei);
            }
        }
        // mid on L2
        else{
            // case c: right
            if(arr[mid]<=tar&&tar<=arr[ei]){
                return searchArray(arr,tar,mid+1,ei);
            }
            //case d: left
            else{
                return searchArray(arr,tar,si,mid-1);
            }
        }
    }
 
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int tar=1;
        int index=searchArray(arr,tar,0,arr.length-1);
       if (index==-1) {
           System.out.println("index is not found!");
       }else{
            System.out.println("index no: " + index);
       }
    }
}

/*
 *   Output:
 *   index no: 5
 */