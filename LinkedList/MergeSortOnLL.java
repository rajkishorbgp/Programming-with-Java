/*
 *     Merge Sort on a Linked List
 */

public class MergeSortOnLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;

    public static void addFirst(int data) {
        Node nextNode = new Node(data);
        if (head == null) {
            head = tail = nextNode;
            return;
        }
        nextNode.next = head;
        head = nextNode;
    }

    public static void printLL() {
        if (head == null) {
            System.out.print("Lenked List is a Empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // find mid
        Node mid = getMid(head);

        // left & right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // merge
        return merge(newLeft, newRight);
    }

    public static Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // mid Node
    }

    public static Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while (head1 != null || head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }

    public static void main(String[] args) {
        addFirst(1);
        addFirst(2);
        addFirst(3);
        addFirst(4);
        addFirst(5);
        System.out.println("Before Sort number.");
        printLL();
        System.out.println("After Sort number.");
        mergeSort(head);
        printLL();
    }
}

/*
 * Output:
 * Before Sort number.
 * 5 4 3 2 1
 * After Sort number.
 * Exception in thread "main" java.lang.NullPointerException: Cannot read field
 * "next" because "<local2>" is null
 * at MergeSortOnLL.getMid(MergeSortOnLL.java:59)
 * at MergeSortOnLL.mergeSort(MergeSortOnLL.java:44)
 * at MergeSortOnLL.main(MergeSortOnLL.java:102)
 * 
 */
