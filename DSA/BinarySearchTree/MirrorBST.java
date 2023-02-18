/*
 *         Mirror BST
 */

public class MirrorBST {

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
        } else if (root.data < data) {
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

    public static Node mirrorBST(Node root) {
        if (root == null) {
            return root;
        }
        Node lefts = mirrorBST(root.left);
        Node rights = mirrorBST(root.right);
        root.left = rights;
        root.right = lefts;
        return root;
    }

    public static void main(String[] args) {
        int arr[] = { 8, 5, 10, 3, 6, 11 };
        Node root = null;
        for (int i = 0; i < arr.length; i++) {
            root = buildBST(root, arr[i]);
        }
        inOrder(root);
        root = mirrorBST(root);
        System.out.println();
        inOrder(root);
    }
}

/*
 * Output:
 * 3 5 6 8 10 11
 * 11 10 8 6 5 3
 */