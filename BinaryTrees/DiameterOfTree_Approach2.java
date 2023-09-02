public class DiameterOfTree_Approach2 {
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

    static class Info {
        int diam;
        int ht;

        Info(int dimt, int ht) {
            this.diam = dimt;
            this.ht = ht;
        }
    }

    public static Info diameter(Node root) {
        if (root == null) {
            return new Info(0, 0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;
        return new Info(diam, ht);
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Max diameter of tree : " + diameter(root).diam); // Max diameter of tree :5
                                                                             //

        root.right.right.right = new Node(9);
        root.right.right.right.right = new Node(10);

        System.out.println("Max diameter of tree : " + diameter(root).diam); // Max diameter of tree : 7
        System.out.println("Max height of tree : " + diameter(root).ht); // Max height of tree : 5
    }
}
