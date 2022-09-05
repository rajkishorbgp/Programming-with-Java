/*
 *   Back tracking
 *  
 *   Types of Back tracking
 *   (1) Decision
 *   (2) Optimization
 *   (3) Enumeration
 */

 public class BackTracking {

    public static void changeArray(int arr[], int i , int val){
        
        // base case
        if(i==arr.length){
            printArray(arr);
            return;
        }

        // Recursion(kaam)
        arr[i]=val;
        changeArray( arr , i+1 , val+1 );  //fnx call stap
        arr[i]-=2;  //back tracking stap

    }
    
    public static void printArray(int arr[]){

        for(int i=0; i<arr.length; i++){
            
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int array[]= new int[8];
        changeArray(array,0,1);
        System.out.println();
        printArray(array);
    }
}

/*
 *   Output:
 *   1 2 3 4 5 6 7 8 
 *  -1 0 1 2 3 4 5 6
 */