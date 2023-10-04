/*                      @Program: 1
 *        Write a java program to swap two numbers.
 */

public class Q1_Swap_two_numbers {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c;
        System.out.println("Before swap the value\n\ta="+a+"\n\tb="+b);
        c=a;
        a=b;
        b=c;
        System.out.println("After swap the value\n\ta="+a+"\n\tb="+b);
    }
}

/*
Output:
Before swap the value
        a=10
        b=20
After swap the value
        a=20
        b=10
*/