/*
 *                      HOLLOW RHOMBUS pattern
 * 
 *                         *****
 *                        *   *
 *                       *   *
 *                      *   *
 *                     *****
 */

public class hollowRhombusPattern {
    public static void main(String[] args) {
        short n = 5;
        for (short i = 1; i <= n; i++) {
            for (short j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (short j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || j == n || i == n) {
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
     *   *
    *****
  

 */
