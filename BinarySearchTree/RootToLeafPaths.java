import java.util.ArrayList;

/*
 *     Root to Leaf Paths 
 *            8
 *           / \   
 *          5   10
 *         / \    \
 *        3   6    11
 *                   \
 *                    14
 */

public class RootToLeafPaths {
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

    public static void printPath(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + "->");
        }
        System.out.println("null");
    }

    public static void rootPaths(ArrayList<Integer> arr, Node root) {
        if (root == null) {
            return;
        }
        arr.add(root.data);
        if (root.left == null && root.right == null) {
            printPath(arr);
        }
        rootPaths(arr, root.left);
        rootPaths(arr, root.right);
        arr.remove(arr.size() - 1);
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int arr[] = { 8, 5, 10, 3, 6, 11, 14 };
        Node root = null;
        for (int i = 0; i < arr.length; i++) {
            root = buildBST(root, arr[i]);
        }
        // inorder(root);

        rootPaths(new ArrayList<>(), root);
    }
}
/*
 * Output:
 * 8->5->3->null
 * 8->5->6->null
 * 8->10->11->14->null
 */