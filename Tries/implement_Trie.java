
public class implement_Trie {

    public static class Node {
        Node children[] = new Node[26];
        boolean eow;

        Node() {
            for (int i = 0; i < 26; i++) {
                this.children[i] = null;
            }
            this.eow = false;
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int indx = word.charAt(level) - 'a';
            if (curr.children[indx] == null) {
                curr.children[indx] = new Node();
            }
            curr = curr.children[indx];
        }
        curr.eow = true;
    }

    public static boolean search(String words) {
        Node curr = root;
        for (int i = 0; i < words.length(); i++) {
            int indx = words.charAt(i) - 'a';
            if (curr.children[indx] == null) {
                return false;
            } else {
                curr = curr.children[indx];
            }
        }
        return curr.eow == true;
    }

    public static void main(String[] args) {
        String words[] = { "the", "a", "there", "their", "any", "thee" };

        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        System.out.println(search("the"));
        System.out.println(search("an"));
    }
}