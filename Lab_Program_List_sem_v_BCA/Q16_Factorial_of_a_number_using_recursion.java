/*                               @Program: 16
 *     Write a java program to find factorial of a number using recursion.
 */
import java.util.Scanner;

public class Q16_Factorial_of_a_number_using_recursion {

    public static int factorial(int num){
        if(num<=1){
            return 1;
        }
        return num * factorial(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int fact = factorial(num);
        System.out.println("Factorial: "+fact);
    }
}

/*
    Output:
    Enter the number: 6 
    Factorial: 720
 */