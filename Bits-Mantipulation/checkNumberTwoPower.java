/*
 *    Check if number is a Power of 2 or not
 *      4 = 100 -> (2^2)true
 *      3 = 011 -> false
 */

 
public class checkNumberTwoPower {
    public static boolean checkPower(int n){
        return (n &(n-1))==0 ;
    }

    public static void main(String[] args) {
        System.out.println(checkPower(4));
        System.out.println(checkPower(3));

    }
}



/* 

    Output:

    true
    false

*/