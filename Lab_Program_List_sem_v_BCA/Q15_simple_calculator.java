/*
 *                               Program: 15
 *    Write a java program to make a simple calculator using switch...case.
 */

import java.util.Scanner;
public class Q15_simple_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println("\nWelcome to the Simple Calculator!");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("0. Exit");
            System.out.print("Choose the current option: ");
            ch = sc.nextInt();

            if (ch != 0) {
                System.out.print("Enter the first number: ");
                int a = sc.nextInt();
                System.out.print("Enter the second number: ");
                int b = sc.nextInt();
                int result = 0;

                switch (ch) {
                    case 1:
                        result = a + b;
                        System.out.println("Addition: " + result);
                        break;
                    case 2:
                        result = a - b;
                        System.out.println("Subtraction: " + result);
                        break;
                    case 3:
                        result = a * b;
                        System.out.println("Multiplication: " + result);
                        break;
                    case 4:
                        if (b != 0) {
                            result = a / b;
                            System.out.println("Division: " + result);
                        } else {
                            System.out.println("Division by zero is not allowed.");
                        }
                        break;
                    default:
                        System.out.println("Select the correct option");
                        break;
                }
            }

        } while (ch != 0);

        System.out.println("Thank you for using the Simple Calculator!");
    }
}

/*

OutPut: 
Welcome to the Simple Calculator!
1. Addition
2. Subtraction
3. Multiplication
4. Division
0. Exit
Choose the current option: 1
Enter the first number: 50
Enter the second number: 20
Addition: 70

Welcome to the Simple Calculator!
1. Addition
2. Subtraction
3. Multiplication
4. Division
0. Exit
Choose the current option: 2
Enter the first number: 20
Enter the second number: 10
Subtraction: 10

Welcome to the Simple Calculator!
1. Addition
2. Subtraction
3. Multiplication
4. Division
0. Exit
Choose the current option: 3
Enter the first number: 20
Enter the second number: 5
Multiplication: 100

Welcome to the Simple Calculator!
1. Addition
2. Subtraction
3. Multiplication
4. Division
0. Exit
Choose the current option: 4
Enter the first number: 100
Enter the second number: 25
Division: 4

Welcome to the Simple Calculator!
1. Addition
2. Subtraction
3. Multiplication
4. Division
0. Exit
Choose the current option: 0
Thank you for using the Simple Calculator!

 */