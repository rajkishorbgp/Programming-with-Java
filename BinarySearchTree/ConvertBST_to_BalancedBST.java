import java.util.*;
/*
 *   Convert BST to Balanced BST
 */

public class ConvertBST_to_BalancedBST {

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

    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
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

    public static void sortedArray(ArrayList<Integer> arr, Node root) {
        if (root == null) {
            return;
        }
        sortedArray(arr, root.left);
        arr.add(root.data);
        sortedArray(arr, root.right);
    }

    public static Node balancedBST(ArrayList<Integer> arr, int si, int ei) {
        int mid = si + (ei - si) / 2;
        if (si > ei) {
            return null;
        }
        Node root = new Node(arr.get(mid));
        root.left = balancedBST(arr, si, mid - 1);
        root.right = balancedBST(arr, mid + 1, ei);
        return root;
    }

    public static void printArray(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }

    public static Node convertBST_to_balancedBST(Node root) {
        ArrayList<Integer> arr = new ArrayList<>();

        sortedArray(arr, root);

        // printArray(arr);
        return balancedBST(arr, 0, arr.size() - 1);
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
        int arr[] = { 8, 6, 10, 5, 11, 3, 12 };
        Node root = null;
        for (int i = 0; i < arr.length; i++) {
            root = buildBST(root, arr[i]);
        }
        // inOrder(root);
        levelOrder(root);
        System.out.println();
        root = convertBST_to_balancedBST(root);
        // inOrder(root);
        levelOrder(root);
    }
}

/*
 * Output:
 * 8
 * 6 10
 * 5 11
 * 3 12
 * 
 * 8
 * 5 11
 * 3 6 10 12
 * 
 */