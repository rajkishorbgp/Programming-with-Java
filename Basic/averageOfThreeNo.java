/*
     In a program, input 3 numbers : A, B and C. You have to output the average of these 3 numbers.
                                                                */

import java.util.Scanner;

public class averageOfThreeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the three number: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float sum = (a + b + c) / 3;
        System.out.println("Average of three no: " + sum);
    }
}

/*
 *   Output:
 *   Enter the three number: 78.5 75.5 86.9
 *   Average of three no: 80.299995
 */