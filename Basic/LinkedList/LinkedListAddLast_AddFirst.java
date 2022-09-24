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


public class LinkedListAddLast_AddFirst {

    // create Node
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

        // step3: head = new Node;
        head = newNode; 
    }

    // add last
    public void addLast(int data){
        Node nextNode=new Node(data);
        if(head == null){
            head = tail = nextNode;
            return;
        }
        tail.next = nextNode;
        tail=nextNode;
    }

    // print Linked Listsss
    public static void printLL(){
        if (head==null) {
            System.out.println("Linked List is Empty");
        }
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedListAddLast_AddFirst list = new LinkedListAddLast_AddFirst();
        list.addFist(1);
        list.addFist(2);
       list.addLast(4);
       list.addLast(5);
        list.printLL();
    }

}

/*
 *    Output
 *    2 1 4 5
 */
