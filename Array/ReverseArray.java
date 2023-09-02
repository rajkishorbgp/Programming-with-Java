/*
 *   Reverse an Array
 */

public class ReverseArray {

    public static void reverse(int array[]) {
        int start=0 , end=array.length-1;
        for(int i=0; i<array.length/2; i++){
            int tmp = array[start];
            array[start]=array[end];
            array[end]=tmp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        
        int arr[]={ 2, 4, 6, 8, 10 };
        reverse(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

/*
 *   Output:
 *   10 8 6 4 2
 */