/*
 *                         @Program: 20
 *    Write a java program to implement bubble sort algorithm.
 */

public class Q20_Bubble_sort_algorithm {

    public static void bubbleSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            int count=0;
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                    count++;
                }
            }
            if (count==0) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={9,8,7,6,5,4,3,4,5};
        bubbleSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

/*
 *   Output:
 *   3 4 4 5 5 6 7 8 9 
 */