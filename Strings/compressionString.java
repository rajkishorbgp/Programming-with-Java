import javax.print.StreamPrintService;

/*
 *                String Compression   
 *     "aaabbcccdd"        - >  "a3b2c3d2"
 *     "aaaaabbbcccccc"    - >  "a5b3c6"
 */

public class compressionString {
    public static String compress(String str){
        StringBuilder sb=new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            int count=1;
            while (i<str.length()-1 && str.charAt(i)== str.charAt(i+1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count>1) {
                sb.append(count);
            }
        }
        return sb.toString();
    }
  
    public static void main(String[] args) {
        System.out.println(compress("aaabbcccdd"));
    }

}
