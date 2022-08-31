/*
 *    Find the largest and Smallest number in a given array. 
 */

public class FindLargestAndSmallestNumber {
   
    public static int largestNumber( int arr[]) {
        int largest=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        return largest;
    }

    public static int SmallestNumber( int arr[]) {
        int Smallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(Smallest>arr[i]){
                Smallest=arr[i];
            }
        } 
        return Smallest;
    }
    public static void main(String[] args) {
        int array[]={2,4,6,8,5,12,34,1,23,0,32,3};
        System.out.println("Largest Number: " + largestNumber(array));
        System.out.println("Smallest Number: " + SmallestNumber(array));
    }
}

/*
 *     Output:
 *     Largest Number: 34
 *     Smallest Number: 0
 */