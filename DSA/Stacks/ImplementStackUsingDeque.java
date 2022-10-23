/*
 *    Stack using Deque
 *    (i)   push()
 *    (ii)  pop()
 *    (iii) peek()
 */

import java.util.*;
import java.util.LinkedList;

public class ImplementStackUsingDeque {

    static class Stack {
        Deque<Integer> deque = new LinkedList<>();

        public void push(int data) {
            deque.addLast(data);
        }

        public boolean isEmpty() {
            return deque.isEmpty();
        }

        public int pop() {
            return deque.removeLast();
        }

        public int peek() {
            return deque.getLast();
        }

    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}

/*
 * Output:
 * 5
 * 4
 * 3
 * 2
 * 1
 */