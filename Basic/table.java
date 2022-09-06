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
