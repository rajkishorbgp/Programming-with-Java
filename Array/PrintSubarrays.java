import javax.lang.model.element.Element;

/*
 *       Print Subarrays
 *     Subarrays --> a continuous part of array
 *  
 *    Ex-> Array= {2,4,6,8,10};
 *   
 *  --> { 2 }  { 2 4 }  { 2 4 6 }  { 2 4 6 8 }  { 2 4 6 8 10 }  
 *      { 4 }  { 4 6 }  { 4 6 8 }  { 4 6 8 10 }  
 *      { 6 }  { 6 8 }  { 6 8 10 }  
 *      { 8 }  { 8 10 }  
 *      { 10 }  
 * 
 */

public class PrintSubarrays {
     
    public static void printSubarrays(int array[]) {
        int smallest =Integer.MAX_VALUE , largest=Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                int sum=0;
                System.out.print("{ ");
                for (int k = i; k <= j; k++) {
                    System.out.print(array[k] + " ");
                    sum+=array[k];
                }
                largest=Math.max(sum,largest);
                smallest=Math.min(sum,smallest);
                System.out.print("}  ");
            }
            System.out.println();
        }
        System.out.println("Smallest sum of Subarray: " + smallest);
        System.out.println("Largest sum of Subarray: " + largest);
    }

    public static void main(String[] args) {
        int array[] = { 2, 4, 6, 8, 10 };
        printSubarrays(array);
    }
}


/*
 *
 *  Output:
 *  { 2 }  { 2 4 }  { 2 4 6 }  { 2 4 6 8 }  { 2 4 6 8 10 }  
 *  { 4 }  { 4 6 }  { 4 6 8 }  { 4 6 8 10 }  
 *  { 6 }  { 6 8 }  { 6 8 10 }  
 *  { 8 }  { 8 10 }  
 *  { 10 }  
 *  Smallest sum of Subarray: 2
 *  Largest sum of Subarray: 30
 * 
 */