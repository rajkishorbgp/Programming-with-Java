/*
 *                         @Program: 2
 *    Write a java program that accepts two doubles as its command line arguments, 
 *     multiple these together and display the product.
 */
public class Q2_Command_line_arguments_multiple_these {
    public static void main(String[] args) {
        Double a = Double.parseDouble(args[0]);
        Double b = Double.parseDouble(args[1]);
        Double product = a*b;
        System.out.println("Product: "+product);
    }
}

/*
 *   Output:
 *   D:\Lab_Program>javac public class Q2_Command_line_arguments_multiple_these.java
 *   D:\Lab_Program>javac public class Q2_Command_line_arguments_multiple_these 50 5
 *   Product: 250.0
 */