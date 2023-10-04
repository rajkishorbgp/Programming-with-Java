/*                      @Program: 3
 *   Write a java program to find the largest among three numbers.
 */

 import java.util.Scanner;

public class Q3_largest_among {
    public static void main(String[] args) {
        System.out.println("Enter any Three number: ");
        Scanner sc = new Scanner(System.in);
        int num1 =  sc.nextInt();
        int num2 =  sc.nextInt();
        int num3 =  sc.nextInt();
        sc.close();
        int max;
        if (num1>num2) {
            if (num1>num3) {
                max = num1;
            }else{
                max = num3;
            }
        }else if(num2>num3){
            max =num2;
        }else{
            max =num3;
        }
        System.out.println("Largest among of three numbers is "+max);
    }
}

/*
   Output:
   Enter any Three number: 
   10 20 30
   Largest among of three numbers is 30
 */