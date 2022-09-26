/*
 *    Fint & Remove Nth node from End ( Iterative Approach ).
 */

public class RemoveNthNodeFromEndVVI {
    

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head,tail;
    
    // add First
    public static void addFirst(int data) {
        Node nextNode =new Node(data);
        if (head==null) {
            head=tail=nextNode;
            return;
        }
        nextNode.next=head;
        head=nextNode;
    }

    // Print Linked List
    public static void printLL(){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }

    // Remove Nth node from End
    public static void removeN(int n){
        // Size of Linked list 
        int size=0;
        Node prev,temp;
        prev= temp = head;

        while(temp!=null){
            temp=temp.next;
            size++;
        }

        int indx = size-n-1;
        int i=0;
        while(i<indx){
            prev=prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public static void main(String[] args) {
        addFirst(5);
        addFirst(4);
        addFirst(3);
        addFirst(2);
        addFirst(1);

        printLL();
        removeN(3);
        printLL();

    }
    
}

/*
 *   Output
 *   1 2 3 4 5 
 *   1 2 4 5
 */