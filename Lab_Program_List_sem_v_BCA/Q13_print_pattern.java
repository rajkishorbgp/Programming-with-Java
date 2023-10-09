/*
                      @Program: 13
  	Write a java program to print the following pattern:

     1
     22
     333
     4444	
     55555

 */

public class Q13_print_pattern {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

/*
    Output:
    1
    22
    333
    4444
    55555
 */
