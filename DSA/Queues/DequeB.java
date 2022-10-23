/*
 *    Deque [ Double ended queue ]
 */

import java.util.*;

public class DequeB {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        deque.addLast(5);
        System.out.println(deque); // [3, 2, 1, 5]
        deque.removeFirst();
        deque.removeLast();
        System.out.println(deque); // [2, 1]
        System.out.println("get first : " + deque.getFirst()); // get first : 2
        System.out.println("get last : " + deque.getLast()); // get last : 1
    }
}

/*
 * Output:
 * [3, 2, 1, 5]
 * [2, 1]
 * get first : 2
 * get last : 1
 * 
 */