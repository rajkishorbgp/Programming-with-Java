/**
 * Kth Ancestor Of Node
 */
public class KthAncestorOfNode {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int kAncestor(Node root, int data, int k) {
        if (root == null) {
            return -1;
        }
        if (root.data == data) {
            return 0;
        }
        int leftDist = kAncestor(root.left, data, k);
        int rightDist = kAncestor(root.right, data, k);

        if (leftDist == -1 && rightDist == -1) {
            return -1;
        }
        int max = Math.max(leftDist, rightDist);
        if (max + 1 == k) {
            System.out.println(root.data);
        }
        return max + 1;
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int data = 4;
        int k = 2;
        kAncestor(root, data, k);
    }
}

/*
 * Output:
 * 1
 */