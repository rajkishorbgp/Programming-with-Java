/*
 *        String Compression
 *    "aaabbcccdd"  -> "a3b2c3d2"  
 */

public class StringCompression {
    public static StringBuilder compression(StringBuilder str){
        StringBuilder newStr = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            int count =1;
            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
                i++;
                count++;
            }
            newStr.append(str.charAt(i));
            if (count>1) {
                newStr.append(count);
            }
        }
        return newStr;
    } 
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("aaabbcccdd");
        System.out.println(compression(str));
    }
}


/*
 *   Output:
 *   a3b2c3d2
 */