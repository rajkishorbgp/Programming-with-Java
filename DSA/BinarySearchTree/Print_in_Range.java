/*
 *     Print in Range
 */
public class Print_in_Range {

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
            Node nexNode = new Node(data);
            return nexNode;
        }
        if (root.data < data) {
            root.right = buildBST(root.right, data);
        } else {
            root.left = buildBST(root.left, data);
        }
        return root;
    }

    public static void print_inOrder(Node root) {
        if (root == null) {
            return;
        }
        print_inOrder(root.left);
        System.out.print(root.data + " ");
        print_inOrder(root.right);
    }

    public static void printRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (k1 <= root.data && root.data <= k2) {
            printRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printRange(root.right, k1, k2);
        } else if (root.data < k1) {
            printRange(root.right, k1, k2);
        } else {
            printRange(root.left, k1, k2);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 8, 5, 10, 3, 6, 11, 1, 4, 14 };
        int k1 = 5;
        int k2 = 12;
        Node root = null;

        for (int i = 0; i < arr.length; i++) {
            root = buildBST(root, arr[i]);
        }

        // print_inOrder(root);
        printRange(root, k1, k2);
    }
}

/*
 * Output:
 * 1 3 4 5 6 8 10 11 14
 */