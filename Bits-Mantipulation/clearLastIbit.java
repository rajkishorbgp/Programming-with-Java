/*
 *             Clear Last i bits 
 *    n=15 = 00001111 -[i=2]> 00001100  =(12)
 */

public class clearLastIbit {
    
    public static void main(String[] args) {
    System.out.println(clearLastBit(15,2));    
    }

    public static int clearLastBit(int n, int i){
        int bitMask= -1<<i;   // -1= [11111111] = ~0
        return n&bitMask;
    }
}
