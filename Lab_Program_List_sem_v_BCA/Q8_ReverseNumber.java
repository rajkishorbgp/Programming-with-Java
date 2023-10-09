/*
 *                      @Program: 8
 *     Write a java program to reverse the number.
 */

public class Q8_ReverseNumber {
    public static int reverseNum(int num){
        int rev=0;
        while(num!=0){
            int r = num % 10;
            rev= rev*10 + r;
            num = num/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        int num =12345;
        int reverse = reverseNum(num);
        System.out.println("Reverse number is: "+reverse);
    }
}

/*
 *   Output:
 *   Reverse number is: 54321
 */