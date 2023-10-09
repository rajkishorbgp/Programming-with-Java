/*   
                            @Program: 9
 *    Write a java program to check whether a number is palindrome or not.
 */

 public class Q9_palindromeNumber {
    public static Boolean isPalindrome(int num){
        int demo = num;
        int rev=0;
        while (demo!=0) {
            int r = demo%10;
            rev = rev*10+r;
            demo/=10;
        }
        if (rev == num) {
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        int num = 2112;
        if(isPalindrome(num)){
            System.out.println("Number is palindrome.!");
        }else{
            System.out.println("Number is not palindrome.!");
        }
    }
 }

/*
 *   Output:
 *   Number is palindrome.!
 */