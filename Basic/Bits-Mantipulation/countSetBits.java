/*
 *               Count Set Bit in a Number
 *               10 = 1010 -> setBit=2
 */

public class countSetBits {
    public static int countSetBit(int n){
        int Count=0;
        while(n>0){
            if((n&1)==1){
               Count++;
            }
         n=n>>1;
        }
        return Count;
    }

    public static void main(String[] args) {
        System.out.println(countSetBit(10));
    }
    
}
