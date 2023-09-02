/*
 *                      Pair Sum - 2
 *     Find if any pair in a Sorted & Rotated ArrayList has a target sum.
 *     List = [ 11, 15, 6, 8, 9, 10], target=16
 */

import java.util.ArrayList;
 
public class PairSum_2_RotatedArrayList {
     
     //Brute force
    public static boolean pairSum(ArrayList<Integer> list, int target){
        for(int i=0; i<list.size()-1; i++){
            for (int j =i+1; j <list.size(); j++) {
                if (list.get(i)+list.get(j)==target) {
                    return true;
                    }
                }
            }
            return false;
        }
        
    //  Idea ???!
    public static boolean isPairSum(ArrayList<Integer> list, int target) {
        int n=list.size();
        int bp= -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)>list.get(i+1)) {
                bp=i;
                break;
            }    
        }
        int lp = bp+1; //smallest
        int rp = bp;  //largest
        while (lp != rp) {
            //case1
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            //case2
            if(list.get(lp) + list.get(rp) < target) {
                lp = (lp+1) % n;
            }
            // case 3
            else {
                rp = (n+rp-1) % n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target=16;
        // boolean bruteForce=pairSum(list, target);
        boolean idea=isPairSum(list,target);
        if(idea){
            System.out.println("Target is present in an ArrayList");
        }else{
            System.out.println("Targer is not present in an ArrayList");
        }
    }
}

/*
 *   OutPut
 *   Target is present in an ArrayList
 */