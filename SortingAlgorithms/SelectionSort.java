/**
 * SelectionSort
 */
public class SelectionSort {

    public static void selectionSort(int array[]) {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            int j = array.length - 1;
            while (j > i) {
                if (array[min] > array[j]) {
                    min = j;
                }
                j--;
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };

        selectionSort(arr);
        printArray(arr);

    }
}

/*
 * Output:
 * 1 2 3 4 5 6 7 8 9
 */