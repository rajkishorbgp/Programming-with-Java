/*
 *     Max Subarray Sum
 * 
 *    array-> {1,-2,6,-1,3}
 * 
 *    using kadane`s Algorithm
 */


public class MaxSubarraySumKadaneAlgorithm {
    
    public static void maxSubarraySum(int array[]) {
        int currentSum=0 , max=Integer.MIN_VALUE;
        for(int i=0; i<array.length; i++){
            currentSum+=array[i];
            if(currentSum<0){
                currentSum=0;
            }
            max=Math.max(currentSum , max);
        }
        System.out.println("Max Subarray Sum: " + max);
    }

    public static void main(String[] args) {
        int array[]={1,-2,6,-1,3};
        maxSubarraySum(array);
    }
}


/*
 *   Output:
 *   Max Subarray Sum: 8
 */