/*
 *       Doubly Linked List
 */

public class DoublyLinkedList {

    public class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node nextNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = nextNode;
            return;
        }
        nextNode.next = head;
        head.prev = nextNode;
        head = nextNode;
    }

    public void printFLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void printLLL() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public void removeFLL() {
        if (head == null) {
            System.out.println("Doubly Linked List is Empty");
            return;
        }
        if (size == 1) {
            head.next = head.prev = null;
            size--;
            return;
        }
        head = head.next;
        head.prev = null;
        size--;

    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addFirst(4);
        dll.addFirst(5);
        System.out.println("LinkedList size: " + size); // LinkedList size: 5
        dll.printFLL(); // 5 4 3 2 1
        dll.printLLL(); // 1 2 3 4 5
        dll.removeFLL();
        dll.printFLL(); // 4 3 2 1

        System.out.println("LinkedList size: " + size); // LinkedList size: 4
    }
}
