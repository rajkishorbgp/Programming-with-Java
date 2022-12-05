
/*
 *   Search a Binary search tree
 */

public class Search_a_BST {

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

    public static Node BuildBST(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (root.data > value) {
            root.left = BuildBST(root.left, value);
        } else {

            root.right = BuildBST(root.right, value);
        }
        return root;
    }

    public static void displeayBST(Node root) {
        if (root == null) {
            return;
        }
        displeayBST(root.left);
        System.out.print(root.data + " ");
        displeayBST(root.right);
        return;
    }

    public static boolean isSearch(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data > key) {
            return isSearch(root.left, key);
        } else {
            return isSearch(root.right, key);
        }
    }

    public static void main(String[] args) {

        int value[] = { 8, 5, 10, 3, 6, 11, 1, 4, 14 };
        Node root = null;
        int key = 1;

        for (int i = 0; i < value.length; i++) {
            root = BuildBST(root, value[i]);
        }
        displeayBST(root);
        System.out.println();
        if (isSearch(root, key)) {
            System.out.println("Found");
        } else {
            System.out.println("no found");
        }
    }
}

/*
 * Output:
 * 1 3 4 5 6 8 10 11 14
 * Found
 */