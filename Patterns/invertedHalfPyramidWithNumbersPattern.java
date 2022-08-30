/*
 *       INVARTED HALF-PYRAMID with Number pattern
 *           
 *          1 2 3 4 5
 *          1 2 3 4
 *          1 2 3 
 *          1 2
 *          1
 */

public class invertedHalfPyramidWithNumbersPattern {
    public static void main(String[] args) {

        short rc = 5;

        for (short i = 1; i <= rc; i++) {
            for (short j = 1; j <= rc - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

/*
    Output:
    
    1 2 3 4 5 
    1 2 3 4 
    1 2 3 
    1 2 
    1

 */