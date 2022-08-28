/*
 *          Get ith bit     
 *       n = 00001111   ->  i=3
 *           o/p =  1 ;     
 */

public class getIthBit {

    public static int getBit(int n, int i){
        int bitMaxk = 1<<i;
        if ((n & bitMaxk)==0) {
            return 0;
        }else{
            return 1;
        }
    }

    public static void main(String[] args) {
        int n=15;
        int i=3;
        System.out.println(getBit(n, i));
    }
}
