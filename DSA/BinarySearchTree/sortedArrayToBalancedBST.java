/*
 *     Sorted array to Balanced BST
 */

public class sortedArrayToBalancedBST {
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

    public static Node buildBalancedBST(int arr[], int si, int ei) {
        if (si > ei) {
            return null;
        }
        int mid = si + (ei - si) / 2;
        Node root = new Node(arr[mid]);
        root.left = buildBalancedBST(arr, si, mid - 1);
        root.right = buildBalancedBST(arr, mid + 1, ei);
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

    public static void main(String[] args) {
        int arr[] = { 3, 5, 6, 8, 10, 11, 12 };
        Node root = buildBalancedBST(arr, 0, arr.length - 1);
        inOrder(root);
    }
}

/*
 * Output:
 * 3 5 6 8 10 11 12
 */