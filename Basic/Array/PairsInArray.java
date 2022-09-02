/*
 *      Pairs in an Array
 * 
 *   Ex- array = {2,4,6,8,10};
 * 
 *  O/P -->  (2,4) (2,6) (2,8) (2,10)
 *           (4,6) (4,8) (4,10)
 *           (6,8) (6,10)
 *           (8,10)   
 */

public class PairsInArray {

    public static int pairsInArray(int array[]) {
        int tp=0;
        for(int i=0; i<array.length; i++){
            // System.out.println("" + array[i]);
            for(int j=i+1; j<array.length; j++){
               System.out.print("(" + array[i] +","+ array[j] + ") ");
               tp++;
            }
            System.out.println();
        }
        return tp;
    }

    public static void main(String[] args) {
        int array[] = {2,4,6,8,10}; 
        int totalPairs=pairsInArray(array);
        System.out.println("Total Pairs: "+totalPairs);   
    }
}


/*
 *   Output:
 *   (2,4) (2,6) (2,8) (2,10) 
 *   (4,6) (4,8) (4,10) 
 *   (6,8) (6,10) 
 *   (8,10) 
 * 
 *   Total Pairs: 10
 */