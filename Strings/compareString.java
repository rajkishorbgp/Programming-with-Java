/*
 *            For a given set of Strings, print the largest string.
 *                   "apple" , "mango" , "banana"
 */

public class compareString {
    public static void main(String[] args) {

        String fruit[]={ "apple" , "mango" , "banana" };
        String largest= fruit[0];
        for(int i=1; i<fruit.length; i++){
    
            if(largest.compareTo(fruit[i])<0){
                largest=fruit[i];
            }
        }
        System.out.println(largest);
    }
}

/*
 *    Output:
 *    mango
 */