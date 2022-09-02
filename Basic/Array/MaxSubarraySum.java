/*
 *     Prifix Array
 *     {1,-2,6,-1,3}
 *    
 *    prefix Array={1,-1,5,4,7}
 *   
 */

public class MaxSubarraySum {

    public static void maxSubarraySum(int array[]) {
        int max=Integer.MIN_VALUE;
        int prefix[]=new int[array.length];
        prefix[0]=array[0];

        // Calculate prifixArray
        for(int i=1; i<array.length; i++){
            prefix[i]=array[i]+ prefix[i-1];
        }
        
        // calculate Max Subarray Sum
        for(int i=0; i<array.length; i++){
            for(int j=i; j<array.length; j++){
                int  currSum= i==0?prefix[j] : prefix[j]-prefix[i-1];
                if (max<currSum) {
                    max=currSum;
                }
            }
        }
        System.out.println("Max Subarray Sum: " + max);
    }

    public static void main(String[] args) {
        int array[] = { 1, -2, 6, -1, 3 };
        maxSubarraySum(array);
    }

}


/*
 *    Output:
 *    Max Subarray Sum: 8
 */