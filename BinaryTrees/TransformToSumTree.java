/*
 *    Transform to Sum tree
 */
public class TransformToSumTree {

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

    public static int transFormSumTree(Node root) {

        if (root == null) {
            return 0;
        }
        int leftSum = transFormSumTree(root.left);
        int rightSum = transFormSumTree(root.right);
        int rootData = root.data;
        root.data = leftSum + rightSum;
        return rootData + leftSum + rightSum;
    }

    public static void printTree(Node root) {
        if (root == null) {
            return;
        } else {
            System.out.print(root.data + " ");
        }
        printTree(root.left);
        printTree(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        transFormSumTree(root);
        printTree(root);
    }
}

/*
 * 27 9 0 0 13 0 0
 */