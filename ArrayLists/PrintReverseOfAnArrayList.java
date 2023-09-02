/*
 *      Print Reverse of an ArrayList
 *      list = 1,2,3,4,5
 */

 import java.util.ArrayList;

public class PrintReverseOfAnArrayList {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);  // [1, 2, 3, 4, 5]
        System.out.println("Reverse arrayList");
        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i)+ " ");  // 5 4 3 2 1 
        }
    }
}

/*
 *   Output:
 *   [1, 2, 3, 4, 5]
 *   Reverse arrayList
 *   5 4 3 2 1 
 */
