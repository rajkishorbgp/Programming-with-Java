/*                    @Program: 6
 *     Write a java program to find GCD of two numbers.
 */

 import java.util.Scanner;

public class Q6_Find_GCD_of_two_numbers {
    public static int gcd(int num1, int num2){
        if (num2 == 0) {
            return num1;
        }
        return gcd(num2, num1 % num2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the two number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("GCD of two numbers: "+ gcd(num1, num2));
    }
}

/*

Output:
Enter the two number: 50 40
GCD of two numbers: 10

Enter the two number: 100 200
GCD of two numbers: 100

*/