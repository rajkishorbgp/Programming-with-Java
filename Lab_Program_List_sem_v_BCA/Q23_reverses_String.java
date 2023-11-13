/*
 *                      @Program: 23
 *     Write a java program that reverses a given String.
 */
import java.util.Scanner;;
public class Q23_reverses_String {
    public static String reString(String str){
        StringBuilder revStr = new StringBuilder("");
        for (int i = str.length()-1; i >= 0; i--) {
           revStr.append(str.charAt(i));
        }
        return revStr.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the any String: ");
        String str = sc.nextLine();
        sc.close();
        String revStr = reString(str);
        System.out.println("Reverses String: "+ revStr);
    }
}

/*
 *    Output:
 *    Enter the any String: Raj kishor
 *    Reverses String: rohsik jaR
 */