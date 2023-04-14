import java.util.Scanner;

public class incomeTexCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your income: ");
        int income = sc.nextInt();
        int tax;
        if (income < 500000) {
            tax = 0;
        } else if (income >= 500000 && income < 1000000) {
            tax = (int) (income * 0.2); // 20%
        } else {
            tax = (int) (income * 0.3); // 30%
        }

        System.out.println("your tax is : " + tax);
    }
}
/*
 * Output:
 * Enter your income: 3500000
 * your tax is : 1050000
 */