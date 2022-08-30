/*
 *                    0-1 Triangle pattern
 *             
 *                           1
 *                           0 1
 *                           1 0 1
 *                           0 1 0 1
 *                           1 0 1 0 1 
 */


public class binaryTrianglePattern {
    public static void main(String[] args) {
        short rc = 5;
        for (short i = 1; i <= rc; i++) {
            for (short j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}

/*
    Output: 
    
    1 
    0 1 
    1 0 1 
    0 1 0 1 
    1 0 1 0 1

 */