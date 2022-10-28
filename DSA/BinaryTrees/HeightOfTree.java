public class HeightOfTree {
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

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    public static void main(String[] args) {

        // 1
        // / \
        // 2 3
        // / \ / \
        // 4 5 6 7

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Height of tree : " + height(root)); // Height of tree : 3

        root.right.right.right = new Node(10);
        root.right.right.right.right = new Node(10);

        System.out.println("Height of tree : " + height(root)); // Height of tree : 5
    }
}
