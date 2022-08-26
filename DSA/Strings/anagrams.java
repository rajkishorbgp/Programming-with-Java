/*
 *                    Determine if 2 Strings are anagrams of each other.
 */

package DSA.Strings;

public class anagrams {
    public static void main(String[] args) {
        String str1="raja";
        String str2="raaj";
        if(anagrams(str1,str2)){
            System.out.println("Strings are anagrams.");
        }
        else{
            System.out.println("Strings are not anagrams.");
        }
        anagrams("raj","aa");
    }   

    public static Boolean anagrams(String str1, String str2){
        return false;
    }
}
