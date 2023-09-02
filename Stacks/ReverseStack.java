/*
 *       Reverse a stack
 */

import java.util.Stack;

public class ReverseStack {

    public static void pushBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int pop = s.pop();
        pushBottom(s, data);
        s.push(pop);
    }

    public static void isReverse(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int data = s.pop();
        isReverse(s);
        pushBottom(s, data);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        isReverse(s);
        while (!s.empty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}

/*
 * output:
 * 1
 * 2
 * 3
 */