/*
 *                    Determine if 2 Strings are anagrams of each other.
 */

import java.util.Arrays;

public class anagrams {
    public static void main(String[] args) {
        String str1 = "rajkishorbgp";
        String str2 = "kishorbgpraj";
        if (anagrams(str1, str2)) {
            System.out.println("Strings are anagrams.");
        } else {
            System.out.println("Strings are not anagrams.");
        }
    }

    public static Boolean anagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char str3[] = str1.toCharArray();
        char str4[] = str2.toCharArray();
        Arrays.sort(str3);
        Arrays.sort(str4);
        for (int i = 0; i < str3.length; i++) {
            if (str3[i] != str4[i]) {
                return false;
            }
        }
        return true;
    }
}

/*
 * Output:
 * Strings are anagrams.
 */