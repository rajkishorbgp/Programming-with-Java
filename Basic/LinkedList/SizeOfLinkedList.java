/*
 *      Size of a Linked List
 */


public class SizeOfLinkedList {

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
    public static int size=0;

    // Add in middles
    public void addMid(int index, int data){
        if (index==0) {
            addFirst(data);
            return;
        }
        Node nextNode = new Node(data);
        size++;
        Node temp = head;
        int  i=0;
        while (i<index-1) {
            temp=temp.next;
            i++;
        }
        nextNode.next=temp.next;
        temp.next = nextNode;
    }

    // add First
    public void addFirst(int data){
        Node nextNode = new Node(data);
        size++;
        if(head==null){
            head=tail=nextNode;
            return;
        }
        nextNode.next= head;
        head=nextNode;
    }

    // add Last
    public void addLast(int data){
        Node nextNode = new Node(data);
        size++;
        if(head==null){
            head=tail=nextNode;
            return;
        }
        tail.next= nextNode;
        tail=nextNode;
    }
 
    // Print Linked List
    public static void printLL(){
        if (head==null) {
            System.out.println("LinkedList is a Emtey");
            return;
        }
        Node temp = head;

        while (temp!=null) {
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
    }      

    public static void main(String[] args) {
        SizeOfLinkedList ll = new SizeOfLinkedList();

        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addMid(2,10);
        ll.addLast(6);
        ll.addLast(7);
        ll.addMid(0, 50);
        printLL();
        System.out.println("\nSize of LinkedList : " + ll.size);
    }
}



/*
 *   Output
 *   50 2 3 10 4 5 6 7 
 *   Size of LinkedList : 8
 */