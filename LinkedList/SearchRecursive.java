/* 
 *       Search (Recursive)
 *   Search for a key in a Linked List Return the Position where it is found. if not found , return -1. using Recursion. 
*/
public class SearchRecursive {


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
    private static int index; 

    //Search LinkedList using Recursive
    public static int recSearch(int key){
        return helper(head,key);
    }

    // Helper method
    public static int helper(Node head,int key){
        if (head==null) {
            return -1;
        }
        if (head.data==key) {
            return 0;
        }
        index = helper(head.next, key);
        if (index==-1) {
            return -1;
        }
        return ++index;
    }


    // add First
    public void addFirst(int data) {
        Node nextNode =new Node(data);
        size++;
        if (head==null) {
            head=tail=nextNode;
            return;
        }
        nextNode.next=head;
        head=nextNode;
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
        SearchRecursive ll = new SearchRecursive();
        ll.addFirst(5);
        ll.addFirst(40);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(0);
        printLL();
        System.out.println("\nSize of LinkedList : "+ size);
        System.out.println(recSearch(40));
    }
}

/*
 *   Output
 *   0 1 2 3 40 5 
 *   Size of LinkedList : 6
 *   4
 */