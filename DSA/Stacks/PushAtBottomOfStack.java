
/*
 *      Push at the Bottom of the Stack
 */

import java.util.Stack;

public class PushAtBottomOfStack {

    public static void pushBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int pop = s.pop();
        pushBottom(s, data);
        s.push(pop);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushBottom(s, 4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}

/*
 * Output:
 * 3
 * 2
 * 1
 * 4
 * 
 */