/* 
 *                        Problem: Weakest Soldier
 *  We are given an m x n binary matrix of 1's(soldiers) and 0's(civilians)..
 *  the soldiers are positioned in front of the civilians. that is, all the 1's
 *  will appear to the left of all the 0's in each row.
 * 
 *  A row i is weaker than a row j if one of the following is true:
 *    -> The number of soldiers in row i is less then the number of
 *        soldiers in row j.
 *    -> Both rows have the same number of soldiers and i<j.
 *  Find the K weakest rows.
 * 
 *  m=4,n=4,k=2   ans = row0 & row2
 *  1000
 *  1111
 *  1000
 *  1000
 * 
 */

import java.util.PriorityQueue;

public class WeakestSoldier {

    static class Row implements Comparable<Row> {
        int soldiers;
        int index;

        Row(int soldiers, int index) {
            this.soldiers = soldiers;
            this.index = index;
        }

        @Override
        public int compareTo(Row row) {
            if (this.soldiers == row.soldiers) {
                return this.index - row.index;
            } else {
                return this.soldiers - row.soldiers;
            }
        }
    }

    public static void main(String[] args) {
        int n = 4;
        int m = 4;
        int k = 3;
        int matrix[][] = {
                { 1, 0, 0, 0 },
                { 1, 1, 1, 1 },
                { 1, 0, 0, 0 },
                { 1, 0, 0, 0 } };
        PriorityQueue<Row> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            int soldiers = 0;
            for (int j = 0; j < m; j++) {
                soldiers = soldiers + matrix[i][j];
            }
            pq.add(new Row(soldiers, i));
        }
        for (int i = 0; i < k; i++) {
            System.out.println("R" + pq.remove().index);
        }
    }
}

/*
 * Output:
 * R0
 * R2
 * R3
 */