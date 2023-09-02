/*
 *   Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
 *   determine if the input string is valid. 
 *   @An input string is valid if: 
 *    (i)   ->  Open brackets must be closed by the same type of brackets.
 *    (ii)  ->  Open brackets must be closed in the corrent order.
 *    (iii) ->  Every close bracket has a corresponding open bracket of the same type.
 * 
 *   Ex =>  (i).   ({[]}()) -> true
 *          (ii).  {([]}{}  -> false
 */

import java.util.Stack;

public class ValidParenthesesCode {

    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                s.push(c);
            } else {
                if (s.isEmpty()) {
                    return false;
                }
                if (s.peek() == '(' && c == ')' ||
                        s.peek() == '{' && c == '}' ||
                        s.peek() == '[' && c == ']') {
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        if (s.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String str = "({[]}())"; // true
        System.out.println(isValid(str));
    }
}
