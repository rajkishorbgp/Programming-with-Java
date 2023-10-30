public class Substring {

    public static String subString(String str, int st, int ei){
        String subString = "";
        for (int i = st; i < ei; i++) {
            subString+=str.charAt(i);
        }
        return subString;
    }
    public static void main(String[] args) {
        String str = "Hello Rajkishor";

        System.out.println(subString(str, 3, 9));
        System.out.println(str.substring(3,9));
    }
}

/*
 *   Output:
 *   lo Raj
 *   lo Raj
 */