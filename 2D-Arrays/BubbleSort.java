/*
 *     Bubble Sort
 * 
 *     Idea - Large elements come to the end of array by Swapping With adjacent elements
 */

 
public class BubbleSort {

    public static void sortArray(int array[]) {
        for(int i=0; i<array.length-1; i++){
            for(int j=0; j<array.length-i-1; j++){
                if (array[j]>array[j+1]) {
                    int tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                }
            }
        } 
    }

    public static void main(String args[]) {
        int array[]={8,7,6,5,4,3,2,1,0};
        sortArray(array);
        
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    
}

/*
 *    Output:
 *    0 1 2 3 4 5 6 7 8
 */