
public class QuickSort {

    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pidx = partition(arr, si, ei);
        quickSort(arr, si, pidx - 1);
        quickSort(arr, pidx + 1, ei);
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int j = si - 1;
        for (int i = si; i < ei; i++) {
            if (arr[i] < pivot) {
                int temp = arr[++j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        arr[ei] = arr[++j];
        arr[j] = pivot;
        return j;
    }

    public static void main(String[] args) {

        int arr[] = { 8, 7, 6, 5, 4, 3, 5, 6, 3, 2, 1, 23, 4, 5, 6, 7, 8 };
        quickSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

/*
 * Output:
 * 1 2 3 3 4 4 5 5 5 6 6 6 7 7 8 8 23
 */