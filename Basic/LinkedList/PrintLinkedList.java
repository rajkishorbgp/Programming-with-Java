/*
 *    Print is a Linked List
 * 
 */

public class PrintLinkedList {

    // creat Node
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // Add first 
    public static void addFirst(int data){
        Node nextNode = new Node(data);
        if (head == null) {
            head=tail=nextNode;
            return;
        }
        nextNode.next = head;
        head = nextNode;
    }


    // Add list
    public static void addLast(int data){
        Node nextNode = new Node(data);
        if (head == null) {
            head=tail=nextNode;
            return;
        }
        tail.next = nextNode;
        tail = nextNode;
    }

    // print Linked list
    public static void printLL(){
        if (head==null) {
            System.out.println("Linked List is a Empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
        System.out.print(temp.data  +"->");
        temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        printLL();
        addFirst(4);
        printLL();
        addFirst(6);
        printLL();
        addFirst(7);
        printLL();
        addFirst(8);
        printLL();
        addFirst(9);
        printLL();
        addLast(3);
        printLL();
        addLast(2);
        printLL();
        addLast(1);
        printLL();
        addLast(0);
        printLL();
        addFirst(10);
        printLL();
    }
}

/*
 *  OutPut
 * 
 *  Linked List is a Empty
 *  4->null
 *  6->4->null
 *  7->6->4->null
 *  8->7->6->4->null
 *  9->8->7->6->4->null
 *  9->8->7->6->4->3->null
 *  9->8->7->6->4->3->2->null
 *  9->8->7->6->4->3->2->1->null
 *  9->8->7->6->4->3->2->1->0->null
 *  10->9->8->7->6->4->3->2->1->0->null
 * 
 */
