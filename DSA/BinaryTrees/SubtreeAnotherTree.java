/*
 *   @Subtree of another Tree
 *    -> Given the roots of two binary trees root and subRoot, return true if there is a subtree of root
 *       with the same structure and node values of subRoot and false otherwise.
 */

public class SubtreeAnotherTree {

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

    public static boolean isIdentical(Node treeRoot, Node subTreeRoot) {
        if (treeRoot == null && subTreeRoot == null) {
            return true;
        } else if (treeRoot == null || subTreeRoot == null || treeRoot.data != subTreeRoot.data) {
            return false;
        }
        if (!isIdentical(treeRoot.left, subTreeRoot.left)) {
            return false;
        }
        if (!isIdentical(treeRoot.right, subTreeRoot.right)) {
            return false;
        }
        return true;
    }

    public static boolean isSubtree(Node treeRoot, Node subTreeRoot) {
        if (treeRoot == null) {
            return false;
        }
        if (treeRoot.data == subTreeRoot.data) {
            if (isIdentical(treeRoot, subTreeRoot)) {
                return true;
            }
        }
        return isSubtree(treeRoot.left, subTreeRoot) || isSubtree(treeRoot.right, subTreeRoot);
    }

    public static void main(String[] args) {
        Node treeRoot = new Node(1);
        treeRoot.left = new Node(2);
        treeRoot.right = new Node(3);
        treeRoot.left.left = new Node(4);
        treeRoot.left.right = new Node(5);
        treeRoot.right.right = new Node(6);

        Node subTreeRoot = new Node(2);
        subTreeRoot.left = new Node(4);
        subTreeRoot.right = new Node(5);

        System.out.println(isSubtree(treeRoot, subTreeRoot)); // true
    }
}