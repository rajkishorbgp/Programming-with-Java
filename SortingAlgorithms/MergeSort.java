/*
 *         Divide & Conquer
 */

public class MergeSort {

    public static void mergeSort(int array[], int si, int ei) {

        if (si >= ei) { // end me true
            return;
        }

        int mid = si + (ei - si) / 2;

        mergeSort(array, si, mid);
        mergeSort(array, mid + 1, ei);

        merge(array, si, mid, ei);
    }

    public static void merge(int array[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei) {
            if (array[i] > array[j]) {
                temp[k] = array[j++];
            } else {
                temp[k] = array[i++];
            }
            k++;
        }

        while (i <= mid) {
            temp[k++] = array[i++];
        }

        while (j <= ei) {
            temp[k++] = array[j++];
        }

        for (i = 0, j = si; i < temp.length; i++, j++) {
            array[j] = temp[i];
        }
    }

    public static void main(String[] args) {
        int array[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };

        mergeSort(array, 0, array.length - 1);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

/*
 * Output:
 * 1 2 3 4 5 6 7 8 9
 */