/**
 *        DetectALoop_CycleInLinkedList
 */



public class DetectALoop_CycleInLinkedList {

    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static Node head2;

    public static void addFirstLL(int data){
        Node nextNode = new Node(data);
        if (head==null) {
            head=tail=nextNode;
            return;
        }
        nextNode.next = head;
        head = nextNode;
    }

    public static void detectLoopCycleLL() {
        Node slow=head2;
        Node fast=head2;
        while (fast.next!=null&&fast.next.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast) {
                System.out.println("Linked list is a loop cycle.");
                return ;
            }
        }
        System.out.println("Linked list is not loop cycle.");
    }

    public static void printLL(){
        if (head == null) {
            System.out.println("Linked List is a Empty...");
            return;
        }
        Node temp=head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
           addFirstLL(1);
           addFirstLL(2);
           addFirstLL(3);
           addFirstLL(4);
           addFirstLL(5);
           addFirstLL(6);
           addFirstLL(7);

           head2=new Node(10);
           head2.next=new Node(1);
           head2.next.next=new Node(3);
           head2.next.next.next=new Node(4);
           head2.next.next.next.next=head2;
           detectLoopCycleLL();                //  Linked list is a loop cycle.

    }
}