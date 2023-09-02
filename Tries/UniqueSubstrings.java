/*
 *           Problem : Count Unique Substrings
 *   Given a string of length n of lowercase alphabet characters, we need
 *   to count total number of distinct substrings of this string.
 *  
 *   str = "ababa"
 *   ans = 10 
 */

public class UniqueSubstrings {
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

    static Node root = new Node();

    public static void insert(String suffix) {
        Node curr = root;
        for (int i = 0; i < suffix.length(); i++) {
            int indx = suffix.charAt(i) - 'a';
            if (curr.children[indx] == null) {
                curr.children[indx] = new Node();
            }
            curr = curr.children[indx];
        }
        curr.eow = true;
    }

    public static int countSubstring(Node root) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                count += countSubstring(root.children[i]);
            }
        }
        return count + 1;
    }

    public static void main(String[] args) {
        String str = "ababa";
        for (int i = 0; i < str.length(); i++) {
            String suffix = str.substring(i);
            insert(suffix);
        }
        int substring = countSubstring(root);
        System.out.println("Total substring is : " + substring);
    }
}

/*
 * Output:
 * Total substring is : 10
 */