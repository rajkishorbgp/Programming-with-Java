/*
 *                 FLOYD'S Triangle pattern 
 *                         1
 *                         2 3
 *                         4 5 6
 *                         7 8 9 10
 *                         11 12 13 14 15
 */

public class floydTrianglePattern {
    public static void main(String[] args) {
        short rc = 5;
        short num = 1;
        for (short i = 1; i <= rc; i++) {
            for (short j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}

/*

    Output:

    1 
    2 3 
    4 5 6  
    7 8 9 10 
    11 12 13 14 15

 */