public class DiameterOfTree_Approach1 {
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

    public static int diameter(Node root) { // O(n^2)
        if (root == null) {
            return 0;
        }

        int leftDiam = diameter(root.left);
        int leftHt = height(root.left);
        int rightDiam = diameter(root.right);
        int rightHt = height(root.right);
        int selfDiam = leftHt + rightHt + 1;
        return Math.max(selfDiam, Math.max(leftDiam, rightDiam)) + 1;
    }

    public static void main(String[] args) {
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Max diameter of tree : " + diameter(root)); // Max diameter of tree :5

        root.right.right.right = new Node(9);
        root.right.right.right.right = new Node(10);

        System.out.println("Max diameter of tree : " + diameter(root)); // Max diameter of tree : 7
    }
}
