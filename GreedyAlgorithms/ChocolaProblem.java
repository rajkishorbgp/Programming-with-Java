
/*
 *    @Chocola Problem
 *   -> We are given a bar of chocolate composed od mXn apuar pieces. One should break the chocolste
 *      into single squares. Each break of a part of the chocolate is charged a cost expressed by 
 *      a positive integer. this cost does not depend on size of the part that is broken but only depands
 *      on the line the break goes along. Let us denote the costs of breaking along consecutive
 *      vertical lines with x1, x2, ..., xm-1 and along horizontal lines with y1, y2, ..., yn-1.
 *      Compute the minimal cost of breaking the whole chocolate into single squares.
 *      
 */

import java.util.*;

public class ChocolaProblem {
    public static void main(String[] args) {
        int n = 4, m = 6;
        Integer costVar[] = { 2, 1, 3, 1, 4 }; // m-1
        Integer costHor[] = { 4, 1, 2 }; // n-1

        Arrays.sort(costVar, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;
        while (h < costHor.length && v < costVar.length) {
            if (costVar[v] <= costHor[h]) { // horizonal cut
                cost += (costHor[h] * vp);
                hp++;
                h++;
            } else { // vertical cut
                cost += (costVar[v] * hp);
                vp++;
                v++;
            }
        }
        while (h < costHor.length) {
            cost += (costHor[h] * vp);
            hp++;
            h++;
        }
        while (v < costVar.length) {
            cost += (costVar[v] * hp);
            vp++;
            v++;
        }
        System.out.println("min cost of cuts = " + cost);
    }
}

/*
 * Output:
 * min cost of cuts = 42
 */