/*                  @Progrme: 7
 *   Write a java program to find LCM of two numbers.
 */

import java.util.Scanner;

public class Q7_Find_LCM_of_two_numbers {
    public static int gcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return gcd(num2, num1 % num2);
    }

    public static int lcm(int num1, int num2) {
        int gcdResult = gcd(num1, num2);
        return (num1 * num2) / gcdResult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        
        int result = lcm(num1, num2);
        System.out.println("LCM of two numbers: " + result);
    }
}

/*
Output:
Enter the first number: 10
Enter the second number: 40
LCM of two numbers: 10
 */