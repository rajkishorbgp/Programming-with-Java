/*
 *   Update ith bit
 *  n=10 = 00001010 -[i=2]> 00001110  = (14)
 */

public class updateIthBit {


    public static int updateBit(int n,int i,int newBit){
       if(newBit==0){
        return clearBit(n, i);
       }else{
        return setBit(n, i);
       }
    }

    public static int isUpdateBit(int n,int i, int newBit){
        n=clearBit(n, i);
        return n | (newBit<<i);
    }
    public static void main(String[] args) {
        
        System.out.println(updateBit(10, 2, 1));    
        
        System.out.println(isUpdateBit(10, 2, 1));    
    }

    public static int clearBit(int n,int i){
        int bitMask=~(1<<i);
        return n&bitMask;
    }

    public static int setBit(int n,int i){
        int bitMask=1<<i;
        return n|bitMask;
    }
}
