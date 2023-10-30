/*
 *    Count how many times lowercase vowels occurred in a String entered by the user.
 */

public class LowercaseVowelsOccurred {

    public static int countVowels(String str){
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "rajkishor";
        System.out.println(countVowels(str));
    }
}

/*
 *   Output:
 *   3
 */