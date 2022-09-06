/*
 *  Write a program to print the multiplication table of a number N,entered by the user.
 */

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the table numbere: ");
            int table = sc.nextInt();
            for (int i = 1; i <= 10; i++){ 
                System.out.println(table + "*" + i + " = " + (table * i));
            }
        }
    }
}

/*
 *    Output:
 *    Enter the table numbere: 5
 *    5*1 = 5
 *    5*2 = 10
 *    5*3 = 15
 *    5*4 = 20
 *    5*5 = 25 
 *    5*6 = 30
 *    5*7 = 35
 *    5*8 = 40
 *    5*9 = 45
 *    5*10 = 50
 */