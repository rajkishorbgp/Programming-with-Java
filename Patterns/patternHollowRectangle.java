/*                   HOLLOW RECTANGLE pattern
 *                                 
 *                            *****
 *                            *   *
 *                            *   *
 *                            *****
 */
 
public class patternHollowRectangle {
    public static void main(String[] args) {
        short r = 4;
        short c = 5;
        for (short i = 1; i <= r; i++) {
            for (short j = 1; j <= c; j++) {
                if (i == 1 || j == 1 || j == c || i == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}

/*
    Output:

    *****
    *   *
    *   *
    *****

*/