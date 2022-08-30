/*
     Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
     an eraser. You have to output the total cost of the items back to the user as their bill.  */

import java.util.Scanner;

public class costOfThreeItems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost of pencil: ");
        float a = sc.nextFloat();
        System.out.print("Enter the cost of pen: ");
        float b = sc.nextFloat();
        System.out.print("Enter the cost of eraser: ");
        float c = sc.nextFloat();
        float total = (a + b + c);
        System.out.println("Bill is : " + total);
        // Add on - with 18% tax
        float newTotal = total + (0.18f * total);
        System.out.println("Bill with 18% tax : " + newTotal);
        
    }
}

/*
 *    Output:
 *    Enter the cost of pencil: 5
 *    Enter the cost of pen: 8
 *    Enter the cost of eraser: 5
 *    Bill is : 18.0
 *    Bill with 18% tax : 21.24
 */