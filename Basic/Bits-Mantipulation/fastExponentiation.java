/*
 *         Fast Exponentiation 
 *          a^n = 5^5 = 3125;
 */

public class fastExponentiation {
    public static int power(int a,int n){
        int ans=1;
        while(n>0){            //  n= [00000101] = 5
            if((n & 1)==1){
                ans=ans*a;     //  ans = 5
            }
            a=a*a;             //  a=25
            n=n>>1;            //  n= [00000010]
        }return ans;           //  ans=3125
    }

    public static void main(String[] args) {
        System.out.println(power(5,5));
    }
}