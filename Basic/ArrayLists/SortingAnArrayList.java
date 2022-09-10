/*
 *    Sorting an ArrayList
 *    Collections.sort(<list>);
 */

import java.util.ArrayList;
import java.util.Collections;

public class SortingAnArrayLIst {

   public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();
       list.add(5);
       list.add(1);
       list.add(3);
       list.add(6);
       list.add(0);
       list.add(4);
       System.out.println(list +" \nSort ArrayList");
       Collections.sort(list);
       System.out.println(list);
   }
}

/*
 *   Output
 *   [5, 1, 3, 6, 0, 4] 
 *   Sort ArrayList
 *   [0, 1, 3, 4, 5, 6]
 */