/*
 * @Activity Selection
 * 
 * You are given n activities with their start and end times. Select the maximum
 * number of activities that can be performed by a single person, assuming that
 * a
 * person can only work on a single activity at a time. Activities are sorted
 * according to end time.
 * 
 * start = {10, 12, 20}
 * end = {20, 25, 30}
 * 
 * ans = 2 (A0 & A2)
 */

import java.util.*;

public class ActivitySelection {
    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        // end time basis sorted
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st activity
        maxAct = 1;
        ans.add(0);
        int lastEnd = end[0];
        for (int i = 1; i < end.length; i++) {
            if (start[i] >= lastEnd) {
                // activity select
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }
        System.out.println("max activities = " + maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(start[ans.get(i)] + "-" + end[ans.get(i)]);
        }
        System.out.println();
    }

}

/*
 * Output:
 * max activities = 4
 * 1-2
 * 3-4
 * 5-7
 * 8-9
 */