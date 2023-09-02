/*
 *     @Problem: Longest word with all prefixes
 *     
 *    find the longest string in words such that every prefix of it is 
 *    also in words.
 * 
 *    words={ "a", "banana", "app", "appl", "ap", "apply", "apple"};
 * 
 *    ans= "apple"
 */

public class LongestWordWithAllPrefixes {
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

    public static void insert(String world) {
        Node curr = root;
        for (int i = 0; i < world.length(); i++) {
            int indx = world.charAt(i) - 'a';
            if (curr.children[indx] == null) {
                curr.children[indx] = new Node();
            }
            curr = curr.children[indx];
        }
        curr.eow = true;
    }

    public static String ans = "";

    public static void longestWord(Node root, StringBuilder temp) {
        if (root == null) {
            return;
        }
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null && root.children[i].eow == true) {
                char ch = (char) (i + 'a');
                temp.append(ch);
                if (temp.length() > ans.length()) {
                    ans = temp.toString();
                }
                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length() - 1); // backtrack
            }
        }
    }

    public static void main(String[] args) {

        String words[] = { "a", "app", "banana", "appl", "ap", "apply", "apple" };

        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }

        longestWord(root, new StringBuilder(""));
        System.out.println(ans);
    }
}

/*
 * Output:
 * apple
 */