/*
 *       check if a String is a palindrome. 
 */

public class StringIsPalindrome {
    public static Boolean isPalindrome(String str){
        int n = str.length();
        for (int i = 0; i < n/2; i++) {
            if (str.charAt(i)!=str.charAt(n-1-i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(isPalindrome(str));
    }
}

/*
 *   Output:
 *   true
 */