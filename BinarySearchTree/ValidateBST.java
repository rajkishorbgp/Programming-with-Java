/**
 * Validate BST
 * 
 */

public class ValidateBST {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node buildBST(Node root, int data) {

        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (root.data > data) {
            root.left = buildBST(root.left, data);
        } else {
            root.right = buildBST(root.right, data);
        }
        return root;
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static boolean isValid(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }
        if (max != null && root.data >= max.data) {
            return false;
        } else if (min != null && root.data <= min.data) {
            return false;
        }
        return isValid(root.left, min, root) && isValid(root.right, root, max);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 8, 1, 0, 5 };
        Node root = null;
        for (int i = 0; i < arr.length; i++) {
            root = buildBST(root, arr[i]);
        }

        if (isValid(root, null, null)) {
            System.out.println("Valid");
        } else {
            System.out.println("Not Valid");
        }

        inOrder(root);
    }
}

/*
 * Output:
 * Valid
 * 0 1 3 5 6 8
 */