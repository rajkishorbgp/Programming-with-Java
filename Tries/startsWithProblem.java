/*
 *    Create a function boolean startsWith(String prefix) for a trie.
 *    Returns true if there is a previously inserted  string word that has the
 *    prefix true, and false otherwise.
 * 
 *    words[]={"apple", "app", "mango", "man", "woman"}
 * 
 *    prefix="app"  output: true
 *    prefix="moon" output: false
 */

public class startsWithProblem {

    static class Node {
        Node[] children = new Node[26];
        boolean eow;

        Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
                eow = false;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String words) {
        Node currentNode = root;
        for (int i = 0; i < words.length(); i++) {
            int indx = words.charAt(i) - 'a';
            if (currentNode.children[indx] == null) {
                currentNode.children[indx] = new Node();
            }
            currentNode = currentNode.children[indx];
        }
        currentNode.eow = true;
    }

    public static void display(Node root, String ans) {
        if (root == null) {
            return;
        }
        if (root.eow == true) {
            System.out.println(ans);
        }
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                display(root.children[i], ans + (char) (i + 'a'));
            }
        }
    }

    public static boolean startsWith(String prefix) {

        Node currNode = root;
        for (int i = 0; i < prefix.length(); i++) {
            int indx = prefix.charAt(i) - 'a';
            if (currNode.children[indx] == null) {
                return false;
            }
            currNode = currNode.children[indx];
        }
        return true;
    }

    public static void main(String[] args) {
        String words[] = { "apple", "app", "mango", "man", "woman" };
        String prefix1 = "app";
        String prefix2 = "moon";
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        System.out.println(startsWith(prefix1));
        System.out.println(startsWith(prefix2));
    }
}

/*
 * Output:
 * true
 * false
 */