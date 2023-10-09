/*
 *                           @Program: 12
 *         Write a java program to display factors of a number.
 */


 public class Q12_Factors_of_a_number {

    public static void printFactors(int num){
        int i=num;
        while (i>0) {
            if (num%i == 0) {
                System.out.print(i+" ");
            }
            i--;
        }
    }
 
    public static void main(String[] args) {
        int num = 100;
        System.out.println("factors of a number.!");
        printFactors(num);
    }
    
 }

 /*
  *   Output: 
  *   factors of a number.!
  *   100 50 25 20 10 5 4 2 1 
  */