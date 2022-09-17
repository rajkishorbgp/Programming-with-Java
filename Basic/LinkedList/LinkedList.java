/*
 *      Linked List
 * 
 *   [1] --> [2] --> [3] --> [4]
 *    
 * `/>    _Node _          _Node _       _Node _         _Node _ 
 *       | data  |        | data  |     | data  |       | data  |
 *       |-------|        |-------|     |-------|       |-------|
 *       |_next _| -----> |_next _|---> |_next _| ----> |_next _| -----> NULL
 *            1               2             3               4
 */


public class LinkedList {

    public static class Node {
        int data;
        Node   next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    // add -> first, last
    public void addFist(int data) {

        // step1: create new node
        Node newNode = new Node(data);
        
        if (head == null) {
            head = tail = newNode;
            return;
        }

        //  step2: newNode next = head
        newNode.next = head; //link
        
    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFist(1);
        list.addFist(2);
    }
}
