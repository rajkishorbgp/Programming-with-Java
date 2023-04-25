import java.util.HashSet;

public class Union_IntersectionOfTwoArrays {

    public static int union(int arr1[], int arr2[]) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            hs.add(arr2[i]);
        }
        return hs.size();
    }

    public static int intersection(int[] arr1, int[] arr2) {
        int count = 0;
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            if (hs.remove(arr2[i])) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };

        System.out.println(union(arr1, arr2));
        System.out.println(intersection(arr1, arr2));
    }
}

/*
 * Output:
 * 6
 * 2
 */