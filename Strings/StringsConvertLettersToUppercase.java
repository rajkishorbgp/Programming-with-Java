/**
 *   For a given String convert each the first letter of each
 *   word to uppercase.
 *  
 *   "hi, i am rajkishor" 
 */

public class StringsConvertLettersToUppercase {
    public static StringBuilder convertFirstLetterOfUppercase(StringBuilder str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb;
    }
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hi, i am rajkishor");
        str = convertFirstLetterOfUppercase(str);
        System.out.println(str);
    }
}

/*
 *   Output:
 *   Hi, I Am Rajkishor
 */