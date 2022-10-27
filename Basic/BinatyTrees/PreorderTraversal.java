/**
 * Preorder Traversal
 * -> (i) Root
 * -> (ii) Left Subtree
 * -> (iii) Right Subtree
 */
public class PreorderTraversal {

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

    static class BinaryTree {
        static int idx = -1;

        public Node buildBinaryTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildBinaryTree(nodes);
            newNode.right = buildBinaryTree(nodes);
            return newNode;
        }

        public void preorderTraversal(Node root) {
            if (root == null) {
                System.out.print("-1" + " ");
                return;
            }
            System.out.print(root.data + " ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildBinaryTree(nodes);
        tree.preorderTraversal(root);
    }
}
/*
 * Output:
 * 1 2 4 -1 -1 5 -1 -1 3 -1 6 -1 -1
 */