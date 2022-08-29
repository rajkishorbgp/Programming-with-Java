/*
 *                     NUMBER PYRAMID pattern
 *                              1
 *                             2 2
 *                            3 3 3
 *                           4 4 4 4 
 *                          5 5 5 5 5
 */

public class numberPyramidPattern {
    public static void main(String[] args) {
        short n = 5;
        for (short i = 1; i <= n; i++) {
            for (short j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (short j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

/* 
    Output:

        1 
       2 2 
      3 3 3 
     4 4 4 4 
    5 5 5 5 5
 
*/