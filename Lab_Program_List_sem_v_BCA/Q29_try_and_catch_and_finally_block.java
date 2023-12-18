/*
                        @Program: 29
	Write a Java program to use the try and catch and finally block.
 */

public class Q29_try_and_catch_and_finally_block {
     private static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
     public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result); 
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
        System.out.println("Program continues...");
    }
}

/*
 *   Output:
 *   Error: / by zero
 *   Finally block executed.
 *   Program continues...
 */