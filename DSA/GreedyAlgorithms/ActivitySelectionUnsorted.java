/*
 * @Activity Selection Unsorted
 * 
 * You are given n activities with their start and end times. Select the maximum
 * number of activities that can be performed by a single person, assuming that
 * a
 * person can only work on a single activity at a time. Activities are unsorted
 * according to end time.
 * 
 * start = {0, 1, 3, 5, 5, 8}
 *   end = {6, 2, 4, 7, 9, 9}
 */

import java.util.*;

public class ActivitySelectionUnsorted {
    public static void main(String[] args) {
        int start[] = { 0, 1, 3, 5, 5, 8 };
        int end[] = { 6, 2, 4, 7, 9, 9 };

        // sorting
        int activities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // lambda function -> shortform
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        // end time basis sorted
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st activity
        maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for (int i = 1; i < end.length; i++) {
            if (activities[i][1] >= lastEnd) {
                // activity select
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
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
 * max activities = 4
 * 1-2
 * 3-4
 * 5-7
 * 8-9
 */