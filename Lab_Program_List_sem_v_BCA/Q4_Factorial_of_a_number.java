/*                    @Program: 4
 *     Write a java program to find factorial of a number.
 */
import java.util.Scanner;

public class Q4_Factorial_of_a_number {

    public static int factorial(int num){
        int fact=num;
        while(num>1){
            num=num-1;
            fact*=num;
        }
        return fact;
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