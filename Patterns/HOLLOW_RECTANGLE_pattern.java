/*
            HOLLOW RECTANGLE pattern
                    *****
                    *   *
                    *   *
                    *****

*/

public class HOLLOW_RECTANGLE_pattern {
    public static void pattern(int r, int c) {
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (i == 1 || j == 1 || j == c || i == r) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int R = 4;
        int C = 5;
        pattern(R, C);
    }
}


/*
    Output:
     
    *****
    *   *
    *   *
    *****

 */