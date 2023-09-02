/*
 *     Array list
 *   -> dynamic size
 *   -> primitive deta types can't be stored directiy
 * ----------------------------------------------------------------
 *   << Operations >>
 *   -> Add Element
 *   -> Get Element
 *   -> Remove Element
 *   -> Set Element at Index
 *   -> Contains Element 
 */


import java.util.ArrayList;;

public class IntroductionToArrayLists {


    public static void main(String[] args) {
        

        // ClassName objectName = new ClassName();
        ArrayList<Integer> list = new ArrayList<>();  // Integer
        ArrayList<String> list2 = new ArrayList<>();  // String
        ArrayList<Boolean> list3= new ArrayList<>();  // Boolean
    

        // Add Operations
        list.add(1);  // 0(1)
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);    // [1, 2, 3, 4]
        list.add(5);
        System.out.println(list);   // [1, 2, 3, 4, 5]
    
        //Get Operations  -> 0(1)
        int element = list.get(3);
        int ele = list.get(0);
        System.out.println(element); // 4
        System.out.println(ele);     // 1

        // Remove (Delete) Operations
        list.remove(2);
        System.out.println(list);  // [1, 2, 4, 5]


        // Set Oprations
        list.set(2, 8);
        System.out.println(list);  // [1, 2, 8, 5]


        // Contains Oprations
        System.out.println(list.contains(1));  // true
        System.out.println(list.contains(3));  // false

        // Size of ArrayList
        System.out.println(list.size());    // 4
        System.out.println(list2.size());   // 0
        System.out.println(list3.size());  //  0

        // print the arraylist
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");  // 1 2 8 5
        }
        System.out.println();
    }  
}


/*
 *   Output:
 *   [1, 2, 3, 4]
 *   [1, 2, 3, 4, 5]
 *   4
 *   1
 *   [1, 2, 4, 5]
 *   [1, 2, 8, 5]
 *   true
 *   false
 *   4
 *   0
 *   0
 *   1 2 8 5
 */
