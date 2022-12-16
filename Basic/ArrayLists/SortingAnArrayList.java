/*
 *    Sorting an ArrayList
 *    Collections.sort(<list>);
 */

import java.util.ArrayList;
import java.util.Collections;

/**
 * SortingAnArrayList
 */
public class SortingAnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(0);
        list.add(4);
        System.out.println(list + " \nSort ArrayList");
        Collections.sort(list); // ascending
        System.out.println(list);

        // descending
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list); // [6, 5, 4, 3, 1, 0]
    }
}

/*
 * Output
 * [5, 1, 3, 6, 0, 4]
 * Sort ArrayList
 * [0, 1, 3, 4, 5, 6]
 * [6, 5, 4, 3, 1, 0]
 */