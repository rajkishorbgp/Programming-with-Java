/*
 *      Build a Binary Search Tree
 *     [to Remember: BST makes search efficient]
 */

public class Build_a_BST {
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

    public static Node buildBST(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (root.data > value) {
            // left Subtree Search
            root.left = buildBST(root.left, value);
        } else {
            // right Subtree Search
            root.right = buildBST(root.right, value);
        }
        return root;
    }

    // inorder treversing
    public static void printTree(Node root) {
        if (root == null) {
            return;
        }
        printTree(root.left);
        System.out.print(root.data + " ");
        printTree(root.right);
    }

    public static void main(String[] args) {
        int value[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;

        for (int i = 0; i < value.length; i++) {
            root = buildBST(root, value[i]);
        }

        printTree(root);
    }
}

/*
 * 1 2 3 4 5 7
 */
