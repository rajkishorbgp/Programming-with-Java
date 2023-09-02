/*
 *   @Duplicate Parentheses
 *   Givee a balanced expression, find if contains duplicate parentheses or not. A  set of 
 *   parentheses are duplicate if the same subexpression is surrounded by multiple parentheses.
 * 
 *    -> Return a true if it contains duplicates else return false.
 * 
 *   example:  
 *            (i)  -> (((a+(b)))+(c+d))  => true
 *            (ii) -> ((((a)+(b))+c+d))  => true
 *            (iii)-> ((a+b)+(c+d))      => false
 *            (iv) -> (((a+b))+c)        => true
 */

import java.util.Stack;;

public class DuplicateParenthesesCode {

    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // closing
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true; // duplicate
                } else {
                    s.pop(); // opening pair
                }
            } else {
                // opening
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str1 = "(((a+(b)))+(c+d))";
        System.out.println(isDuplicate(str1)); // false
        String str2 = "((a+b)+(c+d))";
        System.out.println(isDuplicate(str2)); // true

    }
}
