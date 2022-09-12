/*
 *    Container with most mater
 *    -> using 2 pointer approach
 *    height = [1, 8, 6, 2, 5, 4, 8, 3, 7]
 */

 import java.util.ArrayList;

public class ContainerWithMostWater_Using_Two_Pointer_VVI {
    
    public static int storeWater(ArrayList<Integer> height) {
        int maxWater=0;
        int lp=0, rp=height.size()-1;
        while(lp<rp){
            // calculate water area
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp-lp;
            maxWater =Math.max( maxWater , ht*width);

            // update ptr
            if (lp<rp) {
                lp++;
            }else{
                rp--;
            }
        }
       return maxWater; 
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println("Most water: "+ storeWater(height));
    }
}

/*
 *   Output:
 *   Most water: 49
 */