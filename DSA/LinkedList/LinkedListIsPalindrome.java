/*
 *        Check if LL is a palindrome
 *          ->  ( 1221, 1441)
 */


public class LinkedListIsPalindrome {
    
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head, tail;

    // print Linked List
    public static void printLL(){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }

    //   add first
    public static void addFirst(int data){
        Node nextNode = new Node(data);
        if (head==null) {
            head = tail = nextNode;
            return;
        }
        nextNode.next = head;
        head = nextNode;
    }

    // Slow-Fast Approach
    public static Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // slow is my midNode
    }

     public static boolean checkPalindrome(){
        if (head==null || head.next == null) {
            return true;
        }
        // step1 - find mid
        Node midNode = findMid(head);

        // step2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; // right half head
        Node left = head;  

        //step3 - check left half & right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right= right.next;
        }
        return true;
     }

    public static void main(String[] args) {
      addFirst(1);   
      addFirst(2);   
      addFirst(2);   
      addFirst(1);   
      printLL();
      System.out.println(checkPalindrome());
    }

}

/*
 *   Output:
 *   1 2 2 1 
 *   true
 */