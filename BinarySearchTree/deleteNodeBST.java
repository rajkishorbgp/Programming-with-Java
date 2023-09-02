/*
 *   Delete Node
 */
public class deleteNodeBST {

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
            root.left = buildBST(root.left, value);
        } else {
            root.right = buildBST(root.right, value);
        }
        return root;
    }

    public static void printBST(Node root) {
        if (root == null) {
            return;
        }
        printBST(root.left);
        System.out.print(root.data + " ");
        printBST(root.right);
        return;
    }

    public static Node delete(Node root, int value) {
        if (root.data < value) {
            root.right = delete(root.right, value);
        } else if (root.data > value) {
            root.left = delete(root.left, value);
        } else { // voila
                 // case 1: leaf node
            if (root.left == null && root.right == null) {
                return null;
            }

            // case 2: single child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // case 3: both children
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int value[] = { 8, 5, 10, 3, 6, 11, 1, 4, 14 };
        Node root = null;
        for (int i = 0; i < value.length; i++) {
            root = buildBST(root, value[i]);
        }
        printBST(root);
        System.out.println();
        root = delete(root, 5);
        printBST(root);
    }
}

/*
 * Output:
 * 1 3 4 5 6 8 10 11 14
 * 1 3 4 6 8 10 11 14
 */
