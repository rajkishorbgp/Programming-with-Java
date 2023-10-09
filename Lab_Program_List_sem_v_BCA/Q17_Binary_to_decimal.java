/*
 *                               @Program: 17
 *    Write a java program to convert binary number into decimal number.
 */

import java.util.Scanner;

public class Q17_Binary_to_decimal {
    public static int binaryToDecimal(int binary) {
        int decimal = 0;
        int pow =0;
        
        while (binary!=0) {
             int r =binary%10;
            decimal += Math.pow(2, pow)*r;
            binary/=10;
            pow++;
        }
        return decimal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        int binary = sc.nextInt();
        int decimal =binaryToDecimal(binary);
        System.out.println("Decimal number is: "+decimal);
    }
}

/*

Output:
Enter a binary number: 1010
Decimal number is: 10

Enter a binary number: 1000
Decimal number is: 8

*/