/*
 *     Create LinkedList using java collections framework
 */

 import java.util.LinkedList;

public class LLCollectionsFramework {


    public static void main(String[] args) {
        // create
        LinkedList<Integer> ll = new LinkedList<>();

        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addFirst(10);
        // 10->1->2->3->4
        System.out.println(ll);   // [10, 1, 2, 3, 4]

        // remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);   // [1, 2, 3]
    }
}
