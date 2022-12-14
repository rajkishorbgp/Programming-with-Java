/*
 *              BUTTERFLY pattern
 * 
 *              *      *
 *              **    **
 *              ***  ***
 *              ********
 *              ********
 *              ***  ***
 *              **    **
 *              *      *
 */


public class butterflyPattern {
    public static void main(String[] args) {
        short n = 4;
        for (short i = 1; i <= n; i++) {
            for (short j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (short j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (short j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (short i = n; i >= 1; i--) {
            for (short j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (short j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (short j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


/*
    Output:

    *      *
    **    **
    ***  ***
    ********
    ********
    ***  ***
    **    **
    *      *
    
 */