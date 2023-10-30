/*
 *        Max Subarray Sum(Kadane's Algorithm)
 *        array[]={-2, -3, 4 , -1, 5, -3}
 */

public class KadaneS_Algorithm_MaxSubarraySum {
    public static int kadaneAlgorithm(int array[]){
        int currSum=0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            currSum+=array[i];
            if (currSum<0) {
                currSum=0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int array[] ={-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Max Subarray Sum: "+ kadaneAlgorithm(array)); 
    }
}

/*
 *    Output:
 *    Max Subarray Sum: 7
 */