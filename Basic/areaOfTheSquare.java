/*
    In a program, input the side of a square. You have to output the area of the square.
                                                                                            */

import java.util.Scanner;

public class areaOfTheSquare {

    public static void main(String[] args) {

        System.out.print("Enter the side of a square: ");
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        System.out.println("Area of the square: " + (r * r));

    }
}


/*
 *  
 *   Output:
 *   Enter the side of a square: 5
 *   Area of the square: 25.0
 * 
 */