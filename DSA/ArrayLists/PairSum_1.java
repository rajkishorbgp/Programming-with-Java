/*
 *              Pair Sum -1
 *   Find if any pair in a Sorted ArrayList has a target sum.
 *   list = [1, 2, 3, 4, 5, 6],   target =5
 * 
 *     -->  BRUTE FORCE --[O(n^2)]> all possible  pairs
 */

 import java.util.ArrayList;

public class PairSum_1 {

    public static boolean pairSum(ArrayList<Integer> list , int target){
        for(int i=0; i<list.size()-1; i++){
            for(int j=i+1; j<list.size()-1; j++){
                if(list.get(i) + list.get(j) ==target ){
                    return true;
                }
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;
        if(pairSum(list,target)){
            System.out.println("Yes, target pair sum present in Array list");
        }else{
            System.out.println("No!, target pair sum not present in array list");
        }
    }

}

/*
 *   Output:
 *   Yes, target pair sum present in Array list
 */