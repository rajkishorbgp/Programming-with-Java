/*
 *    Given two strings s and t, return true if t is an anagram of s, and
 *    false otherwise. An Anagram is a word or phrase formed by rearranging
 *    the letters of a different word or phrase, typically using all the 
 *    original letters exactly once.  
 * 
 *     s="race" t="care"   -> True
 *     s="heart" t="earth" -> True
 *     s="tulip" t="lipid" -> False
 */

import java.util.*;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (hm.get(ch) != null) {
                if (hm.get(ch) == 1) {
                    hm.remove(ch);
                } else {
                    hm.put(ch, hm.get(ch) - 1);
                }
            } else {
                return false;
            }
        }
        return hm.isEmpty();
    }

    public static void main(String[] args) {
        String s = "knee";
        String t = "keen";

        System.out.println(isAnagram(s, t));
        System.out.println(isAnagram("race", "care"));
        System.out.println(isAnagram("heart", "earth"));
        System.out.println(isAnagram("tulip", "lipid"));

    }
}

/*
 * Output:
 * true
 * true
 * true
 * false
 */