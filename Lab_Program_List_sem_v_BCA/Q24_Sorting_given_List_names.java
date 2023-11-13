/*
 *                                @Program: 24
 *      Write a java program for sorting a given list of names in ascending order.
 */

public class Q24_Sorting_given_List_names {
    public static void sort(String[] list){
        for (int i = 0; i < list.length; i++) {
            int min = i;
            int j = list.length - 1;
            while (j > i) {
                if (list[min].compareTo(list[j])>0) {
                    min = j;
                }
                j--;
            }
            String temp = list[min];
            list[min] = list[i];
            list[i] = temp;
        }
    }

    public static void main(String[] args) {
        String[] nameList = {"Raj kishor", "Manmeet", "Ram", "Palak", "Sonali", "Kajal",
                              "Amaresh", "Yovraj", "Annu Priya"};
        sort(nameList);
        for (int i = 0; i < nameList.length; i++) {
            System.out.println(nameList[i]);
        }
    }
}

/*

Output: 
Amaresh
Annu Priya
Kajal
Manmeet
Palak
Raj kishor
Ram
Sonali
Yovraj

*/