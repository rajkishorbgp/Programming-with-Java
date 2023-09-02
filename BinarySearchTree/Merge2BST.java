/*
 *    @Merge 2 BST
 * 
 */

import java.util.*;
import java.util.LinkedList;

public class Merge2BST {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static ArrayList<Integer> sortedBST(Node root, ArrayList<Integer> array) {
        if (root == null) {
            return array;
        }
        sortedBST(root.left, array);
        array.add(root.data);
        sortedBST(root.right, array);
        return array;
    }

    public static Node balancedBST(Node root, ArrayList<Integer> arr, int si, int ei) {
        if (si > ei) {
            return root;
        }
        int mid = si + (ei - si) / 2;
        root = new Node(arr.get(mid));
        root.left = balancedBST(root.left, arr, si, mid - 1);
        root.right = balancedBST(root.right, arr, mid + 1, ei);
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

    public static Node mergeBST(Node root1, Node root2) {

        // stap1
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1 = sortedBST(root1, arr1);

        // stap2
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2 = sortedBST(root2, arr2);

        // merge array
        ArrayList<Integer> finalArray = new ArrayList<>();
        int i, j;
        i = j = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) <= arr2.get(j)) {
                finalArray.add(arr1.get(i));
                i++;
            } else {
                finalArray.add(arr2.get(j));
                j++;
            }
        }
        while (i < arr1.size()) {
            finalArray.add(arr1.get(i));
            i++;
        }
        while (j < arr2.size()) {
            finalArray.add(arr2.get(j));
            j++;
        }
        Node root = null;
        return balancedBST(root, finalArray, 0, finalArray.size() - 1);
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

    public static void main(String[] args) {

        // BST1
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        // BST2
        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root = mergeBST(root1, root2);

        levelOrder(root);
    }
}

/*
 * Output:
 * 3
 * 1 9
 * 2 4 12
 * 
 */