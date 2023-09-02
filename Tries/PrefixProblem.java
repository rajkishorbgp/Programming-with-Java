/*
 *   Find shortest unigue prefix for every word in a given list.
 *   Assume no word is prefix of another.
 * 
 *   arr[] = { "zebra", "dog", "duck", "dove" };
 *   ans -> {"z","dog","du","dov"};
 */

public class PrefixProblem {

    static class Node {
        Node[] children = new Node[26];
        boolean eow;
        int freq;

        Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
            freq = 1;
        }
    }

    public static Node root = new Node();

    static void insert(String word) {
        Node currNode = root;
        for (int i = 0; i < word.length(); i++) {
            int indx = word.charAt(i) - 'a';
            if (currNode.children[indx] == null) {
                currNode.children[indx] = new Node();
            } else {
                currNode.children[indx].freq++;
            }
            currNode = currNode.children[indx];
        }
        currNode.eow = true;
    }

    public static void findPrefix(Node root, String ans) { // O(L) (L-> length of word)
        if (root == null) {
            return;
        }

        if (root.freq == 1) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                findPrefix(root.children[i], ans + (char) (i + 'a'));
            }
        }
    }

    public static void main(String[] args) {
        String arr[] = { "zebra", "dog", "duck", "dove" };
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }

        root.freq = -3;
        findPrefix(root, "");

    }
}

/*
 * Output:
 * dog
 * dov
 * du
 * z
 */