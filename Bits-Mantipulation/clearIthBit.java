/*
 *       Clear ith bit
 *       n=10 = 00001010    , i=1
 *       o/p = 00001000 =(8)
 */

public class clearIthBit {
    
    public static int clearBit(int n, int i){
     int bitMask= ~(1<<i);
     return n&bitMask;
    }

    public static void main(String[] args) {
        int n=10;
        int i=1;
        System.out.println(clearBit(n,i));
    }
}
