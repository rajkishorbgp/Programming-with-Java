/*
 *    For a given set of Strings, Print the largest String.
 *    array => "apple", "mango", "banana". 
 */

public class PrintLargestString {
    public static void main(String[] args) {
        String strs[] = {"apple", "mango", "banana"};
        String largeString = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (largeString.compareTo(strs[i]) < 0) {
                largeString = strs[i];
            }
        }
        System.out.println("Largest String : "+ largeString);
    }
}

/*
 *   Output:
 *   Largest String : mango
 */