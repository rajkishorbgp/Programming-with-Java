/*
 *                 Reverse a linked List
 *         => [Iterative Approach]
 *          1 --> 2 --> 3 --> 4 --> 5 --> 6 --> 7 --> null
 *  null <--1 <-- 2 <-- 3 <-- 4 <-- 5 <-- 6 <-- 7  
 */

public class ReverseLinkedListUseIterativeApproach {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head,tail;
    public static int size=0;
    // add First
    public static void addFirst(int data) {
        Node nextNode =new Node(data);
        size++;
        if (head==null) {
            head=tail=nextNode;
            return;
        }
        nextNode.next=head;
        head=nextNode;
    }

    // Reverse a linked List
    public static void reverseLL(){
        Node next, prev = null;
        Node curr= tail = head ; 
        while(curr!=null){
            next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    // print Linked List
    public static void printLL(){
        if (head==null) {
            System.out.println("Linked List is Empty");
            return;
        }
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        addFirst(5);
        addFirst(40);
        addFirst(3);
        addFirst(2);
        addFirst(1);
        addFirst(0);
        printLL();

        reverseLL();
        System.out.println("\nReverse Point ");
        printLL();

    }
}

/*
 *   Output
 *   0 1 2 3 40 5 
 *   Reverse Point
 *   5 40 3 2 1 0
 */
