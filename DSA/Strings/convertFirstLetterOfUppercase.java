/*
 *      For a given String convert each the first letter of each word to uppercase.
 * 
 *        "hi, i am raj kishor" -> "Hi, I Am Raj Kishor"
 */


public class convertFirstLetterOfUppercase {

    public static String conFirstUppercase(String str){
        StringBuilder sb = new StringBuilder("");
        sb.append(Character.toUpperCase(str.charAt(0)));
        for(int i=1; i<str.length(); i++){
            if (str.charAt(i)==' ') {
                sb.append(str.charAt(i));
                i++;
               sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }            
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(conFirstUppercase("my name is Raj kishor from meerut  a"));
    }
    
}
