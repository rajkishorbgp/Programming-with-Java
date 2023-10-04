/*
 *                      @Program: 5
 *    Write a java program to print Fibonacci series up to given term.
 */

public class Q5_Fibonacci_series {
    public static void main(String[] args) {
        int n=15;
        int a=0;
        int b=1;
        int sum =0;

        System.out.println("Fibonacci Series...!");
        for (int i = 0; i < n; i++) {
            System.out.print(sum+" ");
            sum = a+b;
            b=a;
            a=sum;
        }
    }
}

/*
Output:
Fibonacci Series...!
0 1 1 2 3 5 8 13 21 34 55 89 144 233 377
 */