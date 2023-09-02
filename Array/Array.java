/*
 *          Arrays
 *       -> Array is a list of element of the same type placed in a contiguous memory location.     
 */

import java.util.*;

public class Array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Creating an Array

        // dataType arratName[] = new dataType[size];

        int marks[] = new int[50];

        int number[] = { 1, 2, 3, 4, 5 };

        String fruits[] = { "Apple", "Mango", "Orange" };

        // Input in arrays
        System.out.print("Enter the 5 subject marks: ");
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        marks[3] = sc.nextInt();
        marks[4] = sc.nextInt();

        // Output in Array
        System.out.println(marks[0] + " " + marks[1] + " " + marks[2] + " " + marks[3] + " " + marks[4]);
    }

}

/*
 *    Output:
 *    Enter the 5 subject marks: 70 80 79 87 98
 *    70 80 79 87 98
 */