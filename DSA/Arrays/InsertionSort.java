/*
 *    Insertion Sort
 *    idea -> pick an element (from unsorted part) & place in the right par in sorted part
 */

public class InsertionSort {

    public static void sortArray(int array[]) {
        for(int i=1; i<array.length; i++){
            int curr=array[i];
            int prev=i-1;
            while(prev>=0 && array[prev]>curr){
                array[prev+1]=array[prev];
                prev--;
            }
            // insertion
            array[prev+1]=curr;
        }
        
    }
    public static void main(String[] args) {
        int array[]={5,4,1,3,2};
        sortArray(array);
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}

/*
 *    Output:
 *    1 2 3 4 5
 */