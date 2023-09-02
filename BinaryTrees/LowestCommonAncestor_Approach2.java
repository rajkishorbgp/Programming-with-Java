/*
 *      Lowest Common Ancestor
 */

public class LowestCommonAncestor_Approach2 {

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

    public static Node lca(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }
        Node laftLca = lca(root.left, n1, n2);
        Node rightLca = lca(root.right, n1, n2);
        if (laftLca == null) {
            return rightLca;
        }
        if (rightLca == null) {
            return laftLca;
        }
        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        int n1 = 4, n2 = 5;

        System.out.println(lca(root, n1, n2).data); // 2
    }
}
