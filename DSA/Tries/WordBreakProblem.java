/*
 *  Given an input string and a dictionary of worlds, find out if the input string
 *  can be broken into a space-separated sequence of dictionary words.
 * 
 *    words[]= {i, like, sam, samsung, mobile, ice}
 *    key = "ilikesamsung"
 *    output: true
 */

public class WordBreakProblem {
    static class Node {
        Node children[] = new Node[26];
        boolean woe;

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node currNode = root;
        for (int i = 0; i < word.length(); i++) {
            int indx = word.charAt(i) - 'a';
            if (currNode.children[indx] == null) {
                currNode.children[indx] = new Node();
            }
            currNode = currNode.children[indx];
        }
        currNode.woe = true;
    }

    public static boolean search(String word) {
        Node currNode = root;
        for (int i = 0; i < word.length(); i++) {
            int indx = word.charAt(i) - 'a';
            if (currNode.children[indx] == null) {
                return false;
            } else {
                currNode = currNode.children[indx];
            }
        }
        return currNode.woe == true;
    }

    public static boolean wordBreak(String key) {
        if (key.length() == 0) {
            return true;
        }
        for (int i = 0; i <= key.length(); i++) {
            // substring(0,1)
            if (search(key.substring(0, i)) && wordBreak(key.substring(i))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String words[] = { "i", "like", "sam", "samsung", "mobile", "ice" };

        String key = "ilikesamsung";

        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        System.out.println(wordBreak(key));
    }
}

/*
 * Output:
 * true
 */